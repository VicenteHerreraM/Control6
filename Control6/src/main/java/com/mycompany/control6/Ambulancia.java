/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.control6;

/**
 *
 * @author vice1
 */
public class Ambulancia{
    private String patente;
    private int capacidad;

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Ambulancia(String patente, int capacidad) {
        this.patente = patente;
        this.capacidad = capacidad;
    }
    
    public Ambulancia(){
        
    }
    
    public boolean disponibilidadAmbulancia(){
        
        
        
        
        return false;
    }
}
