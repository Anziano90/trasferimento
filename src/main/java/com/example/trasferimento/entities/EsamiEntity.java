package com.example.trasferimento.entities;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "esami", schema = "trasferimento", catalog = "")
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

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public Date getDataSostenimento() {
        return dataSostenimento;
    }

    public void setDataSostenimento(Date dataSostenimento) {
        this.dataSostenimento = dataSostenimento;
    }

    public Integer getVoto() {
        return voto;
    }

    public void setVoto(Integer voto) {
        this.voto = voto;
    }

    public Integer getCfu() {
        return cfu;
    }

    public void setCfu(Integer cfu) {
        this.cfu = cfu;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
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

        EsamiEntity that = (EsamiEntity) o;

        if (id != that.id) return false;
        if (version != that.version) return false;
        if (descrizione != null ? !descrizione.equals(that.descrizione) : that.descrizione != null) return false;
        if (codice != null ? !codice.equals(that.codice) : that.codice != null) return false;
        if (dataSostenimento != null ? !dataSostenimento.equals(that.dataSostenimento) : that.dataSostenimento != null)
            return false;
        if (voto != null ? !voto.equals(that.voto) : that.voto != null) return false;
        if (cfu != null ? !cfu.equals(that.cfu) : that.cfu != null) return false;
        if (ssd != null ? !ssd.equals(that.ssd) : that.ssd != null) return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (lastUpdated != null ? !lastUpdated.equals(that.lastUpdated) : that.lastUpdated != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (descrizione != null ? descrizione.hashCode() : 0);
        result = 31 * result + (codice != null ? codice.hashCode() : 0);
        result = 31 * result + (dataSostenimento != null ? dataSostenimento.hashCode() : 0);
        result = 31 * result + (voto != null ? voto.hashCode() : 0);
        result = 31 * result + (cfu != null ? cfu.hashCode() : 0);
        result = 31 * result + (ssd != null ? ssd.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (lastUpdated != null ? lastUpdated.hashCode() : 0);
        result = 31 * result + version;
        return result;
    }
}
