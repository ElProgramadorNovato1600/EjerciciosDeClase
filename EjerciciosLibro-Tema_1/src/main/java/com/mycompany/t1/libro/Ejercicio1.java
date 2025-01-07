package com.mycompany.t1.libro;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio1 {

    /*Un economista te ha encargado un programa para realizar cálculos con el IVA.
     La aplicación debe solicitar la base imponible y el IVA que se debe aplicar.
      Muestra en pantalla el importe correspondiente al IVA y al total.*/

    public static void main(String[] args) {
        int base;
        int iva;
        int importeCorrespondiente;
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese la base");
        base = teclado.nextInt();

        System.out.println("Ingrese el tipo de IVA");
        iva = teclado.nextInt();

        importeCorrespondiente = base + (base * iva) / 100;

        System.out.println("El importe correspondiente es: " + importeCorrespondiente);

    }
}
