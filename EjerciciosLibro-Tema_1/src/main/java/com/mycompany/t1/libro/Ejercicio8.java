/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t1.libro;

import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio8 {

    /*Un biólogo está realizando un estudio de distintas especies de invertebrados y necesita una aplicación que le ayude a contabilizar el número de patas que tienen en total todos los animales capturados durante una jornada de trabajo. Para ello, te ha solicitado que escribas una aplicación a la que hay que proporcionar:
     El número de hormigas capturadas (6 patas).
     El número de arañas capturadas (8 patas).
     El número de cochinillas capturadas (14 patas).
     La aplicación debe mostrar el número total de patas.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int hormigas;
        int aranas; //arañas
        int cochinillas;
        int totalPatas;

        System.out.println("Ingresa el numero de hormigas");
        hormigas = teclado.nextInt();
        System.out.println("Ingresa el numero de arañas");
        aranas = teclado.nextInt();
        System.out.println("Ingresa el numeros de cochinillas");
        cochinillas = teclado.nextInt();

        hormigas = hormigas * 6;
        aranas = aranas * 8;
        cochinillas = cochinillas * 14;
        totalPatas = hormigas + aranas + cochinillas;
        System.out.println("Total de patas " + totalPatas);
    }
}
