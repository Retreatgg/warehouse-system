package shoro.com.mywarehouse.dto;

import lombok.Builder;
import lombok.Data;
import shoro.com.mywarehouse.model.InvoiceType;
import shoro.com.mywarehouse.model.Operation;
import shoro.com.mywarehouse.model.Warehouse;

@Data
@Builder
public class InvoiceCreateDto {

    private InvoiceType invoiceType;
    private Operation operation;
    private Long invoiceNumber;
    private Warehouse sourceWarehouse;
    private Warehouse targetWarehouse;

}
