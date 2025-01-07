/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t1.libro;

import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio10 {

    /*Solicita al usuario un número real y calcula su raíz cuadrada. Implementa el programa utilizando
     el nombre cualificado de las clases, en lugar de utilizar ninguna importación.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numeroReal;
        double raiz;

        System.out.println("Introduce un numero real");
        numeroReal = teclado.nextDouble();

        raiz = Math.sqrt(numeroReal);

        System.out.println("La raiz cuadrada de " + numeroReal + " es " + raiz);
    }
}
