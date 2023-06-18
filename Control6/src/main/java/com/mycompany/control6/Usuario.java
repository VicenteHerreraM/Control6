/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.control6;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author vice1
 */
public class Usuario extends Persona{
    private int cordenadaX , cordenadaY;
    private ArrayList<Usuario> usuarios = new ArrayList();

    public int getCordenadaX() {
        return cordenadaX;
    }

    public void setCordenadaX(int cordenadaX) {
        this.cordenadaX = cordenadaX;
    }

    public int getCordenadaY() {
        return cordenadaY;
    }

    public void setCordenadaY(int cordenadaY) {
        this.cordenadaY = cordenadaY;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public Usuario(int cordenadaX, int cordenadaY, String nombre, String apellido, int id) {
        super(nombre, apellido, id);
        this.cordenadaX = cordenadaX;
        this.cordenadaY = cordenadaY;
    }

    public Usuario(int cordenadaX, int cordenadaY) {
        this.cordenadaX = cordenadaX;
        this.cordenadaY = cordenadaY;
    }
    
    public Usuario(){
        
    }

    @Override
    public void agregarUsuario() {
        String nombre , apellido;
        int cordenadaX , cordenadaY , id;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese los datos del usuario para registrarlo en el sistema");
        System.out.println("Nombre");
        nombre = input.next();
        System.out.println("Apellido");
        apellido = input.next();
        System.out.println("ID");
        id = input.nextInt();
        System.out.println("Ubicacion en X");
        cordenadaX = input.nextInt();
        System.out.println("Ubicacion en Y");
        cordenadaY = input.nextInt();
        usuarios.add(new Usuario(cordenadaX , cordenadaY , nombre , apellido , id));
        
    }

    @Override
    public void modificarUsuario() {
        String nombre , apellido;
        int cordenadaX , cordenadaY , id , i;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el id de la persona la cual quiera modificar sus datos");
        id = input.nextInt();
        for(i = 0 ; i < usuarios.size() ; i++){
            if(id == usuarios.get(i).getId())
                System.out.println("Ingrese nuevamente los datos del usuario para modificarlo en el sistema");
                System.out.println("Nombre");
                nombre = input.next();
                System.out.println("Apellido");
                apellido = input.next();
                System.out.println("ID");
                id = input.nextInt();
                System.out.println("Ubicacion en X");
                cordenadaX = input.nextInt();
                System.out.println("Ubicacion en Y");
                cordenadaY = input.nextInt();
        
                }
    }

    @Override
    public void eliminarUsuario() {
        int i , id;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el id del usuario que desea eliminar del sistema");
        id = input.nextInt();
        for(i = 0 ; i < usuarios.size() ; i++){
            if(usuarios.get(i).getId() == id){
                usuarios.remove(i);
                System.out.println("El usuario ha sido elminado");
            }
        }
    }

    @Override
    public void imprimirUsuario() {
        int i , id;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el id del usuario que desea mostrar en el programa");
        id = input.nextInt();
        for(i = 0 ; i < usuarios.size() ; i++){
            if(usuarios.get(i).getId() == id){
                System.out.println("Nombre");
                System.out.println(usuarios.get(i).getNombre());
                System.out.println("Apellido");
                System.out.println(usuarios.get(i).getApellido());
                System.out.println("ID");
                System.out.println(usuarios.get(i).getId());
                System.out.println("Ubicacion");
                System.out.println(usuarios.get(i).getCordenadaX());
                System.out.println(usuarios.get(i).getCordenadaY());
            }
        }
    }
    
    public void mostrarMenuUsuarios(){
        int opcion = -1;
        CentroMedico casaCentral = new CentroMedico();
        Scanner input = new Scanner(System.in);
        System.out.println("");

        do{
            System.out.println("0- Volver a menu ");
            System.out.println("1- Agregar");
            System.out.println("2- Eliminar");
            System.out.println("3- Mostrar");
            System.out.println("4- Modificar");
                try{
                    opcion = Integer.parseInt(input.next());
                    }catch(Exception e){
                    System.out.println("Lo introducido NO es un numero, porfavor, ingrese unicamente el valor numerico entre 1 y 4 que esta asociado en el menu"); 
            }
                    switch(opcion){
                        case 0:
                            break;
                        case 1:
                            agregarUsuario();
                            break;
                        case 2:
                            eliminarUsuario();
                            break;
                        case 3:
                            imprimirUsuario();
                            break;
                        case 4:
                            modificarUsuario();
                            break;
                        default :
                            System.out.println("No ha ingresado un numero valido");
        }
            }while (opcion!=0);
    }
    
    
    
    
}
    
    

