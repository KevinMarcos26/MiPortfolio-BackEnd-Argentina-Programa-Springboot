/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MiPortfolio.SpringbootPortfolio.service;

import com.MiPortfolio.SpringbootPortfolio.Exception.UserNotFoundException;
import com.MiPortfolio.SpringbootPortfolio.model.Skill;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.MiPortfolio.SpringbootPortfolio.repository.SkillRepo;

@Service
@Transactional
public class SkillService {
    
    @Autowired
    private SkillRepo skillRepo;
    
    public Skill addSkill(Skill skill){
        return skillRepo.save(skill);
    }
    
    public List<Skill> findAllSkills(){
        return skillRepo.findAll();
    }
    
    public void deleteSkill(Long id){
        skillRepo.deleteSkillById(id);
    }
    
    public Skill findSkillById(Long id){
        return skillRepo.findSkillById(id).orElseThrow(
            () -> new UserNotFoundException("Skill " + id + "no existe"));
    }
    
    public Skill editSkill(Skill skill) {
        return skillRepo.save(skill);
    }
    
}