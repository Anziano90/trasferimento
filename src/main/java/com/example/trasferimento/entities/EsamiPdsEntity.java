package com.example.trasferimento.entities;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "esami_pds", schema = "trasferimento")
public class EsamiPdsEntity {

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic
    @Column(name = "id_esame")
    private long idEsame;
    @Basic
    @Column(name = "id_pds")
    private long idPds;
    @Basic
    @Column(name = "descrizione")
    private String descrizione;
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

}
