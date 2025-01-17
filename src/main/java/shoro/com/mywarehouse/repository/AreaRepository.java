package shoro.com.mywarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shoro.com.mywarehouse.model.Area;

@Repository
public interface AreaRepository extends JpaRepository<Area, Long> {
}