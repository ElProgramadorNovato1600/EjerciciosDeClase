/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t1.libro;

import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio9 {

    /*Una empresa que gestiona un parque acuático te solicita una aplicación que les ayude a calcular
     el importe que hay que cobrar en la taquilla por la compra de una serie de entradas (cuyo número será introducido
     por el usuario). Existen dos tipos de entrada: infantiles, que cuestan 15,50 €; y de adultos, que cuestan 20 €.
     En el caso de que el importe total sea igual o superior a 100 €, se aplicará automáticamente un bono descuento del 5%.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int entradaInfantil;
        int entradaAdulta;
        double precioInfantil;
        double precioAdulto;
        double precio;
        double descuento;

        System.out.println("Cuantas entradas infantiles quieres");
        entradaInfantil = teclado.nextInt();
        System.out.println("Cuantas entradas adultas quieres");
        entradaAdulta = teclado.nextInt();

        precioInfantil = entradaInfantil * 15.50;
        precioAdulto = entradaAdulta * 20;
        precio = precioInfantil + precioAdulto;

        descuento = precio >= 100 ? (precio * 5) / 100 : 0.0;
        precio = precio - descuento;

        System.out.println("El precio total es " + precio);
    }
}
