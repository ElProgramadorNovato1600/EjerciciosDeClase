/**
 * @author Antonio Espinola Ramirez
 */

public class Main {

    /*Define una interfaz FiguraGeometrica con métodos para calcular el área y el perímetro.
     Implementa esta interfaz en clases como Rectangulo, Circulo y Triangulo.*/
    public static void main(String[] args) {

        Rectangulo r1 = new Rectangulo(2,2);
        Triangulo t1 = new Triangulo(2,2,4);
        Circulo c1 = new Circulo(3,3);


        // Mostrar los resultados
        System.out.println("Rectángulo:");
        System.out.println("Área: " + r1.calcularArea());
        System.out.println("Perímetro: " + r1.calcularPerimetro());

        System.out.println("\nTriángulo:");
        System.out.println("Área: " + t1.calcularArea());
        System.out.println("Perímetro: " + t1.calcularPerimetro());

        System.out.println("\nCírculo:");
        System.out.println("Área: " + c1.calcularArea());
        System.out.println("Perímetro: " + c1.calcularPerimetro());
    }
}