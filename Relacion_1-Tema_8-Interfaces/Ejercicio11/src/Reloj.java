/**
 * @author Antonio Espinola Ramirez
 */

public class Reloj implements Evento {
    private boolean enFuncionamiento;  // Indica si el reloj está en funcionamiento

    // Constructor
    public Reloj() {
        this.enFuncionamiento = false;
    }

    @Override
    public void iniciar() {
        if (!enFuncionamiento) {
            enFuncionamiento = true;
            System.out.println("Reloj iniciado. Mostrando hora...");
        } else {
            System.out.println("El reloj ya está en funcionamiento.");
        }
    }

    @Override
    public void pausar() {
        if (enFuncionamiento) {
            enFuncionamiento = false;
            System.out.println("Reloj pausado.");
        } else {
            System.out.println("El reloj ya está pausado.");
        }
    }

    @Override
    public void detener() {
        enFuncionamiento = false;
        System.out.println("Reloj detenido.");
    }
}