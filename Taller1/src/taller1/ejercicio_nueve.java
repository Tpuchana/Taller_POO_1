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
        
    int num1;
    int num2;
    int mcm;
    int i;
    int a,b;
        
        System.out.println("Ingresar primer numero (Para el MCM): ");
        num1 = input.nextInt();
        
    System.out.println("Ingresar segundo numero (Para el MCM): ");
    num2 = input.nextInt();
        
        mcm=1;
        i=2;
        
        while(i<=num1 || i<=num2){
            if (num1%i==0 || num2%i==0){
                mcm=mcm*i;
                if (num1%i==0) num1=num1/i;
                if (num2%i==0) num2=num2/i;
            }
            else
                i=i+1;
        }
        
        System.out.println("Ingresar primer numero (Para el MCD): ");
        c = input.nextInt();
        
        System.out.println("Ingresar segundo numero (Para el MCD): ");
        d = input.nextInt();
        
        while(a!=b){
            if(a>b)
                a=a-b;
        else 
                b=b-b;
            
            }
  
            System.out.println("El MCM es "+mcm);
            System.out.println("El MCD es "+a);
    }
    
}
