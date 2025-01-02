/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.r1.t1;

import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio12 {

    /*En el programa anterior que pasa si ponemos la expresión:
      importeConDesc = Importe * (90f / 100)*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int importe;
        int importeConDescuento;

        System.out.println("Ingresa un importe");
        importe = teclado.nextInt();

        importeConDescuento = (int) (importe * (90f / 100));
        System.out.println("El importe con un descuento del 10% es: " + importeConDescuento);

        //f castea el resultado de la divion a float y luego posterioriormente devuelve 0.9 que se multiplica con el importe
        // Luego se hace un casting a int para que se almacene en una variable de tipo int "ImporteConDescuento"
    }
}
