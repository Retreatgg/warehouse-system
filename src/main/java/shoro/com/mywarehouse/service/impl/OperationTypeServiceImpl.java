package shoro.com.mywarehouse.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shoro.com.mywarehouse.model.OperationType;
import shoro.com.mywarehouse.repository.OperationTypeRepository;
import shoro.com.mywarehouse.service.OperationTypeService;

@Service
@RequiredArgsConstructor
public class OperationTypeServiceImpl implements OperationTypeService {

    private final OperationTypeRepository operationTypeRepository;

    @Override
    public OperationType findById(Long operationTypeId) {
        return operationTypeRepository.findById(operationTypeId)
                .orElseThrow(() -> new RuntimeException("Operation type not found"));
    }
}
