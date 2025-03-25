/**
 * @author Antonio Espinola Ramirez
 */

public class Main {
    public static void main(String[] args) {

        Calculadora c1 = new Calculadora(2, 0);

        System.out.println(c1.sumar());//Sumar
        System.out.println(c1.restar());//Restar
        System.out.println(c1.multiplicar());//Multiplicar
        System.out.println(c1.dividir());//Dividir
    }
}