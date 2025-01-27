package org.example;

import java.util.Scanner;

/*
 * @author Antonio Espínola Ramírez
 * */


public class Ejercicio12 {

    /*Realiza el juego del ahorcado. Las reglas del juego son:

     a) El jugador A teclea una palabra, sin que el jugador B la vea.
     b) Ahora se le muestra tantos guiones como letras tenga la palabra secreta. Por ejemplo, para «hola» será «_ _ _ ».
     c) El jugador B intentará acertar, letra a letra, la palabra secreta.
     d) Cada acierto muestra la letra en su lugar y las letras no acertadas seguirán ocultas como guiones. Siguiendo con
     el ejemplo anterior, y suponiendo que se ha introducido: la ‘o’, la ‘j’ y la ‘a’, se mostrará: « o _ _ a».
     e) El jugador B solo tiene 7 intentos.
     f) La partida terminará al acertar todas las letras que forman la palabra secreta (gana el jugador B) o cuando se
     agoten todos los intentos (gana el jugador A).*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String jugador1;
        String jugador2;
        String palabra;
        char letra;
        //array con la palabra
        char[] palabraAhorcado;
        //array con guiones
        char[] palabraAhorcadoGuiones;
        int intentos = 0;

        jugador1 = LeerDatosEntrada.leerString("Introduce el nombre del jugador 1");
        jugador2 = LeerDatosEntrada.leerString("Introduce el nombre del jugador 2");
        palabra = LeerDatosEntrada.leerString("Jugador " + jugador1 + " introduce la palabra");
        palabra = palabra.toLowerCase(); // paso la cadena a minusculas para evitar problemas
        palabraAhorcado = palabraAhorcado(palabra);
        palabraAhorcadoGuiones = palabraAhorcadoGuiones(palabra);

        do {
            System.out.println();
            System.out.println("Introduce una letra jugador "+jugador2);
            letra = teclado.next().charAt(0);
            sustituirGuiones(palabraAhorcadoGuiones, palabraAhorcado, letra);
            mostrarPalabraAhorcado(palabraAhorcadoGuiones);
            intentos = intentos + intentos(palabraAhorcado, letra);
        } while (intentos < 7 && !palabraCorrecta(palabraAhorcadoGuiones, palabraAhorcado));
        System.out.println();
        if (intentos < 7 && palabraCorrecta(palabraAhorcadoGuiones, palabraAhorcado)) {
            System.out.println("HAS GANADO");
        } else {
            System.out.println("HAS PERDIDO");
        }
    }

    /**
     *
     * @param palabra palabra del ahorcado
     * @return Devuelve un array de caracteres con la palabra intacta
     */
    public static char[] palabraAhorcado(String palabra) {
        char[] palabraAhorcado = new char[palabra.length()];
        for (int i = 0; i < palabraAhorcado.length; i++) {
            palabraAhorcado[i] = palabra.charAt(i);
        }
        return palabraAhorcado;
    }

    /**
     *
     * @param palabra palabra del ahorcado
     * @return Devuelve un array de caracteres con giones '_' con el mismo tamaño que la palabra introducida
     */
    public static char[] palabraAhorcadoGuiones(String palabra) {
        char[] palabraAhorcadoGuiones = new char[palabra.length()];
        for (int i = 0; i < palabraAhorcadoGuiones.length; i++) {
            palabraAhorcadoGuiones[i] = '_';
        }
        return palabraAhorcadoGuiones;
    }


    /**
     * Sustituye los guiones en el caso de que la letra se encuentre en la palabra, Sobreescribe el array
     * @param palabraAhorcadoGuiones Array de char
     * @param palabraAhorcado Array de String
     * @param letra Letra Introducida por un jugador
     */
    public static void sustituirGuiones(char[] palabraAhorcadoGuiones, char[] palabraAhorcado, char letra) {
        for (int i = 0; i < palabraAhorcado.length; i++) {
            if (palabraAhorcado[i] == letra) {
                palabraAhorcadoGuiones[i] = letra;
            }
        }
    }

    /**
     *
     * @param palabraAhorcado Array char
     * @param letra letra
     * @return Devuelve 1 si no ha acertado y devuelve 0 si ha acertado una letra
     */
    public static int intentos(char[] palabraAhorcado, char letra) {
        int acierto = 1;
        for (int i = 0; i < palabraAhorcado.length; i++) {
            if (palabraAhorcado[i] == letra) {
                acierto = 0;
            }
        }
        return acierto;
    }



    /**
     * Muestra el resultado de la palabra
     * @param palabraAhorcadoGuiones Array de char
     */
    public static void mostrarPalabraAhorcado(char[] palabraAhorcadoGuiones) {
        for (char palabraAhorcadoGuione : palabraAhorcadoGuiones) {
            System.out.print(palabraAhorcadoGuione);
        }
    }


    /**
     * Paso los dos array de char a una String para compararlas y comprobar que es la palabra correcta
     * @param palabraAhorcadoGuiones Array de char con guiones
     * @param palabraAhorcado Array de char con la palabra
     * @return devuelve true si las dos palabras son iguales
     */
    public static boolean palabraCorrecta(char[] palabraAhorcadoGuiones, char[] palabraAhorcado) {
        boolean sonIguales = false;
        String palabraGuion = "";
        String palabra = "";
        for (int i = 0; i < palabraAhorcadoGuiones.length; i++) {
            palabra = palabra + palabraAhorcado[i];
            palabraGuion = palabraGuion + palabraAhorcadoGuiones[i];
        }
        if (palabra.equals(palabraGuion)) {
            sonIguales = true;
        }
        return sonIguales;
    }
}
