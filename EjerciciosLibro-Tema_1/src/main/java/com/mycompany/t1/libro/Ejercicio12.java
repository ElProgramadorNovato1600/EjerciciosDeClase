/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t1.libro;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio12 {

    /*La FILA (Federación Internacional de Lanzamiento de Algoritmo) realiza una competición
     donde cada participante escribe un algoritmo en un papel y lo lanza, ganando quien consiga lanzarlo más lejos.
     La peculiaridad del concurso es que la longitud del lanzamiento
     se mide en metros (con tantos decimales como se desee), pero para el ranking solo se
     tiene en cuenta la longitud en centímetros (sin decimales). Por ejemplo, para un lanzamiento de 12,3456 m
     (que son 1234,56 cm) solo se contabilizarán 1234 cm.
     Realiza un programa que solicite la longitud (en metros) de un lanzamiento y muestre la
     parte entera correspondiente en centímetros.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        double metros;
        int centimetros;

        System.out.println("Introduce la longitud en metros");
        metros = teclado.nextDouble();

        metros = metros * 100;
        centimetros = (int) metros * 100; //casting
        
        System.out.println("la longuitud en centimetros es " + centimetros);
    }
} 
