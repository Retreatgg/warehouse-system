package shoro.com.mywarehouse.controller.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shoro.com.mywarehouse.dto.OperationCreateDto;
import shoro.com.mywarehouse.dto.OperationDto;
import shoro.com.mywarehouse.service.OperationService;

@RestController("operationRestController")
@RequestMapping("/api/operations")
@RequiredArgsConstructor
public class OperationController {

    private final OperationService operationService;

    @PostMapping()
    public ResponseEntity<OperationDto> createOperation(@RequestBody OperationCreateDto createDto) {
        return ResponseEntity.ok(operationService.createOperation(createDto));
    }

}
