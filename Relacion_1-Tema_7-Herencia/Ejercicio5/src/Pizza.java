/**
 * @author Antonio Espinola Ramirez
 */

public class Pizza {

    //Atributos
    private String tipo; //tipo de pizza
    private String tamano; //tamaño de pizza
    private String estado;
    private static int totalPedidas = 0;
    private static int totalServidas = 0;

    //Constructor
    public Pizza(String tipo, String tamano) {
        this.tipo = tipo;
        this.tamano = tamano;
        this.estado = "Pedida";
        ++totalPedidas;
    }

    //Getters
    public static int getTotalPedidas() {
        return totalPedidas;
    }

    public static int getTotalServidas() {
        return totalServidas;
    }

    public void sirve() {
        if (estado.equals("Pedida")) {
            totalServidas++;
            estado = "Servida";
        } else {
            System.out.println("La pizza ya estaba servida");
        }
    }

    @Override
    public String toString() {
        return "Pizza " + tipo + " " + tamano + ", " + estado;
    }
}
