/**
 * @author Antonio Espinola Ramirez
 */

public class Calculadora implements OperacionMatematica{

    //Atributos
    private int num1;
    private int num2;

    //Constructor
    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Métodos para realizar operaciones usando la interfaz OperacionMatematica
    public int sumar() {
        return OperacionMatematica.sumar(num1, num2);
    }

    public int restar() {
        return OperacionMatematica.restar(num1, num2);
    }

    public int multiplicar() {
        return OperacionMatematica.multiplicar(num1, num2);
    }

    public int dividir() {
        return OperacionMatematica.dividir(num1, num2);
    }
}
