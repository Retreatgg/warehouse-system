package shoro.com.mywarehouse.service;

import org.springframework.stereotype.Service;
import shoro.com.mywarehouse.model.OperationType;

@Service
public interface OperationTypeService {
    OperationType findById(Long operationTypeId);
}
