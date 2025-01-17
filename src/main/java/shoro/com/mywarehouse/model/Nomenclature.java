package shoro.com.mywarehouse.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "nomenclatures")
public class Nomenclature {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "nomenclatures_id_gen")
    @SequenceGenerator(name = "nomenclatures_id_gen", sequenceName = "nomenclatures_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "guid")
    private String guid;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "base_warehouse_id", nullable = false)
    private Warehouse baseWarehouse;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "unit_type_id", nullable = false)
    private UnitType unitType;

}