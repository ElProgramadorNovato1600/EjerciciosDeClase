/**
 * @author Antonio Espínola Ramírez
 */

public class MarcaPagina {

    //Atributo
    private int paginaActual;

    //Constructor
    public MarcaPagina() {
        this.paginaActual = 1; // Se comienza en la página 1
    }

    // Metodo para avanzar a la siguiente página
    public void avanzarPagina() {
        paginaActual++;
    }

    // Metodo para obtener la última página leída
    public int getPaginaActual() {
        return paginaActual;
    }

    // Metodo para comenzar desde el principio
    public void reiniciarLectura() {
        this.paginaActual = 1;
    }
}