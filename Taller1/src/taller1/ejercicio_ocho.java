package taller1;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author user
 */
public class ejercicio_ocho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
               System.out.print("Introduzca numero de filas: ");
        int numFilas = input.nextInt();
       
        
 
        System.out.println();
        for(int i = 1; i<=numFilas; i++){
             for(int asteriscos=1; asteriscos<=(i); asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        } 
        
    }
    
}

