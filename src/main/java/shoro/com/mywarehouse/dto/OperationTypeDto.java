package shoro.com.mywarehouse.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OperationTypeDto {

    private Long id;
    private String name;

}
