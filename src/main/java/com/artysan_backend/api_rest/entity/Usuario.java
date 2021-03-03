/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artysan_backend.api_rest.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author igorr
 */
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;
    private String nombre;
    private String primer_apellido;
    private String segundo_apellido;
    private String email;
    private Date created_at;
    private int telefono;
    private String token;
    private String imagen;
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "usuario_rol",
            joinColumns = @JoinColumn(name = "usuario_id"),
            inverseJoinColumns = @JoinColumn(name = "rol_id"))
    private List<Rol> rol = new LinkedList<>();
    
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name="usuario_id")
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Direccion> direccion = new LinkedList<>();
    
    
//    @OneToMany(fetch = FetchType.EAGER)
//    @JoinColumn(name="usuario_id")
//    @Fetch(value = FetchMode.SUBSELECT)
//    private List<Pedido>pedido=new LinkedList<>();
//    
//     public List<Pedido> getPedido() {
//        return pedido;
//    }
//
//    public void setPedido(List<Pedido> pedido) {
//        this.pedido = pedido;
//    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getPhone() {
        return telefono;
    }

    public void setPhone(int phone) {
        this.telefono = phone;
    }

   

    public List<Direccion> getDireccion() {
        return direccion;
    }

    public void setDireccion(List<Direccion> direccion) {
        this.direccion = direccion;
    }

    //aaqui hace falta crear metodo agregar que hace es que se crea el rol nuevo si es vacio
    //-
    //-
    //-
    //-
    public Long getCliente_id() {
        return id_usuario;
    }

    public void setCliente_id(Long cliente_id) {
        this.id_usuario = cliente_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public List<Rol> getRol() {
        return rol;
    }

    public void setRol(List<Rol> rol) {
        this.rol = rol;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

}
