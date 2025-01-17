package shoro.com.mywarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shoro.com.mywarehouse.model.InvoiceType;

@Repository
public interface InvoiceTypeRepository extends JpaRepository<InvoiceType, Long> {
}