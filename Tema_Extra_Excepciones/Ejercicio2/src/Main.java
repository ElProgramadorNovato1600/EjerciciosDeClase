/**
 * @author Antonio Espinola Ramirez
 */

public class Main {
    public static void main(String[] args) {

        try {
            int[] numeros = {1, 2, 3, 4, 5};
            System.out.println("Intentando acceder a un indice fuera de limites...");
            System.out.println(numeros[10]); // Índice fuera de límites
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de los límites del array.");
        }
    }
}