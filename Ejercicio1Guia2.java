/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuia2;

import java.util.Scanner;

/**
 *
 * @author lily1
 */
public class Ejercicio1Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   int num1;
   int num2;
   int suma;
   Scanner leer = new Scanner(System.in);
   System.out.println ("Ingresa un numero a sumar");
   num1 = leer.nextInt();
   System.out.println ("Ingresa un segundo numero a sumar");
   num2 = leer.nextInt();
   suma = num1+num2;
   System.out.println ( "El resultado es "+ suma +"." );
   
    
    
    }
    
}
