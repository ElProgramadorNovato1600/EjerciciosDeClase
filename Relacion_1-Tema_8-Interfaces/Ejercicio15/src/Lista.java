/**
 * @author Antonio Espinola Ramirez
 */

public class Lista {
    protected Numeros primero;
    private int cantidadElementos;

    public Lista() {
        primero = null;
        cantidadElementos = 0;
    }

    public void insertarPrincipio(int elemento) {
        Numeros nuevo = new Numeros(elemento, primero);
        primero = nuevo;
        cantidadElementos++;
    }

    public void insertarFinal(int elemento) {
        Numeros nuevo = new Numeros(elemento, null);
        if (primero == null) { //si la lista esta vacia lo mete en el primero
            primero = nuevo;
        } else {
            Numeros actual = primero; // empieza desde el primer nodo
            while (actual.getSiguiente() != null) { // comprueba cual es el seiguiente hasta encontrar un null
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo); // lo inserta al final
        }
        cantidadElementos++; //nuevo elemento añadido
    }

    public void eliminar(int elemento) {
        if (primero == null)
            System.out.println("lista vacía");
        else if (primero.getElemento() == elemento) { // Si es el primero elemento de lista lo eliminamos
            primero = primero.getSiguiente(); //Si eliminas el primer elemento apunta al segundo
            cantidadElementos--;
        } else { // Si no es el primero vamos recorriendo la lista hasta que encontremos el elemento
            Numeros actual = primero; // El Nodo "actual" es una variable auxiliar que contiene el elemento a comprobar de la lista
            while (actual.getSiguiente() != null && actual.getSiguiente().getElemento() != elemento) // Se comprueba el siguiente del actual
                actual = actual.getSiguiente();
            if (actual.getSiguiente() == null) // Si hemos llegado al último elemento y no lo hemos encontrado es que no está
                System.out.println("elemento " + elemento + " no esta en la lista");
            else {
                actual.setSiguiente(actual.getSiguiente().getSiguiente()); // se apunta 1 2 3  el 1 apuntaria al 3 y quedaria asi 1 3
                cantidadElementos--;
            }
        }
    }

    public void mostrar() {
        Numeros actual = primero;
        while (actual.getSiguiente() != null) { // recorremos la lista hasta el penúltimo elemento
            System.out.println(actual.getElemento());
            actual = actual.getSiguiente();
        }
        System.out.println(actual.getElemento()); // mostramos el último elemento
    }

    public int numeroElementos() {
        return cantidadElementos;
    }

    void insertar(int posicion, int elemento) {
        if (primero == null)
            this.insertarPrincipio(elemento);
        else {

            Numeros auxiliar = primero;

            for (int i = 1; i < posicion; i++) {
                if (auxiliar.getSiguiente() == null)
                    break; // Si es el último nodo de la lista paramos
                auxiliar = auxiliar.getSiguiente();
            }

            Numeros tmp = new Numeros(elemento, auxiliar.getSiguiente());
            auxiliar.setSiguiente(tmp);
        }
    }

    int buscar(int claveBusqueda) {
        int posicion = -1;
        Numeros auxiliar = primero;
        for (int i = 0; i < cantidadElementos && posicion == -1; i++) {
            if (auxiliar.getElemento() == claveBusqueda) {
                posicion = i;
            }
            auxiliar = auxiliar.getSiguiente();
        }
        return posicion;
    }

    void insertarFinal(Lista otraLista) {

        if (primero == null) {
            primero = otraLista.primero;
        } else {
            Numeros actual = primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(otraLista.primero);
            cantidadElementos += otraLista.cantidadElementos;
        }
    }
}
