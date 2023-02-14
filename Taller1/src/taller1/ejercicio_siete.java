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
public class ejercicio_siete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        Scanner input = new Scanner(System.in);
        System.out.println("Inserte un numero");
        numero = input.nextInt();
        
        for (int i = 1; i<11; i++) {
            int resultado = numero*i;
            System.out.println("El resultado de "+numero+" x "+i+" es: "+resultado);
            
            
            
            
        }
                
        
        
    }
    
}
