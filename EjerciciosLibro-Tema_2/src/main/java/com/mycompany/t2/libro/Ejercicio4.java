/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t2.libro;

import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio4 {

    /*Escribe un programa que solicite al usuario un número comprendido entre 1 y 99.
     El programa debe mostrarlo con letras, por ejemplo, para 56, se verá: «cincuenta y seis».*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int unidad; //Separamos la unidad de la varible numero
        int decena; //Separamos la decena de la varible numero
        String cadena1 = null;
        String cadena2 = null;

        System.out.println("ingresa un numero en el rango de 1-99");
        numero = teclado.nextInt();
        if (numero >= 1 && numero <= 99) {
            unidad = numero % 10;
            cadena1 = switch (unidad) {
                case 1 -> "uno";
                case 2 -> "dos";
                case 3 -> "tres";
                case 4 -> "cuatro";
                case 5 -> "cinco";
                case 6 -> "seis";
                case 7 -> "siete";
                case 8 -> "ocho";
                case 9 -> "nueve";
                default -> cadena1;
            };

            decena = numero / 10;
            cadena2 = switch (decena) {
                case 1 -> "diez";
                case 2 -> "veinte";
                case 3 -> "treinta";
                case 4 -> "cuarenta";
                case 5 -> "cincuenta";
                case 6 -> "sesenta";
                case 7 -> "setenta";
                case 8 -> "ochenta";
                case 9 -> "noventa";
                default -> cadena2;
            };
        }

        if (cadena1 != null && cadena2 != null) {
            System.out.println("el numero es " + cadena2 + " y " + cadena1);
        } else if (cadena1 != null) {
            System.out.println("el numero es " + cadena1);
        } else if (cadena2 != null) {
            System.out.println("el numero es " + cadena2);
        }
    }
}
