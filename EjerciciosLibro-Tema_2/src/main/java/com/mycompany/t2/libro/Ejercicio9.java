/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t2.libro;

import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio9 {

    /*Crea una aplicación que solicite al usuario cuántos grados tiene un ángulo y muestre el equivalente en radianes.
     Si el ángulo introducido por el usuario no se encuentra en el rango de 0° a 360°, hay que transformarlo a dicho rango.
     Nota: El operador módulo puede ayudarnos a convertir un ángulo a su equivalente en el rango comprendido de 0° a 360°.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double grados;
        double gradosNormales;
        double radianes;

        System.out.println("ingresa los grados");
        grados = teclado.nextDouble();

        gradosNormales = grados % 360;

        if (gradosNormales < 0) {
            gradosNormales = gradosNormales + 360;
        }
        radianes = Math.toRadians(gradosNormales);

        System.out.println(radianes);
    }
}
