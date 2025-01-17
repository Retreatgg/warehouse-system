package shoro.com.mywarehouse.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import shoro.com.mywarehouse.dto.WarehouseDto;
import shoro.com.mywarehouse.dto.WarehouseShowDto;
import shoro.com.mywarehouse.service.StockService;
import shoro.com.mywarehouse.service.WarehouseService;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/warehouse")
public class WarehouseController {

    private final WarehouseService warehouseService;
    private final StockService stockService;

    @GetMapping
    public String getWarehousePage(Model model) {
        List<WarehouseShowDto> warehouseShowDtoList = warehouseService.getAll();
        model.addAttribute("warehouses", warehouseShowDtoList);
        return "warehouses";
    }

    @GetMapping("{id}")
    public String getWarehousePage(Model model, @PathVariable Long id) {
        WarehouseDto warehouse = warehouseService.getById(id);
        model.addAttribute("warehouse", warehouse);
        model.addAttribute("stocks", stockService.getByWarehouseId(id));
        return "warehouse";
    }

    @GetMapping("/add")
    public String addWarehousePage() {
        return "receive_nomenclature";
    }

}
