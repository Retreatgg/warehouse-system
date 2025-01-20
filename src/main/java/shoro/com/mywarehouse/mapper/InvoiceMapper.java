package shoro.com.mywarehouse.mapper;

import org.mapstruct.Mapper;
import shoro.com.mywarehouse.dto.InvoiceDto;
import shoro.com.mywarehouse.model.Invoice;

import java.util.List;

@Mapper(componentModel = "spring", uses = {
        InvoiceTypeMapper.class, WarehouseMapper.class, OperationMapper.class
})
public interface InvoiceMapper {

    InvoiceDto toDto(Invoice invoice);
    List<InvoiceDto> toListDto(List<Invoice> invoices);

}
