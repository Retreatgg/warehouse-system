package shoro.com.mywarehouse.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shoro.com.mywarehouse.dto.WarehouseDto;
import shoro.com.mywarehouse.dto.WarehouseShowDto;
import shoro.com.mywarehouse.mapper.WarehouseMapper;
import shoro.com.mywarehouse.model.Warehouse;
import shoro.com.mywarehouse.repository.WarehouseRepository;
import shoro.com.mywarehouse.service.WarehouseService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WarehouseServiceImpl implements WarehouseService {

    private final WarehouseRepository warehouseRepository;
    private final WarehouseMapper warehouseMapper;

    @Override
    public List<WarehouseShowDto> getAll() {
        List<Warehouse> warehouses = warehouseRepository.findAll();
        return warehouseMapper.toListShowDto(warehouses);
    }

    @Override
    public WarehouseDto getById(Long warehouseId) {
        Warehouse warehouse = findById(warehouseId);
        return warehouseMapper.toDto(warehouse);
    }

    @Override
    public Warehouse findById(Long warehouseId) {
        return warehouseRepository.findById(warehouseId)
                .orElseThrow(() -> new RuntimeException("Warehouse not found"));
    }

}
