/**
 * @author Antonio Espinola Ramirez
 */

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Canción, Podcast y Audiolibro
        Reproductor cancion = new Cancion("Ella baila sola");
        Reproductor podcast = new Podcast("The wild Project");
        Reproductor audiolibro = new AudioLibro("El gran libro de aventuras");

        // Probar los métodos de la canción
        cancion.reproducir();
        cancion.pausa();
        cancion.detener();

        // Probar los métodos del podcast
        podcast.reproducir();
        podcast.pausa();
        podcast.detener();

        // Probar los métodos del audiolibro
        audiolibro.reproducir();
        audiolibro.pausa();
        audiolibro.detener();
    }
}