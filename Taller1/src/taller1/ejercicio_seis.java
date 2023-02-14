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
public class ejercicio_seis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String password;
        String pass2;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese la contraseña: ");
        password = input.next();
        System.out.println("Inserte nuevamente su contraseña: ");
        pass2 = input.next();
        
        if(pass2.equals(password)){
            System.out.println("La contraseña es correcta");
        }
        
        else {
            System.out.println("La contraseña es incorrecta");
        }
        
        
    }
    
}
