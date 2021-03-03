/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artysan_backend.api_rest.controller;

import com.artysan_backend.api_rest.service.IDireccionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author igorr
 */
@CrossOrigin(origins={"http://10.0.2.4/"})
@RestController
@RequestMapping("/api")
public class DireccionRestController {
    
    private IDireccionService iDireccionServce;
    
}
