package shoro.com.mywarehouse.mapper;

import org.mapstruct.Mapper;
import shoro.com.mywarehouse.dto.NomenclatureDto;
import shoro.com.mywarehouse.dto.UnitTypeDto;
import shoro.com.mywarehouse.model.Nomenclature;

@Mapper(componentModel = "spring", uses = {UnitTypeDto.class, WarehouseMapper.class})
public interface NomenclatureMapper {

    NomenclatureDto toDto(Nomenclature nomenclature);
}
