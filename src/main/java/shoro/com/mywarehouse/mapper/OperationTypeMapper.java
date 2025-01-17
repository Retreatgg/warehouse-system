package shoro.com.mywarehouse.mapper;

import org.mapstruct.Mapper;
import shoro.com.mywarehouse.dto.OperationTypeDto;
import shoro.com.mywarehouse.model.OperationType;

@Mapper(componentModel = "spring")
public interface OperationTypeMapper {

    OperationTypeDto toDto(OperationType operationType);
}
