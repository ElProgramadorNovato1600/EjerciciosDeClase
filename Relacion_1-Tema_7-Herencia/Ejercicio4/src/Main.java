/**
 * @author Antonio Espínola Ramírez
 */

public class Main {

    /*Crea la clase Fracción. Los atributos serán numerador y denominador. Y algunos de los
     métodos pueden ser invierte, simplifica, multiplica, divide, etc.*/

    public static void main(String[] args) {
        Fraccion f1 = new Fraccion(4, 8);
        Fraccion f2 = new Fraccion(2, 3);

        System.out.println("Fracción 1: " + f1);
        System.out.println("Fracción 2: " + f2);

        Fraccion multiplicacion = f1.multiplicar(f2);
        System.out.println("Multiplicación: " + multiplicacion);

        Fraccion division = f1.dividir(f2);
        System.out.println("División: " + division);

        f1.invierte();
        System.out.println("Fracción 1 invertida: " + f1);
    }
}