
/**
 * @author Antonio Espínola Ramírez
 */

public class Cambio {
    // Definir los billetes y monedas disponibles en orden descendente
    private static final int[] BILLETES = {500, 200, 100, 50, 20, 10, 5, 2, 1};
    private static final int[] CENTIMOS = {50, 20, 10, 5, 2, 1};  // Array para las monedas

    /**
     * Metodo que muestra el desglose del cambio en billetes y monedas
     *
     * @param euros importe a desglosar (en céntimos)
     */
    public void calcularCambio(int euros, int centimos) {
        System.out.println("Cambio para " + euros + "," + centimos + " euros:");

        // Desglosar los billetes
        for (int i = 0; i < BILLETES.length; i++) {
            int numeroBilletesOMonedas = (euros / (BILLETES[i]));  // Convertir los billetes a céntimos
            if (numeroBilletesOMonedas > 0) {
                System.out.println(numeroBilletesOMonedas + " x " + BILLETES[i] + "€");
                euros %= (BILLETES[i]); // Actualizar el importe restante en céntimos
            }
        }
        // Desglosar los centimos
        for (int i = 0; i < CENTIMOS.length; i++) {
            int numeroMonedas = (centimos / CENTIMOS[i]);
            if (numeroMonedas > 0) {
                System.out.println(numeroMonedas + " x " + CENTIMOS[i] + "centimos");
                centimos %= CENTIMOS[i]; // Actualizar el importe restante en céntimos
            }
        }
    }
}