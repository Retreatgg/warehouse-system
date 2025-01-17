package shoro.com.mywarehouse.dto;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WarehouseDto {

    private Long id;
    private String name;

    @Column(name = "guid")
    private String guid;
    private AreaDto area;
    private UserDto moll;
}
