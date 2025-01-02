/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.r1.t1;

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio3 {
    /*Realizar un programa que muestre la tabla de verdad de los operadores lógicos y
     *(&&), o (||), no (!). Para ellos se utilizarán tipos de datos boolean.
     */
    public static void main(String[] args) {
        boolean v1;
        boolean v2;
        boolean resultado;

        //Tabla Operador  &&

        System.out.println("\tTABLA &&");
        System.out.println("------------------------------");
        System.out.println("v1\tv2\tresultado");

        v1 = false;
        v2 = false;
        resultado = v1 && v2;
        System.out.println(v1 + "\t" + v2 + "\t" + resultado);

        v1 = false;
        v2 = true;
        resultado = v1 && v2;
        System.out.println(v1 + "\t" + v2 + "\t" + resultado);

        v1 = true;
        v2 = false;
        resultado = v1 && v2;
        System.out.println(v1 + "\t" + v2 + "\t" + resultado);

        v1 = true;
        v2 = true;
        resultado = v1 && v2;
        System.out.println(v1 + "\t" + v2 + "\t" + resultado);

        //Tabla Operador ||

        System.out.println("\tTABLA ||");
        System.out.println("------------------------------");

        System.out.println("v1\tv2\tresultado");
        v1 = false;
        v2 = false;
        resultado = v1 || v2;
        System.out.println(v1 + "\t" + v2 + "\t" + resultado);

        v1 = false;
        v2 = true;
        resultado = v1 || v2;
        System.out.println(v1 + "\t" + v2 + "\t" + resultado);

        v1 = true;
        v2 = false;
        resultado = v1 || v2;
        System.out.println(v1 + "\t" + v2 + "\t" + resultado);

        v1 = true;
        v2 = true;
        resultado = v1 || v2;
        System.out.println(v1 + "\t" + v2 + "\t" + resultado);

        //Tabla Operador  !

        System.out.println("\tTABLA !");
        System.out.println("------------------------------");

        System.out.println("v1\tresultado");
        v1 = false;
        resultado = !v1;
        System.out.println(v1 + "\t" + resultado);

        v1 = true;
        resultado = !v1;
        System.out.println(v1 + "\t" + resultado);
    }
}
