/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package r2.t2;

/**
 *
 * @author Antonio Espínola Ramírez
 */
public class Ejercicio6 {

    /*Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle do-while.*/

     public static void main(String[] args) {
         
         int numero = 320;
         int contador = 160;

         do {
             System.out.println(numero);
             numero = numero -20;
             contador = contador +20;
         } while (contador <=320);
    }
    
}
