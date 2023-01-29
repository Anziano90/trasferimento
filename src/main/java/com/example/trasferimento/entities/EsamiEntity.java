package com.example.trasferimento.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "esami", schema = "trasferimento")
public class EsamiEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "descrizione")
    private String descrizione;
    @Basic
    @Column(name = "codice")
    private String codice;
    @Basic
    @Column(name = "data_sostenimento")
    private Date dataSostenimento;
    @Basic
    @Column(name = "voto")
    private Integer voto;
    @Basic
    @Column(name = "cfu")
    private Integer cfu;
    @Basic
    @Column(name = "ssd")
    private String ssd;
    @Basic
    @CreationTimestamp
    @Column(name = "creation_date")
    private Timestamp creationDate;
    @Basic
    @UpdateTimestamp
    @Column(name = "last_updated")
    private Timestamp lastUpdated;
    @Basic
    @Version
    @Column(name = "version")
    private int version;
    @OneToMany(mappedBy = "esame")
    @JsonBackReference
    private List<EsamiPdsEntity> listaEsamiInseritiInPianoDiStudi;

}
