/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t1.libro;

import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio7 {

    /*Solicita al usuario tres distancias:
     ■ La primera, medida en milímetros.
     ■ La segunda, medida en centímetros.
     ■ La última, medida en metros.
     Diseña un programa que muestre la suma de las tres longitudes introducidas (medida en
     centímetros).*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int milimetros;
        int centimetros;
        int metros;

        System.out.println("Introduce los milimetros");
        milimetros = teclado.nextInt();
        System.out.println("Introduce los centimetros");
        centimetros = teclado.nextInt();
        System.out.println("Introduce los metros");
        metros = teclado.nextInt();

        milimetros = milimetros / 10; // los milimetros los paso a centimetros

        metros = metros * 100; //los metros los paso a centimetros

        centimetros = centimetros + milimetros + metros; //centimetros totales

        System.out.println("Suma total en centimetros " + centimetros);
    }
}
