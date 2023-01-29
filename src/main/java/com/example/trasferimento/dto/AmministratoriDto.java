package com.example.trasferimento.dto;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * A DTO for the {@link com.example.trasferimento.entities.AmministratoriEntity} entity
 */
@Data
public class AmministratoriDto implements Serializable {
    private long id;
    private String descrizione;
    private String nome;
    private String cognome;
    private Date datadinascita;
    private String luogodinascita;
    private String cf;
    private String telefono;
    private String email;
    private Timestamp lastUpdated;
    private Timestamp creationDate;
    private int version;
}