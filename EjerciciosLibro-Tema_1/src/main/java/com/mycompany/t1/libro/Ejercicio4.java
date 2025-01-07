/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t1.libro;

import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio4 {

    /*Crea un programa que pida la base y la altura de un triángulo y muestre su área.*/

    public static void main(String[] args) {
        int base;
        int altura;
        int areaTriangulo;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la base");
        base = teclado.nextInt();

        System.out.println("Introduce la altura");
        altura = teclado.nextInt();

        areaTriangulo = (base * altura) / 2;
        System.out.println("El area del triangulo es " + areaTriangulo);
    }
}
