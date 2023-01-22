package com.example.trasferimento.entities;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "studenti", schema = "trasferimento", catalog = "")
public class StudentiEntity {
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
    @Column(name = "matricola")
    private String matricola;
    @Basic
    @Column(name = "telefono")
    private String telefono;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "last_updated")
    private Timestamp lastUpdated;
    @Basic
    @Column(name = "creation_date")
    private Timestamp creationDate;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Date getDatadinascita() {
        return datadinascita;
    }

    public void setDatadinascita(Date datadinascita) {
        this.datadinascita = datadinascita;
    }

    public String getLuogodinascita() {
        return luogodinascita;
    }

    public void setLuogodinascita(String luogodinascita) {
        this.luogodinascita = luogodinascita;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Timestamp lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
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

        StudentiEntity that = (StudentiEntity) o;

        if (id != that.id) return false;
        if (version != that.version) return false;
        if (descrizione != null ? !descrizione.equals(that.descrizione) : that.descrizione != null) return false;
        if (nome != null ? !nome.equals(that.nome) : that.nome != null) return false;
        if (cognome != null ? !cognome.equals(that.cognome) : that.cognome != null) return false;
        if (datadinascita != null ? !datadinascita.equals(that.datadinascita) : that.datadinascita != null)
            return false;
        if (luogodinascita != null ? !luogodinascita.equals(that.luogodinascita) : that.luogodinascita != null)
            return false;
        if (cf != null ? !cf.equals(that.cf) : that.cf != null) return false;
        if (matricola != null ? !matricola.equals(that.matricola) : that.matricola != null) return false;
        if (telefono != null ? !telefono.equals(that.telefono) : that.telefono != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (lastUpdated != null ? !lastUpdated.equals(that.lastUpdated) : that.lastUpdated != null) return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (descrizione != null ? descrizione.hashCode() : 0);
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (cognome != null ? cognome.hashCode() : 0);
        result = 31 * result + (datadinascita != null ? datadinascita.hashCode() : 0);
        result = 31 * result + (luogodinascita != null ? luogodinascita.hashCode() : 0);
        result = 31 * result + (cf != null ? cf.hashCode() : 0);
        result = 31 * result + (matricola != null ? matricola.hashCode() : 0);
        result = 31 * result + (telefono != null ? telefono.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (lastUpdated != null ? lastUpdated.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + version;
        return result;
    }
}
