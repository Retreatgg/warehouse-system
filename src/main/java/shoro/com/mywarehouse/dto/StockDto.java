package shoro.com.mywarehouse.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StockDto {

    private Long id;
    private NomenclatureDto nomenclature;
    private Double quantity;
    private UnitTypeDto unitType;
    private WarehouseDto warehouse;

}
