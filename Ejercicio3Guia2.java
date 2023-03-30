/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3Guia1;

import java.util.Scanner;

/**
 *
 * @author lily1
 */
public class Ejercicio3Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String frase;
        
        Scanner leer = new Scanner(System.in);
        System.out.println ("Ingresa una frase compleja a replicar:");
        frase = leer.nextLine();
        System.out.println (frase.toUpperCase());
        System.out.println (frase.toLowerCase());
        
        
        
        // TODO code application logic here
    }
    
}
