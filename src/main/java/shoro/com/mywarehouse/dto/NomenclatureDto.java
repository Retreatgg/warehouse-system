package shoro.com.mywarehouse.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NomenclatureDto {

    private Long id;
    private String name;
    private UnitTypeDto unitType;
    private WarehouseDto baseWarehouse;

}
