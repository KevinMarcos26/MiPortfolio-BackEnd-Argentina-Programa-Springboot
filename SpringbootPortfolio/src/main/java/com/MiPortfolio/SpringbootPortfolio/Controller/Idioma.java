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

import com.MiPortfolio.SpringbootPortfolio.model.Idioma;

import com.MiPortfolio.SpringbootPortfolio.service.IdiomaService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping ("/idioma")
public class Idioma {
    
    @Autowired
    private IdiomaService idiomaService;   
    
    @GetMapping
    public ResponseEntity<List<Idioma>> getAllIdiomas(){
        List<Idioma> idioma = idiomaService.findAllIdiomas();
        return new ResponseEntity<>(idioma, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Idioma> addIdioma(@RequestBody Idioma idioma) {
        Idioma newIdioma = idiomaService.addIdioma(idioma);
        return new ResponseEntity<>(newIdioma, HttpStatus.CREATED);
    }

    @PutMapping("/edit")
    public ResponseEntity<Idioma> editIdioma(@RequestBody Idioma idioma) {
        Idioma editIdioma = idiomaService.editIdioma(idioma);
        return new ResponseEntity<>(editIdioma, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteIdioma(@PathVariable("id") Long id) {
        idiomaService.deleteIdioma(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}