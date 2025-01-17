package shoro.com.mywarehouse.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class OperationCreateDto {

    private Long warehouseId;
    private Long operationTypeId;
    private List<NomenclatureOperationDto> nomenclatureOperationDtoList;

}
