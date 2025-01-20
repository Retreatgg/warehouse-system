package shoro.com.mywarehouse.mapper;

import org.mapstruct.Mapper;
import shoro.com.mywarehouse.dto.InvoiceTypeDto;
import shoro.com.mywarehouse.model.InvoiceType;

@Mapper(componentModel = "spring")
public interface InvoiceTypeMapper {

    InvoiceTypeDto toDto(InvoiceType invoiceType);
}
