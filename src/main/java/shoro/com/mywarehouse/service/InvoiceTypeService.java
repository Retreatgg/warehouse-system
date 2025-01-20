package shoro.com.mywarehouse.service;

import shoro.com.mywarehouse.model.InvoiceType;

public interface InvoiceTypeService {
    InvoiceType findById(Long invoiceTypeId);
}
