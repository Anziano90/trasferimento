package com.example.trasferimento.repositories;

import com.example.trasferimento.entities.StudentiEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentiRepository extends JpaRepository<StudentiEntity, Long> {
}