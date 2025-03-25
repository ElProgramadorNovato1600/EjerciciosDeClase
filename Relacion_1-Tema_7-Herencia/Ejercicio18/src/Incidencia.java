/**
 * @author Antonio Espinola Ramirez
 */

public class Incidencia {
    //Atributo
    private static int pendientes = 0;
    private int codigo;
    private final int puesto;
    private final String problema;
    private String estado;
    private String solucion;

    //Constructor
    public Incidencia(int incidencia,int puesto, String problema) {
        this.codigo = incidencia;
        this.puesto = puesto;
        this.problema = problema;
        this.estado = "Pendiente";
        pendientes++;
    }

    /**
     * Resuelve la incidencia
     * @param solucion incidencia propuesta
     */
    public void resuelve(String solucion) {
        if (this.estado.equals("Pendiente")) {
            this.solucion = solucion;
            this.estado = "Resuelta";
            pendientes--;
        }
    }

    public static int getPendientes() {
        return pendientes;
    }

    @Override
    public String toString() {
        String resultado = "Incidencia " + codigo + " - Puesto: " + puesto + " - " + problema + " - " + estado;
        if (estado.equals("Resuelta")) {
            resultado += " - " + solucion;
        }
        return resultado;
    }
}