/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artysan_backend.api_rest.controller;

import com.artysan_backend.api_rest.entity.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.artysan_backend.api_rest.service.IUsuarioService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author igorr
 */
@CrossOrigin(origins={"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class UsuarioRestController {
    
    @Autowired
    private IUsuarioService usuarioService;
    
    @GetMapping("/usuarios")
    public List<Usuario>index(){
        return usuarioService.findAll();
        
    }
    @GetMapping("/usuarios/{id}")
    public Usuario mostrar(@PathVariable Long id){
        return usuarioService.buscarPorId(id);
    }
    
}
