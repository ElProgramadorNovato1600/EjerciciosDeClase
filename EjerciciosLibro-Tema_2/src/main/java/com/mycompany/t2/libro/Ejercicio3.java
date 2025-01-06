/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t2.libro;

import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio3 {

    /*En una granja se compra diariamente una cantidad (comidaDiaria) de comida para los animales.
     El número de animales que alimentar (todos de la misma especie) es numAnimales, y sabemos que
     cada animal come una media de kilosPorAnimal.
     Diseña un programa que solicite al usuario los valores anteriores y determine si disponemos de alimento suficiente para cada animal.
     En caso negativo, ha de calcular cuál es la ración que corresponde a cada uno de los animales.
     Nota: Evitar que la aplicación realice divisiones por cero.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int comidaDiaria;
        int numAnimales;
        int kilosPorAnimal;
        int comidaSuficiente;
        int kilosTotal; //guarda los kilos de comida que comen todos los animales
        int racion;

        System.out.println("Cuanto animales hay");
        numAnimales = teclado.nextInt();

        System.out.println("Cuanta comida diaria hay ");
        comidaDiaria = teclado.nextInt();

        System.out.println("Cuanto kilos comen de media los animales");
        kilosPorAnimal = teclado.nextInt();

        kilosTotal = numAnimales * kilosPorAnimal;
        comidaSuficiente = comidaDiaria - kilosTotal;

        if (comidaSuficiente >= 0) {
            System.out.println("hay comida para alimentar a los animales");
        } else if (numAnimales != 0) { //validamos para que no existan divisiones por 0
            racion = comidaDiaria / numAnimales;
            System.out.println("racion por animal debido a la falta de alimento " + racion);
        }
    }
}
