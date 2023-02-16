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
public class ejercicio_nueve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner input = new Scanner (System.in);
        
    int a;
    int b;
    int mcm;
    int i;
    int c,d;
        
        System.out.println("Ingresar primer numero (Para el MCM): ");
        a = input.nextInt();
        
    System.out.println("Ingresar segundo numero (Para el MCM): ");
    b = input.nextInt();
        
        mcm=1;
        i=2;
        
        while(i<=a || i<=b){
            if (a%i==0 || b%i==0){
                mcm=mcm*i;
                if (a%i==0) a=a/i;
                if (b%i==0) b=b/i;
            }
            else
                i=i+1;
        }
        
        System.out.println("Ingresar primer numero (Para el MCD): ");
        c = input.nextInt();
        
        System.out.println("Ingresar segundo numero (Para el MCD): ");
        d = input.nextInt();
        
        while(c!=d){
            if(c>d)
                c=c-d;
        else 
                d=d-c;
            
            }
  
            System.out.println("El MCM es "+mcm);
            System.out.println("El MCD es "+c);
    }
    
}
