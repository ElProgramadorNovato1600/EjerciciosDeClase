/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t2.libro;

import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio1 {

    /*Escribe una aplicación que solicite al usuario un número comprendido entre 0 y 9999.
     La aplicación tendrá que indicar si el número introducido es capicúa.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int guardoNumero;
        int unidades;
        int decenas;
        int centenas;
        int unidadesMillar;
        boolean capicua = false;

        System.out.println("Ingresa un numero comprendido entre 0 y 9999");
        numero = teclado.nextInt();

        guardoNumero = numero; //Guardo el numero

        unidades = numero % 10; //Obtengo las unidades
        numero /= 10; //Quito las unidades

        decenas = numero % 10;//Obtengo las decenas
        numero /= 10;//Quito las decenas

        centenas = numero % 10; //Obtengo las centenas
        numero /= 10;//Quito las centenas

        unidadesMillar = numero % 10; //Obtengo las unidades de Millar

        //Le doy la vuelta al numero multiplicando por potencia
        //Luego compruebo que si son iguales, si lo son significa que es capicua
        if (unidadesMillar != 0) {
            numero = unidades * 1000 + decenas * 100 + centenas * 10 + unidadesMillar;
            if (numero == guardoNumero) {
                capicua = true;
            }
        } else if (centenas != 0) {
            numero = unidades * 100 + decenas * 10 + centenas;
            if (numero == guardoNumero) {
                capicua = true;
            }
        } else if (decenas != 0) {
            numero = unidades * 10 + decenas;
            if (numero == guardoNumero) {
                capicua = true;
            }
        } else if (unidades != 0) {
            capicua = true;
        }
        if (capicua) {
            System.out.println("Es capicua");
        } else {
            System.out.println("no es capicua");
        }
    }
}
