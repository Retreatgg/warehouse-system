package shoro.com.mywarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shoro.com.mywarehouse.model.ListNomenclature;

import java.util.List;

@Repository
public interface ListNomenclatureRepository extends JpaRepository<ListNomenclature, Long> {

    List<ListNomenclature> findByOperationId(Long operationId);
}