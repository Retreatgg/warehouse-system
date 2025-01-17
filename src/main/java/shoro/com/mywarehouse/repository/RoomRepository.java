package shoro.com.mywarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shoro.com.mywarehouse.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}