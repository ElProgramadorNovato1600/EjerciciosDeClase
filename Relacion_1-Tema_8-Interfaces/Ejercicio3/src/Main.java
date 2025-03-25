/**
 * @author Antonio Espinola Ramirez
 */

public class Main {
    public static void main(String[] args) {

        Palabra p1 = new Palabra("antonio");
        Palabra p2 = new Palabra("lucia");
        String palabra = "ordenador";

        System.out.println(p1.comparar(p2));
        System.out.println(p1.comparar(palabra));

    }
}