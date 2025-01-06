/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t2.libro;

import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio5 {

    /*Escribe una aplicación que solicite por consola dos números reales que corresponden a
      la base y la altura de un triángulo. Deberá mostrarse su área,
      comprobando que los números introducidos por el usuario no son negativos, algo que no tendría sentido.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double base;
        double altura;
        double area;

        System.out.println("ingresa la base");
        base = teclado.nextDouble();

        System.out.println("ingresa la altura");
        altura = teclado.nextDouble();

        if (base > 0 && altura > 0) {
            area = base * altura / 2;
            System.out.println("el area del tringulo es " + area);
        } else {
            System.out.println("has introducido numeros negativos");
        }
    }
}
