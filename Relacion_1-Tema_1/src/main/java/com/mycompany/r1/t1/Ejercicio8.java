/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.r1.t1;

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio8 {
    /*Realiza un programa que muestre las siguientes secuencias de escape
      \b
      \t
      \n
      \f
      \r*/
    public static void main(String[] args) {
        System.out.println("Hola estoy probado secuencias de escape\b"); //borra una palabra
        System.out.println("Hola estoy probado secuencias\t de escape"); //tabulacion
        System.out.println("Hola estoy probado secuencias de escape\n"); //salto de linea
        System.out.println("Hola estoy probado secuencias\f de escape"); //Salto de pagina
        System.out.println("Hola estoy probado secuencias\r de escape"); //Salta a otra linea es lo mismo que \n (solo aceptado en windows) \r (aceptado en linux y windows)
    }
}
