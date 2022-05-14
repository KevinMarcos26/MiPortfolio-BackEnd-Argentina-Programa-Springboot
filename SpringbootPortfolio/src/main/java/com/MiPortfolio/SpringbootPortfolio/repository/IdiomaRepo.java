/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.MiPortfolio.SpringbootPortfolio.repository;

import com.MiPortfolio.SpringbootPortfolio.model.Idioma;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IdiomaRepo extends JpaRepository<Idioma, Long> {

    public void deleteIdiomaById(Long id);

    public Optional <Idioma> findIdiomaById(Long id);
    
}