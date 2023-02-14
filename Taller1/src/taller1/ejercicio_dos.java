/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ejercicio_dos {
    
    public static void main(String[] args){
        
        int r_circulo;
        int r_cilindro;
        int h_cilindro;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el radio del círculo: ");
        r_circulo = input.nextInt();
        
        System.out.println("Ingrese el radio del cilindro");
        r_cilindro = input.nextInt();
        
        System.out.println("Ingrese la altura del cilindro");
        h_cilindro = input.nextInt();
        
        double area_cir = (r_circulo*r_circulo)*(3.1416);
        double vol_cil = (r_cilindro*r_cilindro)*(3.1416)*(h_cilindro);
        
        System.out.println("El área del círculo es: "+area_cir+ "m^2");
        System.out.println("El volumen del cilindro es: "+vol_cil+ "m^3");
    
        
        
        
        
      
        
    }
    
}
