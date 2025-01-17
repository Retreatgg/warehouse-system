package shoro.com.mywarehouse.service;

import org.springframework.stereotype.Service;
import shoro.com.mywarehouse.dto.OperationCreateDto;
import shoro.com.mywarehouse.dto.OperationDto;

import java.util.List;

@Service
public interface OperationService {
    List<OperationDto> getAllOperations();
    OperationDto createOperation(OperationCreateDto createDto);

    OperationDto getOperationById(Long id);
}
