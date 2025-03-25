/**
 * @author Antonio Espinola Ramirez
 */

public class Linea {

    //Atributos
    private Punto p1;
    private Punto p2;

    //Constructor
    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Línea formada por los puntos " + p1 + " y " + p2;
    }
}
