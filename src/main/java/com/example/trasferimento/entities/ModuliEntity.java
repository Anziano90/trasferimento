package com.example.trasferimento.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "moduli", schema = "trasferimento", catalog = "")
public class ModuliEntity {
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
    @Column(name = "convalidato")
    private Byte convalidato;
    @Basic
    @Column(name = "creation_date")
    private Timestamp creationDate;
    @Basic
    @Column(name = "last_updated")
    private Timestamp lastUpdated;
    @Basic
    @Column(name = "version")
    private int version;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Long getIdStudente() {
        return idStudente;
    }

    public void setIdStudente(Long idStudente) {
        this.idStudente = idStudente;
    }

    public Byte getConvalidato() {
        return convalidato;
    }

    public void setConvalidato(Byte convalidato) {
        this.convalidato = convalidato;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public Timestamp getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Timestamp lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModuliEntity that = (ModuliEntity) o;

        if (id != that.id) return false;
        if (version != that.version) return false;
        if (descrizione != null ? !descrizione.equals(that.descrizione) : that.descrizione != null) return false;
        if (idStudente != null ? !idStudente.equals(that.idStudente) : that.idStudente != null) return false;
        if (convalidato != null ? !convalidato.equals(that.convalidato) : that.convalidato != null) return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (lastUpdated != null ? !lastUpdated.equals(that.lastUpdated) : that.lastUpdated != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (descrizione != null ? descrizione.hashCode() : 0);
        result = 31 * result + (idStudente != null ? idStudente.hashCode() : 0);
        result = 31 * result + (convalidato != null ? convalidato.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (lastUpdated != null ? lastUpdated.hashCode() : 0);
        result = 31 * result + version;
        return result;
    }
}
