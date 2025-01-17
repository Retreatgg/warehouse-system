package shoro.com.mywarehouse.dto;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
@Builder
public class OperationDto {


    private Long id;
    private WarehouseDto warehouse;
    private Instant date;
    private OperationTypeDto operationType;
}
