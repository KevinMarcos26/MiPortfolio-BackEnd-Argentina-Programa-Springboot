/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MiPortfolio.SpringbootPortfolio.service;

import com.MiPortfolio.SpringbootPortfolio.Exception.UserNotFoundException;
import com.MiPortfolio.SpringbootPortfolio.model.Proyecto;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.MiPortfolio.SpringbootPortfolio.repository.ProyectoRepo;


@Service
@Transactional
public class ProyectoService {
    
    @Autowired
    private ProyectoRepo proyectoRepo;
    
    public Proyecto addProyecto(Proyecto proyecto){
        return proyectoRepo.save(proyecto);
    }
    
    public List<Proyecto> findAllProyectos(){
        return proyectoRepo.findAll();
    }
    
    public void deleteProyecto(Long id){
        proyectoRepo.deleteProyectoById(id);
    }
    
    public Proyecto findProyectoById(Long id){
        return proyectoRepo.findProyectoById(id).orElseThrow(
            () -> new UserNotFoundException("Proyecto" + id + "no existe"));
    }
    
    public Proyecto editProyecto(Proyecto proyecto) {
        return proyectoRepo.save(proyecto);
    }
    
}