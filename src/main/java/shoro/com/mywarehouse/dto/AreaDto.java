package shoro.com.mywarehouse.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AreaDto {

    private Long id;
    private String name;
    private RoomDto room;

}
