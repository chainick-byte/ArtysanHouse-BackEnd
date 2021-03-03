/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artysan_backend.api_rest.service;

import com.artysan_backend.api_rest.entity.Direccion;
import java.util.List;

/**
 *
 * @author igorr
 */
public interface IDireccionService {
    
    public List<Direccion> findAll();
    
    public Direccion guardarDireccion(Direccion usuario);
    
    public void eliminarDireccion(Long id);
    
    public Direccion buscarPorId(Long id);
    
}
