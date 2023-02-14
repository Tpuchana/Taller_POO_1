/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller1;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author SALA
 */
public class ejercicio_diez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        /*System.out.println("Ingrese un número entero: ");
        int num1 = input.nextInt();
        int base = 16;
        int modulo;
        int cociente;
        String resp="";
        cociente = num1;
        
        do{
            modulo = cociente%base;
            cociente = cociente/base;
            
            switch (modulo){
                case 0:
                    resp = "0"+resp;
                    break;
                case 1:
                    resp = "1"+resp;
                    break;
                case 2:
                    resp = "2"+resp;
                    break;
                case 3:
                    resp = "3"+resp;
                    break;
                case 4:
                    resp = "4"+resp;
                    break;
                case 5:
                    resp = "5"+resp;
                    break;
                case 6:
                    resp = "6"+resp;
                    break;
                case 7:
                    resp = "7"+resp;
                    break;
                case 8:
                    resp = "8"+resp;
                    break;
                case 9:
                    resp = "9"+resp;
                    break;
                case 10:
                    resp = "A"+resp;
                    break;
                case 11:
                    resp = "B"+resp;
                    break;
                case 12:
                    resp = "C"+resp;
                    break;
                case 13:
                    resp = "D"+resp;
                    break;
                case 14:
                    resp = "E"+resp;
                    break;
                case 15:
                    resp = "F"+resp;
                    break;
               
                    
                
            }
            System.out.println(resp+"///"+ cociente);
        }while (cociente>0);
               
        System.out.println("El número "+num1+" en Hexadecimal es:"+resp);*/
        
        System.out.println("Ingrese un número hexadecimal: ");
        String num1 = input.next();
        int base = 16;
        double resp=0;
        int cont = num1.length();
        char Aux;
        
        for (int i = 0; i< num1.length(); i++){
            Aux = num1.charAt(i);
            switch (Aux){
                case '0' -> resp = resp + 0*(base^cont);
                case '1' -> resp = resp + 1*(base^cont);
                case '2' -> resp = resp + 1*(base^cont);
                case '3' -> resp = resp + 1*(base^cont);
                case '4' -> resp = resp + 1*(base^cont);
                case '5' -> resp = resp + 1*(base^cont);
                case '6' -> resp = resp + 1*(base^cont);
                case '7' -> resp = resp + 1*(base^cont);
                case '8' -> resp = resp + 1*(base^cont);
                case '9' -> resp = resp + 1*(base^cont);
                case 'A' -> resp = resp + 1*(base^cont);
                case 'B' -> resp = resp + 1*(base^cont);
                case 'C' -> resp = resp + 1*(base^cont);
                case 'D' -> resp = resp + 1*(base^cont);
                case 'E' -> resp = resp + 1*(base^cont);
                case 'F' -> resp = resp + 1*(base^cont);
                default -> resp = resp+"";
                    
            }
            cont--;
        }
        
        System.out.println("El número "+num1+" En decimal es: "+resp);
        
        
        
        
       
        
        
              
    
    }
    
}
