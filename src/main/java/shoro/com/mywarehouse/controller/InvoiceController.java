package shoro.com.mywarehouse.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import shoro.com.mywarehouse.dto.InvoiceDto;
import shoro.com.mywarehouse.service.InvoiceService;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/invoices")
public class InvoiceController {

    private final InvoiceService invoiceService;

    @GetMapping
    public String getInvoices(Model model) {
        List<InvoiceDto> invoiceDtoList = invoiceService.getInvoices();
        model.addAttribute("invoices", invoiceDtoList);
        return "invoices";
    }
}
