package Ejercicio10.src.main.java;

/**
 * @author Antonio Espínola Ramírez
 */

public class ElementoCola {
    private Integer elemento;
    private ElementoCola siguiente;

    public ElementoCola(Integer elem, ElementoCola sig) {
        elemento = elem;
        siguiente = sig;
    }

    public Integer getElemento() {
        return elemento;
    }

    public ElementoCola getSiguiente() {
        return siguiente;
    }

    public void setElemento(Integer elem) {
        elemento = elem;
    }

    public void setSiguiente(ElementoCola sig) {
        siguiente = sig;
    }
}