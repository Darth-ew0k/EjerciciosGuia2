/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4Guia1;

import java.util.Scanner;

/**
 *
 * @author lily1
 */
public class Ejercicio4Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float grados;
       float gradosF;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura que desea converitir a F°:");
        
        grados = leer.nextByte();
        
        gradosF = 32+(9*grados/5);
       
        System.out.println("La temperatura en grados F° para "+ grados +" es: "+ gradosF);
        // TODO code application logic here
    }
    
}
