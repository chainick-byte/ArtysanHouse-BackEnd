/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artysan_backend.api_rest.service;

import com.artysan_backend.api_rest.entity.Usuario;
import com.artysan_backend.api_rest.modelDAO.iUsuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author igorr
 */
@Service
public class UsuarioServiceImpl implements IUsuarioService{

    @Autowired
    private iUsuario iUsuario;
    
    @Override
    @Transactional(readOnly = true)
    public List<Usuario> findAll() {
        return (List<Usuario>)iUsuario.findAll();
    }

    @Override
    @Transactional
    public Usuario guardarUsuario(Usuario usuario) {
        return iUsuario.save(usuario);
    }

    @Override
    @Transactional
    public void eliminarUsuario(Long id) {
    
         iUsuario.deleteById(id);
    }
    

    @Override
    @Transactional(readOnly = true)
    public Usuario buscarPorId(Long id) {
        return iUsuario.findById(id).orElse(null);
    }
    
}
