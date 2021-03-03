/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artysan_backend.api_rest.service;

import com.artysan_backend.api_rest.entity.Usuario;
import java.util.List;

/**
 *
 * @author igorr
 */
public interface IUsuarioService {

    public List<Usuario> findAll();
    
    public Usuario guardarUsuario(Usuario usuario);
    
    public void eliminarUsuario(Long id);
    
    public Usuario buscarPorId(Long id);
    
}
