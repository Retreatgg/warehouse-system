package shoro.com.mywarehouse.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shoro.com.mywarehouse.dto.StockDto;
import shoro.com.mywarehouse.mapper.StockMapper;
import shoro.com.mywarehouse.model.Stock;
import shoro.com.mywarehouse.repository.StockRepository;
import shoro.com.mywarehouse.service.StockService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StockServiceImpl implements StockService {

    private final StockRepository stockRepository;
    private final StockMapper stockMapper;

    @Override
    public List<StockDto> getByWarehouseId(Long warehouseId) {
        List<Stock> stocks = stockRepository.findByWarehouseId(warehouseId);
        return stockMapper.toListDto(stocks);
    }
}
