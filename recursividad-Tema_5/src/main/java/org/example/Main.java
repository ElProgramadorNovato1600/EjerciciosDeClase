package org.example;

/*
 * @author Antonio Espínola Ramírez
 * */

public class Main {
    public static void main(String[] args) {

    }

    //1. Suma de N números naturales:
    //Implementar una función recursiva que calcule la suma de los primeros N números naturales.
    public static int sumaNaturales(int n) {
        int suma;
        if (n <= 1) {
            return 1;
        }
        return suma = n + sumaNaturales(n - 1);
    }

    //2. Contar dígitos de un número:
    //Escribir una función recursiva que cuente el número de dígitos en un entero positivo.
    public static int contarDigitos(int n) {
        if (n < 10) {
            return 1;
        }
        return 1 + contarDigitos(n / 10);
    }

    //3. Inversión de una cadena:
    //Crear una función recursiva que tome una cadena como entrada y devuelva su reverso.
    //public static String invertirCadena(String s)
    public static String invertirCadena(String s) {
        if (s.length() <= 1) {
            return s;
        }
        return s.charAt(s.length() - 1) + invertirCadena(s.substring(0, s.length() - 1));
    }

    //4. Suma de los dígitos de un número:
    //Escribir una función recursiva que sume los dígitos de un número entero positivo.
    public static int sumaDigitos(int n) {
        if (n < 10) {
            return n;
        }
        return (n % 10) + sumaDigitos(n / 10);
    }

    //5. Determinar si un número es par o impar:
    //Usar recursividad para determinar si un número es par o impar sin usar operadores de
    //módulo o divisiones.
    public static boolean esPar(int n) {
        //si el número es 0, es par
        if (n == 0) {
            return true;
        }
        //si el número es 1, es impar
        if (n == 1) {
            return false;
        }
        return esPar(n - 2);
    }

