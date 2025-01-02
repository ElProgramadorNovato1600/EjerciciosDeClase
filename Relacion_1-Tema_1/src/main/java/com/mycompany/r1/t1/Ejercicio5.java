/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.r1.t1;

import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio5 {

    /* Realiza un programa que lea dos números enteros por teclado y visualice su suma,
     * resta, multiplicación, división, resto división.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.println("ingrese un numero");
        numero1 = teclado.nextInt();

        System.out.println("ingrese un segundo numero");
        numero2 = teclado.nextInt();

        System.out.println("La suma es: " + (numero1 + numero2));
        System.out.println("La resta es: " + (numero1 - numero2));
        System.out.println("La multiplicacion es: " + (numero1 * numero2));
        System.out.println("La division es: " + (numero1 / numero2));

    }
}
