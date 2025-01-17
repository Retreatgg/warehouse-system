package shoro.com.mywarehouse.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "invoice_types")
public class InvoiceType {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "invoice_types_id_gen")
    @SequenceGenerator(name = "invoice_types_id_gen", sequenceName = "invoice_types_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "guid")
    private String guid;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

}