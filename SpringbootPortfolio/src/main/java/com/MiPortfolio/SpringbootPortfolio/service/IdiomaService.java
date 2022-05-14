/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MiPortfolio.SpringbootPortfolio.service;
import com.MiPortfolio.SpringbootPortfolio.Exception.UserNotFoundException;
import com.MiPortfolio.SpringbootPortfolio.model.Idioma;

import com.MiPortfolio.SpringbootPortfolio.repository.IdiomaRepo;


import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class IdiomaService {
    
    @Autowired
    private IdiomaRepo idiomaRepo;
    
    public Idioma addIdioma(Idioma idioma){
        return idiomaRepo.save(idioma);
    }
    
    public List<Idioma> findAllIdiomas(){
        return idiomaRepo.findAll();
    }
    
    public void deleteIdioma(Long id){
        idiomaRepo.deleteIdiomaById(id);
    }
    
    public Idioma findIdiomaById(Long id){
        return idiomaRepo.findIdiomaById(id).orElseThrow(
            () -> new UserNotFoundException("Idioma " + id + "no existe"));
    }
    
    public Idioma editIdioma(Idioma idioma) {
        return idiomaRepo.save(idioma);
    }
}