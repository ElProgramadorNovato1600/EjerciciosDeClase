package Ejercicio10.src.main.java;

/**
 * @author Antonio Espínola Ramírez
 */
public class Lista {

    //Atributos
    private ElementoCola primero;
    private Integer cantidadElementos;

    //Constructor
    public Lista() {
        primero = null;
        cantidadElementos = 0;
    }

    /**
     * Insetar al final de la cola un nuevo elemento, si no hay elemento lo introduce el primero
     *
     * @param elemento Elemento de la cola
     */
    public void insertarFinal(Integer elemento) {
        ElementoCola nuevo = new ElementoCola(elemento, null);
        if (primero == null) { //si la lista esta vacia lo mete en el primero
            primero = nuevo;
        } else {
            ElementoCola actual = primero; // empieza desde el primer nodo
            while (actual.getSiguiente() != null) { // comprueba cual es el siguiente hasta encontrar un null
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo); // lo inserta al final
            cantidadElementos++; //nuevo elemento añadido
        }
        //System.out.println("Final");
    }

    /**
     * Elimina el primer elemento que entro a la cola FIFO
     *
     * @return Devuelve el elemento eliminado
     */
    public Integer eliminar() {
        if (primero == null) {
            System.out.println("lista vacía");
            return null;
        } else {
            ElementoCola ultimoElemento;
            ultimoElemento = primero;
            while (ultimoElemento.getSiguiente() != null) { // comprueba cual es el siguiente hasta encontrar un null
                ultimoElemento = ultimoElemento.getSiguiente(); //almacena el primer elemento que se introducio, es decir el ultimo
            }
            Integer elementoEliminado = primero.getElemento();
            primero = primero.getSiguiente();
            cantidadElementos--;
            return elementoEliminado;
        }
    }

    /**
     * Muestra los elementos de la cola
     */
    public void mostrar() {
        if (primero == null) {
            System.out.println("La cola esta vacia");
        } else {
            ElementoCola actual = primero;
            while (actual.getSiguiente() != null) { // recorremos la lista hasta el penúltimo elemento
                System.out.println(actual.getElemento());
                actual = actual.getSiguiente();
            }
            System.out.println(actual.getElemento()); // mostramos el último elemento
        }
    }

    /**
     * @return Devuelve la cantidad de elementos
     */
    public Integer numeroElementos() {
        return cantidadElementos;
    }

    /**
     * Inserta otra lista de elementos a otra lista
     *
     * @param otraLista otra lista introducida por paramatro
     */
    void insertarFinal(Lista otraLista) {
        if (primero == null) {
            primero = otraLista.primero;
        } else {
            ElementoCola actual = primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(otraLista.primero);
            cantidadElementos += otraLista.cantidadElementos;
        }
    }
}
