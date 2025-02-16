
/**
 * @author Antonio Espínola Ramírez
 */

public class Punto {
    //Atributos
    private double x;
    private double y;

    //Constructor
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Incrementa el componente x en la cantidad dx
    public void desplazarX(double dx) {
        this.x += dx;
    }

    //Incrementa el componente y en la cantidad dy
    public void desplazarY(double dy) {
        this.y += dy;
    }

    //Incrementa el componente x en la cantidad dx
    //Incrementa el componente y en la cantidad dy
    public void desplaza(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    /**
     * Calcula la distancia euclídea entre dos puntos d = √((x2 - x1)² + (y2 - y1)²)
     * @param otro Otro Punto
     * @return Devuelve la distancia Euclidea
     */
    public double distanciaEuclidea(Punto otro) {
        double dx = this.x - otro.x;
        double dy = this.y - otro.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    /**
     * Muesta la informacion del punto
     */
    public void muestra() {
        System.out.println("Punto: " + x + ", " + y);
    }
}
