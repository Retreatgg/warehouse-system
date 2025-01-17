package shoro.com.mywarehouse.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "operation_types")
public class OperationType {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "operation_types_id_gen")
    @SequenceGenerator(name = "operation_types_id_gen", sequenceName = "operation_types_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

}