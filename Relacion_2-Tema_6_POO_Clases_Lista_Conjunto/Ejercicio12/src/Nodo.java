/**
 *
 * @author Antonio Espínola Ramírez
 */
public class Nodo {
    private int elemento;
    private Nodo siguiente;
    
    public Nodo(int elem, Nodo sig){
        elemento = elem;
        siguiente = sig;
    }
    
    public int getElemento(){
        return elemento;
    }
    public Nodo getSiguiente(){
        return siguiente;
    }
    public void setElemento(int elem){
        elemento = elem;
    }
    public void setSiguiente(Nodo sig){
        siguiente = sig;
    }
}
