/**
 * @author Antonio Espinola Ramirez
 */

public class Main {
    public static void main(String[] args) {
        ReproductorMP3 reproductor = new ReproductorMP3("Mi Reproductor MP3");

        // Usar los métodos del ReproductorMP3
        System.out.println("Usando el reproductor: " + reproductor.getNombre());
        reproductor.reproducirMusica();
        reproductor.pausarMusica();
        reproductor.detenerMusica();
    }
}