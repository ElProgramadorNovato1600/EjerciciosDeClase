package org.example;

/*
 * @author Antonio Espínola Ramírez
 * */

public class Ejercicio13 {

    /*El preprocesador del lenguaje JAVA elimina los comentarios del código fuente antes de compilar. Diseña un
    programa que lea por teclado una sentencia en JAVA, y elimine los comentarios.*/

    public static void main(String[] args) {
        String sentencia = "if (a==3) /* igual a tres*/ a++ /*incrementamos a */";
        System.out.println(remplazarComentarios(sentencia));
    }

    public static String remplazarComentarios(String sentencia) {
        int inicio = sentencia.indexOf("/*"); //posicion 10 antes /*

        //indexOf si no encuentra nada devuelve -1 y asi saldria del bucle
        while (inicio != -1) {
            int fin = sentencia.indexOf("*/");
            sentencia = sentencia.substring(0, inicio) + sentencia.substring(fin + 2);
            inicio = sentencia.indexOf("/*");
        }
        return sentencia;
    }
}