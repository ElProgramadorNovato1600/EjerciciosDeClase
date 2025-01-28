package org.example;

import java.util.Random;

/*
* @author Antonio Espínola Ramírez
* */

public class funciones {

    //Ejercicio 18
    //Escribe un programa que pase de decimal a binario.
    public static int decimal_binario(int numeroDecimal) {
        int binario = 0;
        int posicion = 1; // Representa la posición unidades, decenas ...

        while (numeroDecimal > 0) {
            int resto = numeroDecimal % 2; // Obtener el bit menos significativo
            binario += resto * posicion;  // Añadir el bit a su posición correspondiente
            posicion *= 10;               // Mover la posición al siguiente dígito (10 veces mayor)
            numeroDecimal /= 2;           // Dividir el número por 2 para procesar el siguiente bit
        }

        return binario;
    }


    //Ejercicio 19
    //Une y amplía los dos programas anteriores de tal forma que se permita convertir un número entre cualquiera de las
    // siguientes bases: decimal, binario, hexadecimal y octal.
    public static String ejercicio19(String numero, int baseOrigen, int baseDestino) {
        // Convertir el número de la base de origen a decimal
        int numeroDecimal = Integer.parseInt(numero, baseOrigen);
        // Covierte el numero de decimal a la base de destino
        return Integer.toString(numeroDecimal, baseDestino).toUpperCase();
    }

    //generaArrayInt: Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo y máximo) se indica
    // como parámetro.
    public static int[] generaArrayInt(int tamanoArray, int minimo, int maximo) {
        int[] array = new int[tamanoArray];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(minimo, maximo);
        }
        return array;
    }

    //mínimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
    public static int minimoArrayInt(int[] array) {
        int minimo = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (minimo > array[i]) {
                minimo = array[i];
            }
        }
        return minimo;
    }

    //máximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.
    public static int maximoArrayInt(int[] array) {
        int maximo = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (maximo < array[i]) {
                maximo = array[i];
            }
        }
        return maximo;
    }

    //mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
    public static int mediaArrayInt(int[] array) {
        int media = 0;
        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return media = suma / array.length;
    }

    //estaEnArrayInt: Dice si un número está o no dentro de un array.
    public static boolean estaEnArrayInt(int[] array, int numero) {
        boolean encontrado = false;
        for (int i = 0; i < array.length; i++) {
            if (numero == array[i]) {
                encontrado = true;
            }
        }
        return encontrado;
    }

    //posiciónEnArray: Busca un número en un array y devuelve la posición (el índice) en la que se encuentra.
    //Esta funcion devolvera la posicion del primer numero del array que se busca
    //si hay varios iguales devolvera el primero que encuentre
    //Si no lo encuentra devuelve -1
    public static int posicionEnArray(int[] array, int numero) {
        int posicion = -1;
        for (int i = 0; i < array.length; i++) {
            if (numero == array[i]) {
                return i;
            }
        }
        return posicion;
    }

    //volteaArrayInt: Le da la vuelta a un array.
    public static void volteaArrayInt(int[] array) {
        int[] arrayCopia = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            arrayCopia[j] = array[i];
        }
        for (int j = 0; j < array.length; j++) {
            array[j] = arrayCopia[j];
        }
    }

    //rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un array.
    public static void rotaDerechaArrayInt(int[] array, int n) {
        int[] copiaArray = new int[array.length];
        for (int i = 0; i < n; i++) {
            // Desplazar elementos a la derecha en el array auxiliar
            for (int j = 0; j < array.length; j++) {
                if (j == array.length - 1) {
                    // El último elemento se mueve a la posición 0
                    copiaArray[0] = array[j];
                } else {
                    // Los demás elementos se desplazan una posición a la derecha
                    copiaArray[j + 1] = array[j];
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = copiaArray[i];
        }
    }

    //rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de un array.
    public static void rotaIzquierdaArrayInt(int[] array, int n) {
        int[] copiaArray = new int[array.length];
        for (int i = 0; i < n; i++) {
            // Desplazar elementos hacia la izquierda en el array auxiliar
            for (int j = 0; j < array.length; j++) {
                if (j == 0) {
                    // El primer elemento se mueve al final del array auxiliar
                    copiaArray[array.length - 1] = array[j];
                } else {
                    // Los demás elementos se desplazan una posición hacia la izquierda
                    copiaArray[j - 1] = array[j];
                }
            }
            for (int j = 0; j < array.length; j++) {
                array[j] = copiaArray[j];
            }
        }
    }
}