package shoro.com.mywarehouse.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shoro.com.mywarehouse.dto.OperationCreateDto;
import shoro.com.mywarehouse.dto.OperationDto;
import shoro.com.mywarehouse.mapper.OperationMapper;
import shoro.com.mywarehouse.model.Operation;
import shoro.com.mywarehouse.repository.OperationRepository;
import shoro.com.mywarehouse.service.ListNomenclatureService;
import shoro.com.mywarehouse.service.OperationService;
import shoro.com.mywarehouse.service.OperationTypeService;
import shoro.com.mywarehouse.service.WarehouseService;

import java.time.Instant;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OperationServiceImpl implements OperationService {

    private final OperationRepository operationRepository;
    private final OperationTypeService operationTypeService;
    private final WarehouseService warehouseService;
    private final OperationMapper operationMapper;
    private final ListNomenclatureService listNomenclatureService;

    @Override
    public List<OperationDto> getAllOperations() {
        List<Operation> operationList = operationRepository.findAll();
        return operationMapper.toListDto(operationList);
    }

    @Transactional
    @Override
    public OperationDto createOperation(OperationCreateDto createDto) {
        Operation operation = buildFromCreateDto(createDto);
        operationRepository.save(operation);
        listNomenclatureService.createListNomenclature(createDto.getNomenclatureOperationDtoList());
        return operationMapper.toDto(operation);
    }

    @Override
    public OperationDto getOperationById(Long id) {
        Operation operation = operationRepository
                .findById(id).orElseThrow(() -> new RuntimeException("Operation not found"));
        return operationMapper.toDto(operation);
    }

    private Operation buildFromCreateDto(OperationCreateDto operationCreateDto) {
        return Operation.builder()
                .date(Instant.now())
                .operationType(operationTypeService.findById(operationCreateDto.getOperationTypeId()))
                .warehouse(warehouseService.findById(operationCreateDto.getWarehouseId()))
                .build();
    }
}
