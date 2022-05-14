/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MiPortfolio.SpringbootPortfolio.repository;

import com.MiPortfolio.SpringbootPortfolio.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ProyectoRepo extends JpaRepository<Proyecto, Long> {

    public void deleteProyectoById(Long id);

    public Optional <Proyecto> findProyectoById(Long id);
    
}