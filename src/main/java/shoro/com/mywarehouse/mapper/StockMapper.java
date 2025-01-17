package shoro.com.mywarehouse.mapper;

import org.mapstruct.Mapper;
import shoro.com.mywarehouse.dto.StockDto;
import shoro.com.mywarehouse.model.Stock;

import java.util.List;

@Mapper(componentModel = "spring", uses = {NomenclatureMapper.class, WarehouseMapper.class, UnitTypeMapper.class})
public interface StockMapper {

    StockDto toDto(Stock stock);
    List<StockDto> toListDto(List<Stock> stocks);
}
