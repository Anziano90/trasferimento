package com.example.trasferimento.repositories;

import com.example.trasferimento.entities.StudentiEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentiRepository extends JpaRepository<StudentiEntity, Long> {

    Optional<StudentiEntity> findById(Long id);

}