/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.control6;

/**
 *
 * @author vice1
 */
public abstract class Persona {
    private String nombre; 
    private String apellido; 
    private int id; 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Persona(String nombre, String apellido, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }
    
    public Persona(){
    
}
    
    public abstract void imprimirUsuario();
    public abstract void modificarUsuario();
    public abstract void eliminarUsuario();
    public abstract void agregarUsuario();
    
}
