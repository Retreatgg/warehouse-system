package shoro.com.mywarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shoro.com.mywarehouse.model.Nomenclature;

@Repository
public interface NomenclatureRepository extends JpaRepository<Nomenclature, Long> {
}