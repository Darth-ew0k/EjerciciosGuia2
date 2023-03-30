/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5Guia1;

import java.util.Scanner;

/**
 *
 * @author lily1
 */
public class Ejercicio5Guia2{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       double num;
       double doble;
       int raiz;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero a calcular:");
        num = leer.nextFloat();
        
        doble = num+num;
        /* en este caso se utiliza el termino (int) ya que se puede predisponer una conversion*/
        raiz = (int) Math.sqrt(num);
        System.out.println ("El doble de "+ num +" es "+ doble +" y su raiz cuadrada es "+ raiz +".");
        
       
    }
    
}
