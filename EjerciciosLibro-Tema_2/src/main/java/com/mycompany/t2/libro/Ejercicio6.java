/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t2.libro;

import java.util.Scanner;

/**
 *
* @author Antonio Espinola Ramirez
 */
public class Ejercicio6 {

    /*Utiliza el operador ternario para calcular el valor absoluto de un número que se solicita al usuario por teclado.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        
        System.out.println("ingresa un numero");
        numero = teclado.nextInt();
        
        numero  = (numero <=0) ? numero : numero *(-1);
        
        //Math.abs(numero); devuelve el valor absoluto
        //otra manera de hacerlo.
        
        System.out.println("valor absoluto "+numero);
    }
}
