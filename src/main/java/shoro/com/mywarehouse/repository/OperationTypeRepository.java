package shoro.com.mywarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shoro.com.mywarehouse.model.OperationType;

@Repository
public interface OperationTypeRepository extends JpaRepository<OperationType, Long> {
}