    //6. Máximo común divisor (MCD):
    //Implementar la función de Euclides de forma recursiva para calcular el MCD de dos
    //números.
    public static int mcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mcd(b, a % b);
    }

    //7. Multiplicación mediante sumas:
    //Realizar la multiplicación de dos números enteros positivos usando solo sumas recursivas.
    public static int multiplicar(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a + multiplicar(a, b - 1);
    }

    //8. Imprimir un array unidimensional o vector de manera recursiva:
    //Dado un vector de enteros, escribir una función recursiva para imprimir todos sus elementos.
    public static void imprimirVector(int[] vector, int indice) {
        if (indice == vector.length) {
            return;
        }
        System.out.println(vector[indice]);
        imprimirVector(vector, indice + 1);
    }

    //9. Buscar un elemento en un vector:
    //Implementar una función recursiva para buscar si un número dado está en un vector de
    //enteros.
    public static boolean buscarElemento(int[] vector, int indice, int elemento) {
        if (indice == vector.length) {
            return false;
        }
        if (vector[indice] == elemento) {
            return true;
        }
        return buscarElemento(vector, indice + 1, elemento);
    }

    //10.Contar ocurrencias de un elemento en un vector:
    //Contar cuántas veces aparece un elemento específico en un vector de enteros usando
    //recursividad.
    public static int contarOcurrencias(int[] vector, int indice, int elemento) {
        if (indice == vector.length) {
            return 0;
        }
        if (vector[indice] == elemento) {
            return 1 + contarOcurrencias(vector, indice + 1, elemento);
        }
        return contarOcurrencias(vector, indice + 1, elemento);
    }

    //11.Invertir un vector:
    //Crear una función recursiva que invierta los elementos de un vector.
    public static void invertirVector(int[] vector, int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }
        int temp = vector[inicio];
        vector[inicio] = vector[fin];
        vector[fin] = temp;

        invertirVector(vector, inicio + 1, fin - 1);
    }

    //12.Imprimir los números de un rango:
    //Escribir una función recursiva que imprima todos los números entre a y b, donde a y b son
    //pasados como argumento.
    public static void imprimirRango(int a, int b) {
        if (a > b) {
            return;
        }
        System.out.print(a + " ");
        imprimirRango(a + 1, b);
    }

    //13.Comprobar si una cadena es un palíndromo:
    //Implementar una función recursiva que determine si una cadena es un palíndromo.
    public static boolean esPalindromo(String cadena, int inicio, int fin) {
        if (inicio >= fin) {
            return true;
        }
        if (cadena.charAt(inicio) != cadena.charAt(fin)) {
            return false;
        }
        return esPalindromo(cadena, inicio + 1, fin - 1);
    }

    //14.Suma de elementos en un vector:
    //Escribir una función recursiva que sume todos los elementos de un arreglo.
    public static int sumaVector(int[] vector, int indice) {
        if (indice < 0) {
            return 0;
        }
        return vector[indice] + sumaVector(vector, indice - 1);
    }

    //15.Resolver la Torre de Hanoi:
    //Implementar la solución del problema de la Torre de Hanoi con n discos.
    //“n” es la cantidad de discos a mover, “origen” la torre de origen, “destino” la torre de
    //destino y “auxiliar” la torre auxiliar.
    public static void torreHanoi(int n, char origen, char auxiliar, char destino) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origen + " a " + destino);
            return;
        }
        torreHanoi(n - 1, origen, destino, auxiliar);

        System.out.println("Mover disco " + n + " de " + origen + " a " + destino);

        torreHanoi(n - 1, auxiliar, origen, destino);
    }

    //16.Camino en una matriz (backtracking básico):
    //Implementar una función recursiva para contar cuántos caminos posibles hay desde la
    //esquina superior izquierda hasta la esquina inferior derecha de una matriz, moviéndose solo
    //hacia abajo o hacia la derecha. No hace falta pasar una matriz, sino la fila y la columna
    //donde empieza y la fila y columna donde termina.
    public static int contarCaminos(int i, int j, int m, int n){
        if (i == m - 1 && j == n - 1) {
            return 1;
        }
        if (i >= m || j >= n) {
            return 0;
        }
        return contarCaminos(i + 1, j, m, n) + contarCaminos(i, j + 1, m, n);
    }

    //17.Resolver un Sudoku (backtracking avanzado):
    //Crear una función recursiva que resuelva un Sudoku incompleto utilizando el enfoque de
    //backtracking. El funcionamiento del Sudoku se explica aquí.
    public static boolean resolverSudoku(int[][] tablero, int fila, int col){
        // Si llegamos al final del tablero, significa que hemos terminado
        if (fila == 9) {
            return true;
        }

        // Si la columna llega al final, pasar a la siguiente fila
        if (col == 9) {
            return resolverSudoku(tablero, fila + 1, 0);
        }

        // Si la celda ya tiene un número, pasar a la siguiente
        if (tablero[fila][col] != 0) {
            return resolverSudoku(tablero, fila, col + 1);
        }

        // Probar números del 1 al 9
        for (int num = 1; num <= 9; num++) {
            if (esValido(tablero, fila, col, num)) {
                tablero[fila][col] = num; // Colocar número
                if (resolverSudoku(tablero, fila, col + 1)) {
                    return true;
                }
                tablero[fila][col] = 0; // Retroceder si no es una solución válida (backtracking)
            }
        }
        return false;
    }

    // Metodo para verificar si un número es válido en la posición dada
    private static boolean esValido(int[][] tablero, int fila, int col, int num) {
        // Verificar la fila
        for (int i = 0; i < 9; i++) {
            if (tablero[fila][i] == num) {
                return false;
            }
        }

        // Verificar la columna
        for (int i = 0; i < 9; i++) {
            if (tablero[i][col] == num) {
                return false;
            }
        }
        // Verificar el subcuadrante de 3x3
        int inicioFila = (fila / 3) * 3;
        int inicioCol = (col / 3) * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[inicioFila + i][inicioCol + j] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}