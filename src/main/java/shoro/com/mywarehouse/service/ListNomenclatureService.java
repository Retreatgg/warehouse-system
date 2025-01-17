package shoro.com.mywarehouse.service;

import org.springframework.stereotype.Service;
import shoro.com.mywarehouse.dto.ListNomenclatureDto;
import shoro.com.mywarehouse.dto.NomenclatureOperationDto;

import java.util.List;

@Service
public interface ListNomenclatureService {
    void createListNomenclature(List<NomenclatureOperationDto> nomenclatureOperationDtoList);

    List<ListNomenclatureDto> findByOperationId(Long operationId);
}
