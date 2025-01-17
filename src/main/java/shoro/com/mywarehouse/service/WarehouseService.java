package shoro.com.mywarehouse.service;

import shoro.com.mywarehouse.dto.WarehouseDto;
import shoro.com.mywarehouse.dto.WarehouseShowDto;
import shoro.com.mywarehouse.model.Warehouse;

import java.util.List;

public interface WarehouseService {
    List<WarehouseShowDto> getAll();
    WarehouseDto getById(Long warehouseId);
    Warehouse findById(Long warehouseId);
}
