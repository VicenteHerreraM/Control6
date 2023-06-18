/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.control6;

import java.util.ArrayList;
import java.util.Scanner;


//El centro medico tiene que dar la orden de mandar una ambulancia a un destino determinado por un usuario (requiere una funcion especifica para esto)
//
/**
 *
 * @author vice1
 */


public class CentroMedico{
    private String nombreCentro;
    private int CoordenadaX ,CoordenadaY; 
    private Ambulancia ambulancia = new Ambulancia();
    private ArrayList<Ambulancia> ambulancias = new ArrayList(); //Cambiar el arrayList por un hashmap

    public CentroMedico(){
        
    }
    
    public CentroMedico(String nombreCentro, int CoordenadaX, int CoordenadaY) {
        this.nombreCentro = nombreCentro;
        this.CoordenadaX = CoordenadaX;
        this.CoordenadaY = CoordenadaY;
    }

    public String getNombreCentro() {
        return nombreCentro;
    }

    public void setNombreCentro(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }

    public int getCoordenadaX() {
        return CoordenadaX;
    }

    public void setCoordenadaX(int CoordenadaX) {
        this.CoordenadaX = CoordenadaX;
    }

    public int getCoordenadaY() {
        return CoordenadaY;
    }

    public void setCoordenadaY(int CoordenadaY) {
        this.CoordenadaY = CoordenadaY;
    }

    public ArrayList<Ambulancia> getAmbulancias() {
        return ambulancias;
    }

    public void setAmbulancias(ArrayList<Ambulancia> ambulancias) {
        this.ambulancias = ambulancias;
    }
    
    public void imprimirAmbulancias(){
        int i;
        String patente;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la patente de la ambulancia que desea ver");
        patente= input.nextLine();
        for(i = 0 ; i < ambulancias.size() ; i++){
            if(ambulancias.get(i).getPatente() == patente){
                System.out.println("Patente");
                System.out.println(ambulancias.get(i).getPatente());
                System.out.println("Capacidad");
                System.out.println(ambulancias.get(i).getCapacidad());
            }
        }
}
    
    public void agregarAmbulancias(){
    String patente;
    int capacidad;
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese los datos de la ambulancia");
    System.out.println("Patente");
    patente = input.nextLine();
    System.out.println("Capacidad");
    capacidad = input.nextInt();
    ambulancias.add(new Ambulancia(patente , capacidad));
    
}
    
    public void modificarAmbulancias(){
    
}
    
    public void eliminarAmbulancias(){
        int i;
        String patente;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la patente de la ambulancia que desea llevar a destino");
        patente = input.nextLine();
        for(i = 0 ; i < ambulancias.size() ; i++){
            if(patente.equals(ambulancias.get(i).getPatente())){
                System.out.println("La ambulancia ha sido eliminada y ya no sera posible usarla por el resto del dia");
                //aca tendria que aplicar una funcion para que la ambulancia pueda moverse con la interface de desplazamiento y luego proceder a eliminarla
                ambulancias.remove(i);
            }else{
                System.out.println("No se elimino la ambulancia porque no se encuentra, verifique la patente");
            }
        }
}

    public boolean disponibilidadAmbulancia(){
        int i;
        String patente;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la patente de la ambulancia que desea llevar a destino");
        patente = input.nextLine();
        for(i = 0 ; i < ambulancias.size() ; i++){
            if(patente.equals(ambulancias.get(i).getPatente())){
                System.out.println("La ambulancia esta disponible, mandandola a destino inmediatamente!");
                //aca tendria que aplicar una funcion para que la ambulancia pueda moverse con la interface de desplazamiento y luego proceder a eliminarla
                ambulancias.remove(i);
                return true;
            }else{
                System.out.println("La ambulancia no esta disponible o se encuentra buscando a alguien, pide otra ambulancia");
            }
        }
            return false;
    }
    
    
    
    public void mostrarMenuAmbulancias(){
        int opcion = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("Que desea hacer con las ambulancias?"); 

        do{
            System.out.println("1- Agregar");
            System.out.println("2- Eliminar");
            System.out.println("3- Modificar");
            System.out.println("4- Imprimir sus datos");
            System.out.println("5- Disponibilidad de una ambulancia");
                try{
                    opcion = Integer.parseInt(input.next());
                    }catch(Exception e){
                    System.out.println("Lo introducido NO es un numero, porfavor, ingrese unicamente el valor numerico entre 1 y 4 que esta asociado en el menu"); 
            }
                    switch(opcion){
                        case 0: 
                            System.out.println("Fin del programa");
                            break;
                        case 1: 
                            agregarAmbulancias();
                            break;
                        case 2:
                            eliminarAmbulancias();
                            break;
                        case 3:
                            modificarAmbulancias();
                            break;
                        case 4:
                            imprimirAmbulancias();
                            break;
                        case 5:
                            disponibilidadAmbulancia();
                        default :
                            System.out.println("No ha ingresado un numero valido");
        }
            }while (opcion!=0);
    }
    
    public void mostrarMenuCasaCentral(){
        int opcion = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("Que desea hacer?"); 

        do{
            System.out.println("1- Administrar ambulancias");
            System.out.println("2- Administrar llamadas");
            System.out.println("3- Modificar");
            System.out.println("4- Imprimir sus datos");
            System.out.println("5- Disponibilidad de una ambulancia");
                try{
                    opcion = Integer.parseInt(input.next());
                    }catch(Exception e){
                    System.out.println("Lo introducido NO es un numero, porfavor, ingrese unicamente el valor numerico entre 1 y 4 que esta asociado en el menu"); 
            }
                    switch(opcion){
                        case 0: 
                            System.out.println("Fin del programa");
                            break;
                        case 1: 
                            mostrarMenuAmbulancias();
                            break;
                        case 2:
                            eliminarAmbulancias();
                            break;
                        case 3:
                            modificarAmbulancias();
                            break;
                        case 4:
                            imprimirAmbulancias();
                            break;
                        case 5:
                            disponibilidadAmbulancia();
                        default :
                            System.out.println("No ha ingresado un numero valido");
        }
            }while (opcion!=0);
    }
    
    
}
