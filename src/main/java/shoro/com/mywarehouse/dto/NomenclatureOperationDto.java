package shoro.com.mywarehouse.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NomenclatureOperationDto {

    private Long nomenclatureId;
    private Double quantity;

}
