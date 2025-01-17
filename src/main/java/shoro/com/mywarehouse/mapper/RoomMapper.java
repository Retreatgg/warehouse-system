package shoro.com.mywarehouse.mapper;

import org.mapstruct.Mapper;
import shoro.com.mywarehouse.dto.RoomDto;
import shoro.com.mywarehouse.model.Room;

@Mapper(componentModel = "spring")
public interface RoomMapper {

    RoomDto toDto(Room room);
}
