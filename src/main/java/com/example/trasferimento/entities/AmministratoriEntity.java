package com.example.trasferimento.entities;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "amministratori", schema = "trasferimento", catalog = "")
public class AmministratoriEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "descrizione")
    private String descrizione;
    @Basic
    @Column(name = "nome")
    private String nome;
    @Basic
    @Column(name = "cognome")
    private String cognome;
    @Basic
    @Column(name = "datadinascita")
    private Date datadinascita;
    @Basic
    @Column(name = "luogodinascita")
    private String luogodinascita;
    @Basic
    @Column(name = "cf")
    private String cf;
    @Basic
    @Column(name = "telefono")
    private String telefono;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @UpdateTimestamp
    @Column(name = "last_updated")
    private Timestamp lastUpdated;
    @Basic
    @CreationTimestamp
    @Column(name = "creation_date")
    private Timestamp creationDate;
    @Basic
    @Version
    @Column(name = "version")
    private int version;

}
