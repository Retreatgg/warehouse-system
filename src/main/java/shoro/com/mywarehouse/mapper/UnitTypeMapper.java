package shoro.com.mywarehouse.mapper;

import org.mapstruct.Mapper;
import shoro.com.mywarehouse.dto.UnitTypeDto;
import shoro.com.mywarehouse.model.UnitType;

@Mapper(componentModel = "spring")
public interface UnitTypeMapper {

    UnitTypeDto toDto(UnitType unitType);
}
