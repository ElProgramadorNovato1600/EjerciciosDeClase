/**
 * @author Antonio Espinola Ramirez
 */

public class Libro extends Publicacion implements Prestable {

    //Atributos
    private boolean prestado;

    //Constructor
    public Libro(String isbn, String titulo, int anioPublicacion) {
        super(isbn, titulo, anioPublicacion);
        this.prestado = false;
    }

    //Metodos sobrecargados implementados de la interfaz Prestable
    @Override
    public void presta() {
        if (!prestado) {
            this.prestado = true;
        } else {
            System.out.println("Lo siento, el libro ya esta prestado");
        }
    }

    @Override
    public void devuelve() {
        prestado = false;
    }

    @Override
    public boolean estaPrestado() {
        return prestado;
    }

    @Override
    public String toString() {
        return super.toString() + (prestado ? " (prestado)" : " (no prestado)");
    }
}