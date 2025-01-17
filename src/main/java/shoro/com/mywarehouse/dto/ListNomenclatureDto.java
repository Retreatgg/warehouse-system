package shoro.com.mywarehouse.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ListNomenclatureDto {

    private Long id;
    private NomenclatureDto nomenclature;
    private Double qty;

}
