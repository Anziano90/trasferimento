package com.example.trasferimento.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * A DTO for the {@link com.example.trasferimento.entities.PianoDiStudiEntity} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PianoDiStudiDto implements Serializable {
    private long id;
    private String descrizione;
    private Timestamp creationDate;
    private Timestamp lastUpdated;
    private int version;
}