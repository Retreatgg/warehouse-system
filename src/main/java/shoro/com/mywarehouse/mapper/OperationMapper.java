package shoro.com.mywarehouse.mapper;

import org.mapstruct.Mapper;
import shoro.com.mywarehouse.dto.OperationDto;
import shoro.com.mywarehouse.model.Operation;

import java.util.List;

@Mapper(componentModel = "spring", uses = {OperationTypeMapper.class, WarehouseMapper.class})
public interface OperationMapper {

    OperationDto toDto(Operation operation);
    List<OperationDto> toListDto(List<Operation> operations);

}
