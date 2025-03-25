/**
 * @author Antonio Espinola Ramirez
 */

public class JuegoAventura implements Juego{

    //Atributo
    private String nombreJugador;

    //Constructor
    public JuegoAventura(String nombre) {
        this.nombreJugador = nombre;
    }

    //Metodos de la interfaz
    @Override
    public void iniciar() {
        System.out.println("Inicia la aventura de "+nombreJugador);
    }

    @Override
    public void pausar() {
        System.out.println("Juego pausado");
    }

    @Override
    public void detener() {
        System.out.println("Juego detenido...");
    }
}
