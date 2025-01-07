/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t1.libro;

import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio5 {

    /*Dado el siguiente polinomio de segundo grado:
     y = ax² + bx + c
     crea un programa que pida los coeficientes a, b y c, así como el valor de x, y calcula el
     valor correspondiente de y.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a;
        double b;
        double c;
        double raiz;
        double resultado;
        double resultado2;

        System.out.println("Introduce el valor de a");
        a = teclado.nextDouble();
        System.out.println("Introduce el valor de b");
        b = teclado.nextDouble();
        System.out.println("Introduce el valor de c");
        c = teclado.nextDouble();

        raiz = Math.pow(b, 2) - 4 * a * c;
        resultado = -b + Math.sqrt(raiz) / (2 * a);
        resultado2 = -b - Math.sqrt(raiz) / (2 * a);

        System.out.println("Resultado de X1 " + resultado);
        System.out.println("Resultado de X2 " + resultado2);
    }
}
