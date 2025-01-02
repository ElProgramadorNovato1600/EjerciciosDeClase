/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.r1.t1;

import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */
public class ejercicio4 {
    /* Programa que lea el nombre del usuario que lo está utilizando y a continuación de
     * muestre dicho nombre.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;

        System.out.println("Ingrese su nombre");
        nombre = teclado.nextLine();

        System.out.println("Su nombre es: " + nombre);
    }
}
