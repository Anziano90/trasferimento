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
@Table(name = "moduli", schema = "trasferimento")
public class ModuliEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "descrizione")
    private String descrizione;
    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_studente")
    private StudentiEntity studente;
    @Basic
    @Column(name = "convalidato")
    private Byte convalidato;
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
