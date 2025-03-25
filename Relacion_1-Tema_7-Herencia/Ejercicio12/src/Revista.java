/**
 * @author Antonio Espinola Ramirez
 */

public class Revista extends Publicacion {
    //Atributo
    private int numero;

    //Constructor
    public Revista(String isbn, String titulo, int anioPublicacion, int numero) {
        super(isbn, titulo, anioPublicacion);
        this.numero = numero;
    }
}
