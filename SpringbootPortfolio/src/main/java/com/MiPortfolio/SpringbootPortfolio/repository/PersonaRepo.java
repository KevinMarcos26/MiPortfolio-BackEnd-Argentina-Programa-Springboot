/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MiPortfolio.SpringbootPortfolio.repository;

import com.MiPortfolio.SpringbootPortfolio.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface PersonaRepo extends JpaRepository<Persona, Long> {

    public void deletePersonaById(Long id);

    public Optional <Persona> findPersonaById(Long id);
    
}
