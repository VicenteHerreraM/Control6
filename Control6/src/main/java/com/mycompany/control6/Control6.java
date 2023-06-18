/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.control6;

import java.util.Scanner;

/**
 *
 * @author vice1
 */
public class Control6 {

    public static void main(String[] args) {
        int opcion = -1;
        CentroMedico casaCentral = new CentroMedico();
        Usuario usuarios = new Usuario();
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("1- Centro Medico");
            System.out.println("2- Cosos");
            System.out.println("3- Llamadas");
            System.out.println("4- Usuarios");
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
                            casaCentral.mostrarMenuCasaCentral();
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            usuarios.mostrarMenuUsuarios();
                            break;
                        default :
                            System.out.println("No ha ingresado un numero valido");
        }
            }while (opcion!=0);
    }
}
