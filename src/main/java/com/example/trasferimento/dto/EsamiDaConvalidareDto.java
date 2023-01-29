package com.example.trasferimento.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * A DTO for the {@link com.example.trasferimento.entities.EsamiDaConvalidareEntity} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EsamiDaConvalidareDto implements Serializable {
    private long id;
    private String descrizione;
    private Long idModulo;
    private String codice;
    private Date dataSostenimento;
    private Integer voto;
    private Integer cfu;
    private String ssd;
    private Timestamp creationDate;
    private Timestamp lastUpdated;
    private int version;
}