/**
 * @author Antonio Espínola Ramírez
 */

public class Pila {
    //Atributos
    private final Integer[] tabla;
    private final Integer tamanoPila;
    private Integer capacidadActual;

    //Constructor
    public Pila(Integer tamanoPila) {
        this.tamanoPila = tamanoPila;
        this.tabla = new Integer[tamanoPila]; //tamaño de la pila
        this.capacidadActual = -1; //La pila empieza vacia
    }

    /**
     * Apila un elemento en la pila
     *
     * @param elemento Elemento que se apila
     */
    public void apilar(Integer elemento) {
        if (capacidadActual == tamanoPila - 1) {
            System.out.println("La pila esta llena");
        } else {
            capacidadActual++; //Incremento el indice
            tabla[capacidadActual] = elemento; //Apilo el elemento en la pila
        }
    }

    /**
     * Desapila un elemento de la pila
     *
     * @return Devuelve el elemento desapilado
     */
    public Integer desapilar() {
        if (capacidadActual == -1) {
            System.out.println("La pila esta vacia");
            return null;
        } else {
            Integer elemento = tabla[capacidadActual];
            capacidadActual--;
            return elemento;
        }
    }

    /**
     * Muestra los elementos de la pila
     */
    public void mostrarPila() {
        if (capacidadActual == -1) {
            System.out.println("La pila esta vacia");
        } else {
            for (int i = 0; i <= capacidadActual; i++) {
                System.out.print(tabla[i] + " ");
            }
        }
    }

    /**
     * Metodo para obtener el ultimo elemento introducido de la cola (sin desencolarlo)
     *
     * @return Devuelve el ultimo elemento introducido
     */
    public Integer ultimoElemento() {
        if (capacidadActual == -1) {
            System.out.println("La pila está vacía.");
            return null;
        }
        return tabla[capacidadActual];
    }
}
