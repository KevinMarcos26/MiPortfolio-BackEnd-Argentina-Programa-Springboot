/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MiPortfolio.SpringbootPortfolio.service;

import com.MiPortfolio.SpringbootPortfolio.Exception.UserNotFoundException;
import com.MiPortfolio.SpringbootPortfolio.model.Persona;



import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MiPortfolio.SpringbootPortfolio.repository.PersonaRepo;

  

@Service
@Transactional
public class PersonaService {
    
    @Autowired
    private PersonaRepo personaRepo;
    
    public Persona addPersona(Persona persona){
        return personaRepo.save(persona);
    }
    
    public List<Persona> findAllPersonas(){
        return personaRepo.findAll();
    }
    
    public void deletePersona(Long id){
        personaRepo.deletePersonaById(id);
    }
    
    public Persona findPersonaById(Long id){
        return personaRepo.findPersonaById(id).orElseThrow(
            () -> new UserNotFoundException("Persona " + id + "no existe"));
    }
    
    public Persona editPersona(Persona persona) {
        return personaRepo.save(persona);
    }
}