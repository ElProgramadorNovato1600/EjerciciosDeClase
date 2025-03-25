/**
 * @author Antonio Espinola Ramirez
 */

public class TelevisorSmart implements AccionesTelevisor {

    //Atributos
    private String nombre;

    //Constructor
    public TelevisorSmart(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void encender() {
        System.out.println("El televisor esta encendido");
    }

    @Override
    public void apagar() {
        System.out.println("El televisor esta apagado");
    }

    @Override
    public void cambiarCanal(int canal) {
        System.out.println("has cambiado al canal " + canal);
    }

    @Override
    public void ajustarVolumen(int volumen) {
        System.out.println("Volumen ajustado a " + volumen);
    }
}
