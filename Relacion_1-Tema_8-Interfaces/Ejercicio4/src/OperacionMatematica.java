import java.sql.SQLOutput;

/**
 * @author Antonio Espinola Ramirez
 */

public interface OperacionMatematica {
    static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    static int restar(int num1, int num2) {
        return num1 - num2;
    }

    static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    static int dividir(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("No se puede divir por 0");
            return -1;
        }
        return num1 / num2;
    }
}
