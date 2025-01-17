package shoro.com.mywarehouse.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shoro.com.mywarehouse.dto.ListNomenclatureDto;
import shoro.com.mywarehouse.dto.NomenclatureOperationDto;
import shoro.com.mywarehouse.mapper.ListNomenclatureMapper;
import shoro.com.mywarehouse.model.ListNomenclature;
import shoro.com.mywarehouse.repository.ListNomenclatureRepository;
import shoro.com.mywarehouse.service.ListNomenclatureService;
import shoro.com.mywarehouse.service.NomenclatureService;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ListNomenclatureServiceImpl implements ListNomenclatureService {

    private final ListNomenclatureRepository listNomenclatureRepository;
    private final NomenclatureService nomenclatureService;
    private final ListNomenclatureMapper listNomenclatureMapper;

    @Override
    public void createListNomenclature(List<NomenclatureOperationDto> nomenclatureOperationDtoList) {
        List<ListNomenclature> listNomenclatureList = new ArrayList<>(nomenclatureOperationDtoList.size());

        for (NomenclatureOperationDto nomenclatureOperationDto : nomenclatureOperationDtoList) {
            listNomenclatureList.add(create(nomenclatureOperationDto));
        }

        listNomenclatureRepository.saveAll(listNomenclatureList);
    }

    private ListNomenclature create(NomenclatureOperationDto nomenclatureOperationDto) {
       return ListNomenclature.builder()
               .nomenclature(nomenclatureService.findById(nomenclatureOperationDto.getNomenclatureId()))
               .qty(nomenclatureOperationDto.getQuantity())
               .build();
    }

    @Override
    public List<ListNomenclatureDto> findByOperationId(Long operationId) {
        List<ListNomenclature> listNomenclatureList = listNomenclatureRepository.findByOperationId(operationId);
        return listNomenclatureMapper.toListDto(listNomenclatureList);
    }
}
