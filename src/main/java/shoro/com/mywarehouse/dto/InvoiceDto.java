package shoro.com.mywarehouse.dto;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;
import shoro.com.mywarehouse.model.Operation;
import shoro.com.mywarehouse.model.Warehouse;

import java.time.Instant;

@Data
@Builder
public class InvoiceDto {

    private Long id;
    private InvoiceTypeDto invoiceType;
    private OperationDto operation;
    private Long invoiceNumber;
    private Instant date;
    private WarehouseDto sourceWarehouse;
    private WarehouseDto targetWarehouse;
}
