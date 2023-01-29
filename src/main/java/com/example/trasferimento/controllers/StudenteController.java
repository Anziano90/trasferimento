package com.example.trasferimento.controllers;

import com.example.trasferimento.entities.StudentiEntity;
import com.example.trasferimento.services.StudenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studente")
public class StudenteController {

    @Autowired
    private StudenteService studenteService;

    @GetMapping
    public ResponseEntity getStudenteById(@RequestParam Long id){
        StudentiEntity studente = studenteService.getById(id);
        try {
            if(studente != null){
                return new ResponseEntity<>(studente, HttpStatus.OK);
            }else{
                return new ResponseEntity<>("Nessuno studente trovato", HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping
    public ResponseEntity getStudenteById(){
        List<StudentiEntity> listaStudenti = studenteService.getAll();
        try {
            if(listaStudenti == null || listaStudenti.isEmpty()){
                return new ResponseEntity<>("Nessuno studente trovato", HttpStatus.NOT_FOUND);
            }else{
                return new ResponseEntity<>(listaStudenti, HttpStatus.OK);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity createStudente(@RequestBody StudentiEntity studente){
        try {
            StudentiEntity createdStudente = studenteService.create(studente);
            return new ResponseEntity<>(createdStudente, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping
    public ResponseEntity updateStudente(@RequestBody StudentiEntity studente){
        try {
            StudentiEntity updatedStudente = studenteService.update(studente);
            if (updatedStudente != null) {
                return new ResponseEntity<>(updatedStudente, HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Nessuno studente trovato per l'id specificato", HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping
    public ResponseEntity deleteStudente(@RequestParam Long id){
        try {
            boolean isDeleted = studenteService.delete(id);
            if (isDeleted) {
                return new ResponseEntity<>("Studente eliminato con successo", HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Nessuno studente trovato per l'id specificato", HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
