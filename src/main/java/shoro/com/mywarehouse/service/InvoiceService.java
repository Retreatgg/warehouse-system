package shoro.com.mywarehouse.service;

import org.springframework.stereotype.Service;
import shoro.com.mywarehouse.dto.InvoiceDto;
import shoro.com.mywarehouse.model.Operation;

import java.util.List;

@Service
public interface InvoiceService{
    List<InvoiceDto> getInvoices();

    InvoiceDto createInvoice(Operation operation);
}
