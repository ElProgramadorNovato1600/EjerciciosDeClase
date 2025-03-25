/**
 * @author Antonio Espinola Ramirez
 */

public class Rectangulo implements FiguraGeometrica {

    //Atributos
    private double base;
    private double altura;

    //Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base*altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2*(base+altura);
    }
}
