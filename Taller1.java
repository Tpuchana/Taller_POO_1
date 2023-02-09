/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller1;

import java.util.Scanner;



/**
 *
 * @author SALA
 */
public class Taller1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
       String Nombre;
       int Edad;
       String Ciudad;
       boolean MayorEdad;
       float Estatura;
       String Universidad_estudia;
       Scanner input = new Scanner(System.in);
               
       System.out.println("Ingrese su nombre: ");
       Nombre = input.nextLine();
       
       System.out.println("Ingrese su edad: ");
       Edad = input.nextInt();
       
       System.out.println("Ingrese su ciudad: ");
       Ciudad = input.next();
       
       if (Edad >17){
           MayorEdad = true;
       }
       
       System.out.println("Ingrese su estatura: ");
       Estatura = input.nextFloat();
       
       System.out.println("Ingrese la universidad donde estudia: ");
       Universidad_estudia = input.next();
       
        System.out.println("Hola mi nombre es "+ Nombre + 
                "\n tengo " + Edad + "años, vivo en " + Ciudad+
                " y mido " + Estatura + "m ");
       }
       
       
       
       
    
    }
    

