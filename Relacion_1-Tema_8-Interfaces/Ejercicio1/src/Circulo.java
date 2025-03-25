/**
 * @author Antonio Espinola Ramirez
 */

public class Circulo implements FiguraGeometrica {

    //Atributos
    private double diametro;
    private double radio;

    //Constructor
    public Circulo(double diametro, double radio) {
        this.diametro = diametro;
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI * diametro;
    }
}
