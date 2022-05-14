/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MiPortfolio.SpringbootPortfolio.login;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class LoginService {
    @Autowired
    private LoginRepo loginRepo;
    
    public boolean isUserEnabled(Login login) {
        boolean isUserEnabled = false;
        List<Login> usuarios = loginRepo.findByNombre(login.getNombre());
        if (!usuarios.isEmpty()) {
            Login usuario = usuarios.get(0);
            if (usuario.getPassword().equals(login.getPassword())){
                isUserEnabled = true;
            }
        }
        return isUserEnabled;
    }
    
}