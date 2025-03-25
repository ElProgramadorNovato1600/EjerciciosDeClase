/**
 * @author Antonio Espinola Ramirez
 */

public class ReproductorMP3 implements ReproductorMusical {

    //Atributos
    private String nombre;

    //Constructor
    public ReproductorMP3(String nombre) {
        this.nombre = nombre;
    }

    //Getter del nombre
    public String getNombre() {
        return nombre;
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausa");
    }

    @Override
    public void detenerMusica() {
        System.out.println("Se ha detenido la musica");
    }

    @Override
    public void reproducirMusica() {
        System.out.println("Reproduciendo musica");
    }
}
