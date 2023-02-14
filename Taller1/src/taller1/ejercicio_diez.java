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
public class ejercicio_diez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Ingrese un número entero: ");
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
               
        System.out.println("El número "+num1+" en Hexadecimal es:"+resp);
        
              
    
    }
    
}
