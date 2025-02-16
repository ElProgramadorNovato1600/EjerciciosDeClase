/**
 * @author Antonio Espínola Ramírez
 */

public class Cola {

    //Atributos
    private final Integer[][] tabla;
    private int primerElemento; // Indica el primer elemento
    private int ultimoElemento; // Indica el último elemento
    private final int capacidadTotal; // Capacidad de la cola
    private int tamanoActual; // Número de elementos actuales en la cola

    //Constructor
    public Cola(int capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
        this.tabla = new Integer[capacidadTotal][1]; // Tabla con una sola columna para los elementos
        this.primerElemento = 0;
        this.ultimoElemento = -1;
        this.tamanoActual = 0;
    }

    /**
     * Metodo para encolar un elemento
     *
     * @param elemento Elemento INTEGER
     */
    public void encolar(Integer elemento) {
        if (tamanoActual == capacidadTotal) {
            System.out.println("La cola está llena. No se puede encolar más elementos.");
        } else {
            //Maneja el ciclo de la cola (circular)
            //Si la cola esta llena y desencolamos un elemento quedara como null para evitar errores
            //cuando se encole un nuevo elemento no se pasara de rango
            //Ejemplo si la cola fuera de 5 elementos [1,2,3,4,5] --> [null,2,3,4,5] -->[6,2,3,4,5]
            //Si no hicieramos esto saltaria una excepcion nos saldriamos de los rangos
            ultimoElemento = (ultimoElemento + 1) % capacidadTotal;
            tabla[ultimoElemento][0] = elemento; // Almacena el elemento en la tabla
            tamanoActual++;
        }
    }

    /**
     * Metodo para desencolar un elemento
     *
     * @return Devuelve el elemento desencolocado
     */
    public Integer desencolar() {
        if (tamanoActual == 0) {
            System.out.println("La cola está vacía. No se puede desencolar.");
            return null;
        } else {
            Integer elemento = tabla[primerElemento][0];
            primerElemento = (primerElemento + 1) % capacidadTotal; // Mueve el frente de la cola
            tamanoActual--;
            return elemento;
        }
    }

    /**
     * Metodo para obtener el primer elemento de la cola (sin desencolarlo)
     *
     * @return Devuelve el primer elemento
     */
    public Integer frente() {
        if (tamanoActual == 0) {
            System.out.println("La cola está vacía.");
            return null;
        }
        return tabla[primerElemento][0];
    }

    // Metodo para saber el tamaño actual de la cola
    public int tamano() {
        return tamanoActual;
    }

    // Metodo para mostrar los elementos de la cola
    public void mostrarCola() {
        if (tamanoActual == 0) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.print("Elementos en la cola: ");
            for (int i = 0; i < tamanoActual; i++) {
                System.out.print(tabla[(primerElemento + i) % capacidadTotal][0] + " ");
            }
            System.out.println();
        }
    }
}