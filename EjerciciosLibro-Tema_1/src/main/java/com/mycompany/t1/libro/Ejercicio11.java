/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t1.libro;

import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio11 {

    /*Pide dos números al usuario: a y b. Deberá mostrarse true si ambos números son iguales y false en caso contrario.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a;
        int b;

        System.out.println("Introduce un numero");
        a = teclado.nextInt();
        System.out.println("Introduce un numero");
        b = teclado.nextInt();

        System.out.println(a == b); //el operador "==" compara el contenido de ambas variables
        //Devuelve true si ambos contenidos son iguales
    }
}
