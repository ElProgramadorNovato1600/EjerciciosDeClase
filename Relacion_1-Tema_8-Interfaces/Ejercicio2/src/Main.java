/**
 * @author Antonio Espinola Ramirez
 */

public class Main {
    public static void main(String[] args) {

        TelevisorSmart televisionAntonio = new TelevisorSmart("TeleAntonio");

        //Pruebo los metodos
        televisionAntonio.encender();
        televisionAntonio.ajustarVolumen(12);
        televisionAntonio.cambiarCanal(5);
        televisionAntonio.apagar();
    }
}