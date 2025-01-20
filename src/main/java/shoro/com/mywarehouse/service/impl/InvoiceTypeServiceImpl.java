package shoro.com.mywarehouse.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shoro.com.mywarehouse.model.InvoiceType;
import shoro.com.mywarehouse.repository.InvoiceTypeRepository;
import shoro.com.mywarehouse.service.InvoiceTypeService;

@Service
@RequiredArgsConstructor
public class InvoiceTypeServiceImpl implements InvoiceTypeService {

    private final InvoiceTypeRepository invoiceTypeRepository;

    @Override
    public InvoiceType findById(Long invoiceTypeId) {
        return invoiceTypeRepository.findById(invoiceTypeId).orElseThrow();
    }
}
