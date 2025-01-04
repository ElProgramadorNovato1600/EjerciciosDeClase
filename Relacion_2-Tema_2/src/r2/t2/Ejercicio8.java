/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package r2.t2;

import java.util.Scanner;

/**
 *
 * @author Antonio Espínola Ramírez
 */
public class Ejercicio8 {

    /*Muestra la tabla de multiplicar de un número introducido por teclado*/

   public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int numero ;

       System.out.println("Ingresa un numero");
       numero = teclado.nextInt();

       System.out.println("Tabla del "+numero);
       for (int i = 0; i <= 10; i++) {
           System.out.println(numero *i);
       }
    }
    
}
