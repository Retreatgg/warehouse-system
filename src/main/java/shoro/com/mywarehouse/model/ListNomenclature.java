package shoro.com.mywarehouse.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Builder
@Table(name = "list_nomenclatures")
@AllArgsConstructor
@NoArgsConstructor
public class ListNomenclature {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "list_nomenclatures_id_gen")
    @SequenceGenerator(name = "list_nomenclatures_id_gen", sequenceName = "list_nomenclatures_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "nomenclature_id", nullable = false)
    private Nomenclature nomenclature;

    @Column(name = "qty")
    private Double qty;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "operation_id", nullable = false)
    private Operation operation;

}