package shoro.com.mywarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shoro.com.mywarehouse.model.UnitType;

@Repository
public interface UnitTypeRepository extends JpaRepository<UnitType, Long> {
}