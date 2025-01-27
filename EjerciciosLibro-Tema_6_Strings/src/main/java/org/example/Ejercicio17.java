package org.example;

/*
* @author Antonio Espínola Ramírez
* */

public class Ejercicio17 {

    /*Construir un programa que convierta una palabra en secuencias de n letras. Por ejemplo, la palabra
    «destornillador», dividida en secuencias de 4 letras*/

    public static void main(String[] args) {

        String palabra = LeerDatosEntrada.leerString("Introduce una palabra");
        int numeroSecuencia = LeerDatosEntrada.leerEnteroConRango("Introduce la secuencia",0,palabra.length()/2);

        for (int i = 0; i < palabra.length(); i += numeroSecuencia) {
            // Calcular el índice final de la subsecuencia
            int fin = i + numeroSecuencia;
            if (fin > palabra.length()) {
                fin = palabra.length(); // Ajustar el índice final si se pasa de la longuitud
            }
            // Obtener la secuencia y mostrarla
            String secuencia = palabra.substring(i, fin);
            System.out.println(secuencia);
        }
    }
}