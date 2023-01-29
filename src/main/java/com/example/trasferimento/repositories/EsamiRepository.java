package com.example.trasferimento.repositories;

import com.example.trasferimento.entities.EsamiEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EsamiRepository extends JpaRepository<EsamiEntity, Long> {
}