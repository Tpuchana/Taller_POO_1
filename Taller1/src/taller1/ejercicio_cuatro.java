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
public class ejercicio_cuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Ingrese un numero entero positivo: ");
    
    int cont = 2, num = input.nextInt(), mod;
    boolean primo = true;
    
    while(primo == true && cont<num){
        mod= num%cont;
        
        if(mod==0){
            primo = false;
        }
        cont++;
    }
    if (primo == true){
        System.out.println("El numero es primo");
    }else{
        System.out.println("El numero no es primo");
    }
        
    }
    
}
