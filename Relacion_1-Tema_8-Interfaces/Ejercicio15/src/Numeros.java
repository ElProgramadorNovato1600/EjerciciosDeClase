/**
 * @author Antonio Espinola Ramirez
 */

public class Numeros {
    private int elemento;
    private Numeros siguiente;

    public Numeros(int elem, Numeros sig) {
        elemento = elem;
        siguiente = sig;
    }

    public int getElemento() {
        return elemento;
    }

    public Numeros getSiguiente() {
        return siguiente;
    }

    public void setElemento(int elem) {
        elemento = elem;
    }

    public void setSiguiente(Numeros sig) {
        siguiente = sig;
    }
}