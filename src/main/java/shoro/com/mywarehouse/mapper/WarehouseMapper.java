package shoro.com.mywarehouse.mapper;

import org.mapstruct.Mapper;
import shoro.com.mywarehouse.dto.WarehouseDto;
import shoro.com.mywarehouse.dto.WarehouseShowDto;
import shoro.com.mywarehouse.model.Warehouse;

import java.util.List;

@Mapper(componentModel = "spring", uses = {AreaMapper.class, UserMapper.class})
public interface WarehouseMapper {

    WarehouseShowDto toShowDto(Warehouse warehouse);
    List<WarehouseShowDto> toListShowDto(List<Warehouse> warehouses);

    WarehouseDto toDto(Warehouse warehouse);
}
