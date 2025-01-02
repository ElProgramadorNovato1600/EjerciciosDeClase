/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.r1.t1;

import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio11 {
    /*Realiza un programa que lea un importe (entero) por teclado y calcule y visualice el
      importe con un 10% de descuento utilizando la expresión:
      importeConDesc = Importe * (90 / 100)
      ¿Se comporta igual que el anterior? ¿Por qué?*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int importe;
        int importeConDescuento;

        System.out.println("Ingresa un importe");
        importe = teclado.nextInt();

        importeConDescuento = importe * (90 / 100);
        System.out.println("El importe con un descuento del 10% es: " + importeConDescuento);

        //No, por que la division es entera, entonces el resultado devuelve 0 y al multiplicar el resultado es 0
        //Siempre devolvera 0
    }
}
