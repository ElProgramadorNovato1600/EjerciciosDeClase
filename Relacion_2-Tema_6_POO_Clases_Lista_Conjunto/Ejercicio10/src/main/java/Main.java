package Ejercicio10.src.main.java;

/**
 * @author Antonio Espínola Ramírez
 */

public class Main {

    /*Repite la actividad 8 usando una LISTA para guardar los elementos encolados*/

    public static void main(String[] args) {

        Lista cola1 = new Lista(); //Creo la lista

        //Introduzco los elementos de la cola
        cola1.insertarFinal(1);
        cola1.insertarFinal(2);
        cola1.insertarFinal(3);
        cola1.insertarFinal(4);
        //cola1.mostrar();
        System.out.println("Elemento eliminado " + cola1.eliminar());
        //cola1.mostrar();

        Lista cola2 = new Lista();

        cola2.insertarFinal(5);
        cola2.insertarFinal(6);
        cola2.insertarFinal(7);
       // cola2.mostrar();

      cola1.insertarFinal(cola2);
      cola1.mostrar();
    }
}