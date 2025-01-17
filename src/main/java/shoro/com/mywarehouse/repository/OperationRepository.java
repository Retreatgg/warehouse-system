package shoro.com.mywarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shoro.com.mywarehouse.model.Operation;

@Repository
public interface OperationRepository extends JpaRepository<Operation, Long> {
}