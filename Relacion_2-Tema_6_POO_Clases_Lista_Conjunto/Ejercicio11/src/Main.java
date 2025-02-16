/**
 * @author Antonio Espínola Ramírez
 */

public class Main {

    /*Un conjunto es una estructura dinámica de datos como la lista, con dos diferencias: en primer lugar, en una lista
    puede haber elementos repetidos, mientras que en un conjunto no. Además, en una lista el orden de inserción de los
    elementos puede ser relevante y debemos tenerlo en cuenta, mientras que en un conjunto solo interesa si un elemento
    pertenece o no al conjunto y no el lugar que ocupa. Se pide implementar la clase Conjunto utilizando una lista para
    almacenar números de tipo Integer. Implementa los siguientes métodos:

    Un constructor sin parámetros.
    int numeroElementos(): devuelve el número de elementos del conjunto.
    boolean insertar(Integer nuevoElemento): inserta un nuevo elemento en el conjunto.
    boolean insertar(Conjunto otroConjunto): añade al conjunto los elementos del conjunto otroConjunto.
    boolean eliminarElemento(Integer elemento): en caso de pertenecer al conjunto, elimina elemento.
    boolean eliminarConjunto(Conjunto otroConjunto): elimina del conjunto invocante los elementos del conjunto que se pasa como parámetro.
    boolean pertenece(Integer elemento): indica si el elemento que se le pasa como parámetro pertenece o no al conjunto.
    muestra(): muestra el conjunto por consola.
    De forma general, los métodos que devuelven un booleano indican con sí el conjunto se ha modificado.*/

    public static void main(String[] args) {


        Conjunto conjunto1 = new Conjunto();

        conjunto1.insertar(1);
        conjunto1.insertar(4);
        conjunto1.insertar(2);
        conjunto1.insertar(8);
        conjunto1.mostrarConjunto();

        System.out.println("Numeros de elementos del conjunto: " + conjunto1.numeroElementos());
        conjunto1.eliminar(3);
        conjunto1.eliminar(8);
        conjunto1.mostrarConjunto();

        Conjunto conjunto2 = new Conjunto();

        conjunto2.insertar(10);
        conjunto2.insertar(11);
        conjunto2.insertar(12);
        conjunto2.insertar(13);

        conjunto1.insertarConjunto(conjunto2);
        conjunto1.mostrarConjunto();
        System.out.println("aaaaa");
        conjunto1.eliminarConjunto(conjunto2);
        conjunto1.mostrarConjunto();
        //conjunto2.mostrarConjunto();
    }
}