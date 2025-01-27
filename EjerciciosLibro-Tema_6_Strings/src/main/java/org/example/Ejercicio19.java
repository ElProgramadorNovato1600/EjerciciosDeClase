package org.example;

/*
* @author Antonio Espínola Ramírez
* */

public class Ejercicio19 {

    /*Implementa un sencillo editor de texto que, una vez que se ha introducido el texto, permita reemplazar todas las
     ocurrencias de una palabra por otra.
     */

    public static void main(String[] args) {
        String frase = LeerDatosEntrada.leerString("Introduce una frase");
        String palabra = LeerDatosEntrada.leerString("Introduce la palabra que quieres sustituir");

        //valido que la frase contenga la palabra que queremos sustituir
        if (frase.contains(palabra)) {
            String palabraCambiada = LeerDatosEntrada.leerString("Introduce la palabra por la que la quieres cambiar");
            frase = frase.replaceAll(palabra, palabraCambiada);
            System.out.println(frase);
        } else {
            System.err.println("La palabra que quieres sustituir no se encuentra en la frase");
        }
    }
}