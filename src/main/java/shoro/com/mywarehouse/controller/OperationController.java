package shoro.com.mywarehouse.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import shoro.com.mywarehouse.dto.OperationCreateDto;
import shoro.com.mywarehouse.dto.OperationDto;
import shoro.com.mywarehouse.service.ListNomenclatureService;
import shoro.com.mywarehouse.service.OperationService;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/operations")
public class OperationController {

    private final OperationService operationService;
    private final ListNomenclatureService listNomenclatureService;

    @GetMapping()
    public String getOperations(Model model) {
        List<OperationDto> operations = operationService.getAllOperations();
        model.addAttribute("operations", operations);
        return "operations";
    }

    @PostMapping
    public String createOperation(OperationCreateDto operationCreateDto) {
        operationService.createOperation(operationCreateDto);
        return "redirect:/operations";
    }

    @GetMapping("{id}")
    public String getOperation(Model model, @PathVariable Long id) {
        OperationDto operation = operationService.getOperationById(id);
        model.addAttribute("operation", operation);
        model.addAttribute("nomenclatures", listNomenclatureService.findByOperationId(operation.getId()));
        return "operation";
    }
}
