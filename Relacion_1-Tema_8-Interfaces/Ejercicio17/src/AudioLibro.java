/**
 * @author Antonio Espinola Ramirez
 */


public class AudioLibro implements Reproductor {
    //Atributos
    private String nombre;

    //Constructor
    public AudioLibro(String nombre) {
        this.nombre = nombre;
    }

    //Getter nombre
    public String getNombre() {
        return nombre;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproducir el audiolibro " + getNombre());
    }

    @Override
    public void pausa() {
        System.out.println("Podcast pausada");
    }

    @Override
    public void detener() {
        System.out.println("Podcast detenida");
    }
}
