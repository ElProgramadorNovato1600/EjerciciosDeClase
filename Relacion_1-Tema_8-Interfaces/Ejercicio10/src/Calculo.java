/**
 * @author Antonio Espinola Ramirez
 */

public interface Calculo {


    // Metodo privado que realiza una suma
    private double calcular(double num1, double num2) {
        return num1 + num2;
    }

    // Metodo por defecto que imprime el resultado del cálculo
    default void imprimirResultado(double num1, double num2) {
        double resultado = calcular(num1, num2);
        System.out.println("El resultado de la operación es: " + resultado);
    }
}