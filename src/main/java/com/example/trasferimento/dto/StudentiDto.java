package com.example.trasferimento.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * A DTO for the {@link com.example.trasferimento.entities.StudentiEntity} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentiDto implements Serializable {
    private long id;
    private String descrizione;
    private String nome;
    private String cognome;
    private Date datadinascita;
    private String luogodinascita;
    private String cf;
    private String matricola;
    private String telefono;
    private String email;
    private Timestamp lastUpdated;
    private Timestamp creationDate;
    private int version;
}