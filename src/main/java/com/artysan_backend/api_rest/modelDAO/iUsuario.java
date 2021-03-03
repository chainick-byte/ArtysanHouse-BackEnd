/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artysan_backend.api_rest.modelDAO;

import com.artysan_backend.api_rest.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author igorr
 */
public interface iUsuario extends CrudRepository<Usuario, Long> {
    
    
}
