package org.example;

import java.util.Scanner;

/*
 * @author Antonio Espínola Ramírez
 * */

public class Ejercicio8 {

    /*Realiza un programa que pida la temperatura media que ha hecho en cada mes
     de un determinado año y que muestre a continuación un diagrama de barras
     horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
     de asteriscos o cualquier otro carácter.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] arrayNumeros = new int[12];
        char caracter;
        int mes = 1;

        // Ingreso la media por teclado
        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.println("Ingresa la media del mes " + mes);
            arrayNumeros[i] = teclado.nextInt();
            mes++;
        }

        //ingreso el caracter por teclado
        System.out.println("ingresa el caracter");
        caracter = teclado.next().charAt(0);

        //muestro los meses con la media en caracteres
        for (int i = 0; i < arrayNumeros.length; i++) {
            switch (i) {
                case 0:
                    System.out.print("Enero ");
                    break;
                case 1:
                    System.out.print("\nFebrero ");
                    break;
                case 2:
                    System.out.print("\nMarzo ");
                    break;
                case 3:
                    System.out.print("\nAbril ");
                    break;
                case 4:
                    System.out.print("\nMayo ");
                    break;
                case 5:
                    System.out.print("\nJunio ");
                    break;
                case 6:
                    System.out.print("\nJulio ");
                    break;
                case 7:
                    System.out.print("\nAgosto ");
                    break;
                case 8:
                    System.out.print("\nSeptiembre ");
                    break;
                case 9:
                    System.out.print("\nOctubre ");
                    break;
                case 10:
                    System.out.print("\nNoviembre ");
                    break;
                case 11:
                    System.out.print("\nDiciembre ");
                    break;
            }
            for (int j = 0; j < arrayNumeros[i]; j++) {
                System.out.print(caracter);
            }
        }
        System.out.println();
    }
}