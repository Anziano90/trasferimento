package com.example.trasferimento.repositories;

import com.example.trasferimento.entities.AmministratoriEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AmministratoriRepository extends JpaRepository<AmministratoriEntity, Long> {

    AmministratoriEntity findByCf(String cf);

}