package shoro.com.mywarehouse.mapper;

import org.mapstruct.Mapper;
import shoro.com.mywarehouse.dto.ListNomenclatureDto;
import shoro.com.mywarehouse.model.ListNomenclature;

import java.util.List;

@Mapper(componentModel = "spring", uses = {NomenclatureMapper.class})
public interface ListNomenclatureMapper {

    ListNomenclatureDto toDto(ListNomenclature listNomenclature);
    List<ListNomenclatureDto> toListDto(List<ListNomenclature> listNomenclature);

}
