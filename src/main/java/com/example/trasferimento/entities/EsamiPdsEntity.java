package com.example.trasferimento.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "esami_pds", schema = "trasferimento", catalog = "")
public class EsamiPdsEntity {
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
    @Column(name = "creation_date")
    private Timestamp creationDate;
    @Basic
    @Column(name = "last_updated")
    private Timestamp lastUpdated;
    @Basic
    @Column(name = "version")
    private int version;

    public long getIdEsame() {
        return idEsame;
    }

    public void setIdEsame(long idEsame) {
        this.idEsame = idEsame;
    }

    public long getIdPds() {
        return idPds;
    }

    public void setIdPds(long idPds) {
        this.idPds = idPds;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
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

        EsamiPdsEntity that = (EsamiPdsEntity) o;

        if (idEsame != that.idEsame) return false;
        if (idPds != that.idPds) return false;
        if (version != that.version) return false;
        if (descrizione != null ? !descrizione.equals(that.descrizione) : that.descrizione != null) return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (lastUpdated != null ? !lastUpdated.equals(that.lastUpdated) : that.lastUpdated != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idEsame ^ (idEsame >>> 32));
        result = 31 * result + (int) (idPds ^ (idPds >>> 32));
        result = 31 * result + (descrizione != null ? descrizione.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (lastUpdated != null ? lastUpdated.hashCode() : 0);
        result = 31 * result + version;
        return result;
    }
}
