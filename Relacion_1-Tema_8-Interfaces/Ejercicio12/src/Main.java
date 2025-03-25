/**
 * @author Antonio Espinola Ramirez
 */

public class Main {
    public static void main(String[] args) {
        Comparador comparador = new ComparadorStrings();

        String str1 = "apple";
        String str2 = "banana";

        int resultado = comparador.comparar(str1, str2);

        if (resultado < 0) {
            System.out.println(str1 + " es menor que " + str2);
        } else if (resultado > 0) {
            System.out.println(str1 + " es mayor que " + str2);
        } else {
            System.out.println(str1 + " es igual a " + str2);
        }
    }
}