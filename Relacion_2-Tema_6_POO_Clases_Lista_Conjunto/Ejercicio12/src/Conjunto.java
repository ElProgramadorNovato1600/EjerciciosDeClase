/**
 * @author Antonio Espínola Ramírez
 */

public class Conjunto {
    //Atributos
    private Nodo primero;
    private int cantidadElementos;

    //Constructor
    public Conjunto() {
        primero = null;
        cantidadElementos = 0;
    }

    /**
     * Metodo que comprueba que en un elemento pertenece a una coleccion
     *
     * @param elemento Elemento
     * @return Devuelve true si encuentra el elemento en la coleccion
     */
    private boolean pertenece(Integer elemento) {
        boolean pertenece = false;
        Nodo actual = primero;
        while (actual != null) {
            if (actual.getElemento() == elemento) {
                pertenece = true;
                break;
            }
            actual = actual.getSiguiente();
        }
        return pertenece;
    }

    /**
     * Inserta un elemento al conjunto
     *
     * @param elemento elemento
     * @return Devuelve true si el elemento fue introducido
     */
    public boolean insertar(int elemento) {
        if (pertenece(elemento)) {
            return false; // Si el elemento ya pertenece, no lo insertamos
        }
        Nodo nodoNuevo = new Nodo(elemento, null);

        // Si el conjunto está vacío, el primer nodo será el nuevo nodo
        if (primero == null) {
            primero = nodoNuevo;
        } else {
            // Si no está vacío, recorremos hasta el último nodo y lo enlazamos
            Nodo actual = primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nodoNuevo);
        }
        cantidadElementos++;
        return true;
    }


    /**
     * Inserta un conjunto de elementos a otro conjunto de elementos
     *
     * @param otraLista otro conjunto de elementos
     * @return Devuelve true si se añadio correctamente
     */
    public boolean insertarConjunto(Conjunto otraLista) {
        if (otraLista.primero == null) { // Si el conjunto a insertar está vacío, no hacemos nada.
            return false;
        }
        if (primero == null) { // Si el conjunto actual está vacío, simplemente asignamos el otro conjunto.
            primero = otraLista.primero;
        } else {
            Nodo ultimoNodo = primero;
            while (ultimoNodo.getSiguiente() != null) {
                ultimoNodo = ultimoNodo.getSiguiente();
            }
            ultimoNodo.setSiguiente(otraLista.primero);
        }
        cantidadElementos += otraLista.cantidadElementos;
        return true;
    }

    public boolean eliminar(int elemento) {
        if (!pertenece(elemento)) { //No puedes eliminar algo que no se encuentra en el conjunto
            return false;
        }
        if (primero == null) { //Si el conjunto esta vacio tampoco puedes
            System.out.println("Conjunto vacio");
            return false;
        }
        // Si el primer elemento es el que se quiere eliminar
        if (primero.getElemento() == elemento) {
            primero = primero.getSiguiente(); // Mover el puntero al siguiente nodo
            cantidadElementos--;
            return true;
        }
        Nodo actual = primero; // El Nodo "actual" es una variable auxiliar que contiene el elemento a comprobar el conjunto
        while (actual.getSiguiente() != null) { // Recorremos la lista hasta encontrar el elemento
            if (actual.getSiguiente().getElemento() == elemento) {
                // Saltamos el nodo a eliminar y enlazamos el nodo actual con el que sigue después.
                actual.setSiguiente(actual.getSiguiente().getSiguiente()); // Eliminar el nodo
                cantidadElementos--;
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    /**
     * Elimina todos los elementos del conjunto que pasamos por parametro
     *
     * @param conjunto Conjunto de elementos
     * @return Devuelve true si elimino los todos los elementos del conjunto
     */
    public boolean eliminarConjunto(Conjunto conjunto) {
        if (conjunto.primero == null) {
            System.out.println("El conjunto no tenia elementos previamente");
            return false; //Al no tener elementos previamente no hay elementos que eliminar
        }
        boolean modificado = false;
        Nodo elementos = conjunto.primero; //Elementos del conjunto del parametro
        while (elementos != null) {
            if (eliminar(elementos.getElemento())) { // Reutilizamos el metodo eliminar()
                modificado = true;
            }
            elementos = elementos.getSiguiente();
        }
        return modificado;
    }

    /**
     * Muestra los elementos del conjunto
     */
    public void mostrarConjunto() {
        if (primero == null) {
            System.out.println("El conjunto esta vacio");
        } else {
            Nodo actual = primero;
            while (actual.getSiguiente() != null) { // recorremos el conjunto hasta el penúltimo elemento
                System.out.println(actual.getElemento());
                actual = actual.getSiguiente();
            }
            System.out.println(actual.getElemento()); // mostramos el último elemento
        }
    }

    /**
     * @return Devuelve la cantidad de elementos que tiene el conjunto
     */
    public int numeroElementos() {
        return cantidadElementos;
    }


    /**
     * @param c1 Conjunto 1
     * @param c2 Conjunto 2
     * @return Devuelve true si c1 está incluido en c2, es decir, si todos los elementos de c1 están también en c2.
     */
    public static boolean incluido(Conjunto c1, Conjunto c2) {
        Nodo actual = c1.primero;
        while (actual != null) {
            if (!c2.pertenece(actual.getElemento())) {
                return false;
            }
            actual = actual.getSiguiente();
        }
        return true;
    }

    /**
     * Devuelve un nuevo conjunto con todos los elementos que están en c1, en c2 o en ambos (elementos comunes y no comunes).
     *
     * @param c1 Conjunto 1
     * @param c2 Conjunto 2
     * @return Devuelve un nuevo Conjunto
     */
    public static Conjunto union(Conjunto c1, Conjunto c2) {
        Conjunto resultado = new Conjunto();
        Nodo actual = c1.primero;
        while (actual != null) {
            resultado.insertar(actual.getElemento());
            actual = actual.getSiguiente();
        }
        actual = c2.primero;
        while (actual != null) {
            resultado.insertar(actual.getElemento());
            actual = actual.getSiguiente();
        }
        return resultado;
    }

    /**
     * Devuelve un nuevo conjunto con todos los elementos que estan en c1 y en c2 a la vez (solo elementos comunes).
     *
     * @param c1 Conjunto 1
     * @param c2 Conjunto 2
     * @return Devuelve un nuevo Conjunto
     */
    public static Conjunto interseccion(Conjunto c1, Conjunto c2) {
        Conjunto resultado = new Conjunto();
        Nodo actual = c1.primero;
        while (actual != null) {
            if (c2.pertenece(actual.getElemento())) {
                resultado.insertar(actual.getElemento());
            }
            actual = actual.getSiguiente();
        }
        return resultado;
    }

    /**
     * Devuelve un nuevo conjunto con todos los elementos que están en c1, pero no en c2.
     * Es decir que si tienen algun elemento en comun no se añadira al nuevo conjunto
     *
     * @param c1 Conjunto 1
     * @param c2 Conjunto 2
     * @return Devuelve un nuevo conjunto
     */
    public static Conjunto diferencia(Conjunto c1, Conjunto c2) {
        Conjunto resultado = new Conjunto();
        Nodo actual = c1.primero;
        while (actual != null) {
            if (!c2.pertenece(actual.getElemento())) {
                resultado.insertar(actual.getElemento());
            }
            actual = actual.getSiguiente();
        }
        return resultado;
    }
}