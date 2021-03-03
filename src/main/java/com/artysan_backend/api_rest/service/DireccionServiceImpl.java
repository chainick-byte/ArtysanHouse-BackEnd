/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artysan_backend.api_rest.service;

import com.artysan_backend.api_rest.entity.Direccion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.artysan_backend.api_rest.modelDAO.iDireccion;

/**
 *
 * @author igorr
 */
public class DireccionServiceImpl implements IDireccionService {

    @Autowired
    private iDireccion iDireccion;

    @Override
    public List<Direccion> findAll() {
        return (List<Direccion>) iDireccion.findAll();
    }

    @Override
    public Direccion guardarDireccion(Direccion direccion) {
        return iDireccion.save(direccion);
    }

    @Override
    public void eliminarDireccion(Long id) {
        iDireccion.deleteById(id);
    }

    @Override
    public Direccion buscarPorId(Long id) {
        return iDireccion.findById(id).orElse(null);
    }

}
