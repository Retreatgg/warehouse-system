package shoro.com.mywarehouse.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shoro.com.mywarehouse.dto.InvoiceDto;
import shoro.com.mywarehouse.mapper.InvoiceMapper;
import shoro.com.mywarehouse.model.Invoice;
import shoro.com.mywarehouse.model.Operation;
import shoro.com.mywarehouse.repository.InvoiceRepository;
import shoro.com.mywarehouse.service.InvoiceService;
import shoro.com.mywarehouse.service.InvoiceTypeService;

import java.time.Instant;
import java.util.List;

@Service
@RequiredArgsConstructor
public class InvoiceServiceImpl implements InvoiceService {

    private final InvoiceRepository invoiceRepository;
    private final InvoiceTypeService invoiceTypeService;
    private final InvoiceMapper invoiceMapper;

    @Override
    public List<InvoiceDto> getInvoices() {
        List<Invoice> invoices = invoiceRepository.findAll();
        return invoiceMapper.toListDto(invoices);
    }

    @Override
    public InvoiceDto createInvoice(Operation operation) {
        Invoice invoice = Invoice.builder()
                .date(Instant.now())
                .operation(operation)
                .sourceWarehouse(operation.getWarehouse())
                .targetWarehouse(operation.getWarehouse())
                .invoiceNumber(1L)
                .invoiceType(invoiceTypeService.findById(1L))
                .build();

        invoiceRepository.save(invoice);
        return invoiceMapper.toDto(invoice);
    }


}
