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
@Table(name = "piano_di_studi", schema = "trasferimento")
public class PianoDiStudiEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "descrizione")
    private String descrizione;
    @Basic
    @Column(name = "id_studente")
    private Long idStudente;
    @Basic
    @Column(name = "id_amministratore")
    private Long idAmministratore;
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

    @OneToMany(mappedBy = "pds", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EsamiPdsEntity> listaEsamiPds = new ArrayList<>();

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_amministratore")
    private AmministratoriEntity amministratore;

}
