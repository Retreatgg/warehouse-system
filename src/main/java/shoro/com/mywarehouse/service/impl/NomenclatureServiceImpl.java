package shoro.com.mywarehouse.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shoro.com.mywarehouse.model.Nomenclature;
import shoro.com.mywarehouse.repository.NomenclatureRepository;
import shoro.com.mywarehouse.service.NomenclatureService;

@Service
@RequiredArgsConstructor
public class NomenclatureServiceImpl implements NomenclatureService {

    private final NomenclatureRepository nomenclatureRepository;

    @Override
    public Nomenclature findById(Long nomenclatureId) {
        return nomenclatureRepository.findById(nomenclatureId)
                .orElseThrow(() -> new RuntimeException("Nomenclature not found"));
    }
}
