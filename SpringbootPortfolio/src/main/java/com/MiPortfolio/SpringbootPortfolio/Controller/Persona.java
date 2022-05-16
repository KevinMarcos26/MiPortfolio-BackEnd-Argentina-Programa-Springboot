/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MiPortfolio.SpringbootPortfolio.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MiPortfolio.SpringbootPortfolio.model.Persona;


import com.MiPortfolio.SpringbootPortfolio.service.PersonaService;

@CrossOrigin(origins = "https://arcane-stack-350307.web.app")
@RestController
@RequestMapping("/home")
public class Persona {
    
    @Autowired
    private PersonaService personaService;   
    
    @GetMapping
    public ResponseEntity<List<Persona>> getAllPersonas(){
        List<Persona> personas = personaService.findAllPersonas();
        return new ResponseEntity<>(personas, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Persona> addPersona(@RequestBody Persona persona) {
        Persona newPersona = personaService.addPersona(persona);
        return new ResponseEntity<>(newPersona, HttpStatus.CREATED);
    }

    @PutMapping("/edit")
    public ResponseEntity<Persona> editPersona(@RequestBody Persona persona) {
        Persona editPersona = personaService.editPersona(persona);
        return new ResponseEntity<>(editPersona, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePersona(@PathVariable("id") Long id) {
        personaService.deletePersona(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
