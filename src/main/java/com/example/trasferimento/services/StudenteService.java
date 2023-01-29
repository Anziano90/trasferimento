package com.example.trasferimento.services;

import com.example.trasferimento.entities.StudentiEntity;
import com.example.trasferimento.repositories.StudentiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudenteService {

    @Autowired
    private StudentiRepository studentiRepository;


    public StudentiEntity getById(Long id) {
        return studentiRepository.findById(id).isPresent() ? studentiRepository.findById(id).get() : null;
    }

    public List<StudentiEntity> getAll(){
        return studentiRepository.findAll();
    }

    public StudentiEntity create(StudentiEntity studente) {
        return studentiRepository.save(studente);
    }

    public StudentiEntity update(StudentiEntity studente) {
        Optional<StudentiEntity> studenteToUpdate = studentiRepository.findById(studente.getId());
        if (studenteToUpdate.isPresent()) {
            StudentiEntity updatedStudente = studenteToUpdate.get();
            updatedStudente.setNome(studente.getNome());
            updatedStudente.setCognome(studente.getCognome());
            //TODO: update other fields as needed
            studentiRepository.save(updatedStudente);
            return updatedStudente;
        } else {
            return null;
        }
    }

    public boolean delete(Long id) {
        Optional<StudentiEntity> studenteToDelete = studentiRepository.findById(id);
        if (studenteToDelete.isPresent()) {
            studentiRepository.delete(studenteToDelete.get());
            return true;
        } else {
            return false;
        }
    }

}
