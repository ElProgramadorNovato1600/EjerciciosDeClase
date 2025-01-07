/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t1.libro;

import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio6 {

    /*Diseña una aplicación que solicite al usuario que introduzca una cantidad de segundos.
     La aplicación debe mostrar cuántas horas, minutos y segundos hay en el número de segundos introducidos por el usuario.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int segundos;
        int min;
        int horas;

        System.out.println("Introduce un numero de segundos");
        segundos = teclado.nextInt();

        horas = segundos / 3600;
        min = ((segundos % 3600) / 60);
        segundos = segundos <= 59 ? segundos : segundos % 60; //Obtiene los segundos

        System.out.println();
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + min);
        System.out.println("Segundos: " + segundos);
    }
}
