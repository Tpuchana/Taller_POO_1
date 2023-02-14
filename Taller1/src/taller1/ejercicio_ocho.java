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
public class ejercicio_ocho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        numero = input.nextInt();
        
        for (int altura = 1; altura<=numero; altura++){
            for( int blancos =1; blancos<=numero-altura; blancos++){
                System.out.println(" ");
                
            }
            
            for(int asterisco=1; asterisco<=(altura*2)-1; asterisco++){
                System.out.println("*");
            }
                   
                
            
            
        }
        
       
       
        
    }
    
}
