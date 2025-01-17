package shoro.com.mywarehouse.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "unit_types")
public class UnitType {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "unit_types_id_gen")
    @SequenceGenerator(name = "unit_types_id_gen", sequenceName = "unit_types_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

}