/**
 * @author Antonio Espinola Ramirez
 */

public class Publicacion {
    protected String isbn;
    protected String titulo;
    protected int anioPublicacion;

    public Publicacion(String isbn, String titulo, int anioPublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn + ", título: " + titulo + ", año de publicación: " + anioPublicacion;
    }
}
