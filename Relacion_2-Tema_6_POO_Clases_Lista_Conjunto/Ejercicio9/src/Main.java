/**
 * @author Antonio Espínola Ramírez
 */

public class Main {

    /*Implementa la clase Pila para números Integer, usando directamente una tabla para guardar los elementos apilados*/

    public static void main(String[] args) {

        Pila p1 = new Pila(5);// Creo una pila con una capacidad de 5 elementos

        //Elementos de la pila
        p1.apilar(1);
        p1.apilar(2);
        p1.apilar(3);
        p1.apilar(4);
        p1.apilar(5);

        p1.mostrarPila();//Muestro la pila

        p1.desapilar();//Desapilo el ultimo elemento que entro

        System.out.println();

        p1.mostrarPila();//Muestro la pila
    }
}