/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MiPortfolio.SpringbootPortfolio.repository;

import com.MiPortfolio.SpringbootPortfolio.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface EducacionRepo extends JpaRepository<Educacion, Long> {

    public void deleteEducacionById(Long id);

    public Optional <Educacion> findEducacionById(Long id);
    
}
