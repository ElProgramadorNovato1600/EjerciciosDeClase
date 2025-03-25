/**
 * @author Antonio Espinola Ramirez
 */

public class Triangulo implements FiguraGeometrica {

    //Atributos
    private double base;
    private double altura;
    private double lado; //supongamos que todos los lados tienen la misma longuitud

    //Constructor
    public Triangulo(double base, double altura,double lado) {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (base*altura)/2;
    }

    //La suma de todos sus lados es el perimetro
    @Override
    public double calcularPerimetro() {
        return lado*3;
    }
}
