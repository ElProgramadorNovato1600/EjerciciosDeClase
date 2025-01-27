package org.example;

/*
 * @author Antonio Espínola Ramírez
 * */

public class Ejercicio20 {

    /*Implementa un programa que lea una frase y muestre todas sus palabras ordenadas de forma alfabética. Suponemos que
     cada palabra de la frase se separa de otra por un único espacio.
     */

    public static void main(String[] args) {
        String frase = LeerDatosEntrada.leerString("Introduce una frase");
        String[] palabras = frase.split(" ");

        // Arrays.sort(palabras);
        // Ordenar manualmente usando compareTo
        for (int i = 0; i < palabras.length - 1; i++) {
            for (int j = i + 1; j < palabras.length; j++) {
                if (palabras[i].compareTo(palabras[j]) > 0) {
                    // Intercambiar palabras[i] y palabras[j]
                    String aux = palabras[i];
                    palabras[i] = palabras[j];
                    palabras[j] = aux;
                }
            }
        }
        for (String palabra : palabras) {
            System.out.print(palabra + " ");
        }
    }
}
