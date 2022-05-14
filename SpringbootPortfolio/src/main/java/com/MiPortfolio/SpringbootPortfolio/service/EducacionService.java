/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MiPortfolio.SpringbootPortfolio.service;

import com.MiPortfolio.SpringbootPortfolio.Exception.UserNotFoundException;
import com.MiPortfolio.SpringbootPortfolio.model.Educacion;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.MiPortfolio.SpringbootPortfolio.repository.EducacionRepo;

@Service
@Transactional
public class EducacionService {
    
    @Autowired
    private EducacionRepo educacionRepo;
    
    public Educacion addEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
    }
    
    public List<Educacion> findAllEducaciones(){
        return educacionRepo.findAll();
    }
    
    public void deleteEducacion(Long id){
        educacionRepo.deleteEducacionById(id);
    }
    
    public Educacion findEducacionById(Long id){
        return educacionRepo.findEducacionById(id).orElseThrow(
            () -> new UserNotFoundException("Educacion " + id + "no existe"));
    }
    
    public Educacion editEducacion(Educacion educacion) {
        try {
            findEducacionById(educacion.getId());
        } catch (Exception e) {
            return new Educacion();
        }
        return educacionRepo.save(educacion);
    }
    
}

