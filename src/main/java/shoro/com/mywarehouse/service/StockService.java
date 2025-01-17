package shoro.com.mywarehouse.service;

import shoro.com.mywarehouse.dto.StockDto;

import java.util.List;

public interface StockService {
    List<StockDto> getByWarehouseId(Long warehouseId);
}
