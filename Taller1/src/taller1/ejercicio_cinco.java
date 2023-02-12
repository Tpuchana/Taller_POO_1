/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ejercicio_cinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        int ingresos;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese su edad: ");
        edad = input.nextInt();
        System.out.println("Ingrese sus ingresos: ");
        ingresos = input.nextInt();
        
        if ((edad > 17) && (ingresos >= 1000)) {
        
        System.out.println("Usted puede tributar");
        
    }
        else if ((edad < 18) || (ingresos < 1000)){
            System.out.println("Usted no puede tributar");
        } 
        
    }
    
}
