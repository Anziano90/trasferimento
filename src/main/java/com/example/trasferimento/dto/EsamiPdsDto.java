package com.example.trasferimento.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * A DTO for the {@link com.example.trasferimento.entities.EsamiPdsEntity} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EsamiPdsDto implements Serializable {
    private Long id;
    private EsamiDto esame;
    private PianoDiStudiDto pianoDiStudi;
    private String descrizione;
    private Timestamp creationDate;
    private Timestamp lastUpdated;
    private int version;
}