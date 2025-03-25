/**
 * @author Antonio Espinola Ramirez
 */

public class Rectangulo {

    //Atributos
    private int base;
    private int altura;
    private static int rectangulosCreados = 0;

    //Constructor
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        rectangulosCreados++;
    }

    //Getters
    public static int getRectangulosCreados() {
        return rectangulosCreados;
    }

    @Override
    public String toString() {
        String resultado = "";
        for (int i = 0; i < altura; i++) {
            resultado += "*".repeat(base) + "\n";
        }
        return resultado;
    }
}
