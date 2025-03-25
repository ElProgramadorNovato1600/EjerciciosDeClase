/**
 * @author Antonio Espinola Ramirez
 */


public class Podcast implements Reproductor {

    //Atributos
    private String nombre;

    //Constructor
    public Podcast(String nombre) {
        this.nombre = nombre;
    }

    //Getter nombre
    public String getNombre() {
        return nombre;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproducir el podcast " + getNombre());
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