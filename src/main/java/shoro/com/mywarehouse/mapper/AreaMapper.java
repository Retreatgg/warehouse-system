package shoro.com.mywarehouse.mapper;

import org.mapstruct.Mapper;
import shoro.com.mywarehouse.dto.AreaDto;
import shoro.com.mywarehouse.model.Area;

@Mapper(componentModel = "spring", uses = {RoomMapper.class})
public interface AreaMapper {

    AreaDto toDto(Area area);
}
