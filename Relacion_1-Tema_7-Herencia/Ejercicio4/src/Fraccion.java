/**
 * @author Antonio Espinola Ramirez
 */

public class Fraccion {
    private int numerador;
    private int denominador;

    // Constructor
    public Fraccion(int numerador, int denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("El denominador no puede ser cero");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        simplifica();
    }

    // Metodo para invertir la fracción
    public void invierte() {
        if (numerador == 0) {
            throw new ArithmeticException("No se puede invertir una fracción con numerador 0");
        }
        int temp = numerador;
        numerador = denominador;
        denominador = temp;
    }

    // Metodo para simplificar la fracción
    private void simplifica() {
        int mcd = mcd(numerador, denominador);
        numerador /= mcd;
        denominador /= mcd;
    }

    // Metodo auxiliar para calcular el Máximo Común Divisor (MCD)
    private int mcd(int a, int b) {
        if (b == 0) return Math.abs(a);
        return mcd(b, a % b);
    }

    // Metodo para multiplicar fracciones
    public Fraccion multiplicar(Fraccion otra) {
        return new Fraccion(this.numerador * otra.numerador, this.denominador * otra.denominador);
    }

    // Metodo para dividir fracciones
    public Fraccion dividir(Fraccion otra) {
        return new Fraccion(this.numerador * otra.denominador, this.denominador * otra.numerador);
    }

    // Metodo para mostrar la fracción
    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}