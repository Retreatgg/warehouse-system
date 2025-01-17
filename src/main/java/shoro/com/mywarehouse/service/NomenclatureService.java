package shoro.com.mywarehouse.service;

import org.springframework.stereotype.Service;
import shoro.com.mywarehouse.model.Nomenclature;

@Service
public interface NomenclatureService {
    Nomenclature findById(Long nomenclatureId);
}
