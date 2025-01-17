package shoro.com.mywarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shoro.com.mywarehouse.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}