/**
 * @author Antonio Espinola Ramirez
 */

public class Punto {
    //Atributos
    private double px;
    private double py;

    //Constructor
    public Punto(double px, double py) {
        this.px = px;
        this.py = py;
    }

    @Override
    public String toString() {
        return "("+px+", "+py+")";
    }
}
