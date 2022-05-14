/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MiPortfolio.SpringbootPortfolio.repository;

import java.util.Optional;
import com.MiPortfolio.SpringbootPortfolio.model.ExpLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpLaboralRepo extends JpaRepository<ExpLaboral, Long> {

    public void deleteExpLaboralById(Long id);

    public Optional <ExpLaboral> findExpLaboralById(Long id);
    
    
}