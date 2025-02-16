
/**
 * @author Antonio Espínola Ramírez
 */

public class EcuacionSegundoGrado {

    //Atributos
    private final double a;
    private final double b;
    private final double c;

    // Constructor que recibe los coeficientes
    public EcuacionSegundoGrado(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * @return Devuelve el discriminante
     */
    public double getDiscriminante() {
        return (b * b) - (4 * a * c);
    }

    /**
     * Metodo para verificar si el discriminante es positivo
     * si es menor de 0 no tiene soluciones
     * si es igual a 0 tiene una solucion
     * si es mayor de 0 tiene dos soluciones
     *
     * @return Si devuelve 0 o mas significa que la ecuacion tiene 1 o mas soluciones
     */
    public boolean tieneSolucionesReales() {
        return getDiscriminante() >= 0;
    }

    /**
     * Metodo para obtener las soluciones de la ecuación
     *
     * @return Devuelve la solucion de la ecuacion en caso de que tenga
     */
    public double[] resolver() {
        double discriminante = getDiscriminante();
        if (discriminante < 0) {
            return new double[0]; // No hay soluciones reales
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            return new double[]{x}; // Una única solución
        } else {
            double raizDiscriminante = Math.sqrt(discriminante);
            double x1 = (-b + raizDiscriminante) / (2 * a);
            double x2 = (-b - raizDiscriminante) / (2 * a);
            return new double[]{x1, x2}; // Dos soluciones
        }
    }
}