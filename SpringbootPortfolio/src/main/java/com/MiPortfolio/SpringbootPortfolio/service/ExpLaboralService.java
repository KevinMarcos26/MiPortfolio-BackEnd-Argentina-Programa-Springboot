/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MiPortfolio.SpringbootPortfolio.service;

import com.MiPortfolio.SpringbootPortfolio.Exception.UserNotFoundException;
import com.MiPortfolio.SpringbootPortfolio.model.ExpLaboral;
        
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.MiPortfolio.SpringbootPortfolio.repository.ExpLaboralRepo;

@Service
@Transactional
public class ExpLaboralService {
    
    @Autowired
    private ExpLaboralRepo expLaboralRepo;
    
    public ExpLaboral addExpLaboral(ExpLaboral expLaboral){
        return expLaboralRepo.save(expLaboral);
    }
    
    public List<ExpLaboral> findAllExpLaboral(){
        return expLaboralRepo.findAll();
    }
    
    public void deleteExpLaboral(Long id){
        expLaboralRepo.deleteExpLaboralById(id);
    }
    
    public ExpLaboral findExpLaboralById(Long id){
        return expLaboralRepo.findExpLaboralById(id).orElseThrow(
            () -> new UserNotFoundException("ExpLaboral " + id + "no existe"));
    }
    
    public ExpLaboral editExpLaboral(ExpLaboral expLaboral) {
        return expLaboralRepo.save(expLaboral);
    }
}
