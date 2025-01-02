/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.r1.t1;

import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio7 {

    /*Realiza un programa que lea dos números enteros por pantalla y muestre el
      resultado de las siguientes operaciones relacionales con los dos números:
     Igual
     Distinto
     Menor
     Mayor
     Menor o igual
     Mayor o igual*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.println("ingrese un numero");
        numero1 = teclado.nextInt();

        System.out.println("ingrese un segundo numero");
        numero2 = teclado.nextInt();

        //Compruebo si los numeros son iguales
        if (numero1 == numero2) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

        //Compruebo si los numeros son distintos
        if (numero1 != numero2) {
            System.out.println("Son distintos");
        } else {
            System.out.println("No son distintos");
        }

        //Combruebo que numero es el mayor o menor
        if (numero1 < numero2) {
            System.out.println("el numero " + numero1 + " es menor que " + numero2);
        } else {
            System.out.println("el numero " + numero1 + " es mayor que " + numero2);
        }

        if (numero1 > numero2) {
            System.out.println("el numero " + numero1 + " es mayor que " + numero2);
        } else {
            System.out.println("el numero " + numero1 + " es menor que " + numero2);
        }

        //Combruebo si uno de los numeros es mayor o igual
        //Combruebo si uno de los numeros es menor o igual

        if (numero1 <= numero2) {
            System.out.println("el numero " + numero1 + " es menor o igual que " + numero2);
        } else {
            System.out.println("el numero " + numero1 + " es mayor que " + numero2);
        }

        if (numero1 >= numero2) {
            System.out.println("el numero " + numero1 + " es mayor o igual que " + numero2);
        } else {
            System.out.println("el numero " + numero1 + " es menorr que " + numero2);
        }

    }
}
