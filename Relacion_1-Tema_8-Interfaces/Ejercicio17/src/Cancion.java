/**
 * @author Antonio Espinola Ramirez
 */

public class Cancion implements Reproductor {

    //Atributos
    private String nombre;

    //Constructor
    public Cancion(String nombre) {
        this.nombre = nombre;
    }

    //Getter nombre
    public String getNombre() {
        return nombre;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproducir la cancion: " + getNombre());
    }

    @Override
    public void pausa() {
        System.out.println("Cancion pausada");
    }

    @Override
    public void detener() {
        System.out.println("Cancion detenida");
    }
}
