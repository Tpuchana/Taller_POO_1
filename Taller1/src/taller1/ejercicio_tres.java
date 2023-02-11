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
public class ejercicio_tres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero: ");
        num = input.nextInt();
        
        if (num%2 == 0) {
            System.out.println("El número es par");
    }
        else if (num%2 == 1) {
            System.out.println("El número es impar");
        }
        
    }
    
}
