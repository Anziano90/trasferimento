package com.example.trasferimento.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * A DTO for the {@link com.example.trasferimento.entities.ModuliEntity} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModuliDto implements Serializable {
    private long id;
    private String descrizione;
    private boolean convalidato;
    private Timestamp creationDate;
    private Timestamp lastUpdated;
    private int version;
}