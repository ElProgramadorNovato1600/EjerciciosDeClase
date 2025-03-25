/**
 * @author Antonio Espinola Ramirez
 */

public class Piramide {

    //Atributos
    private int altura;
    private static int piramidesCreadas = 0;

    public Piramide(int altura) {
        this.altura = altura;
        piramidesCreadas++;
    }

    //Getter
    public static int getPiramidesCreadas() {
        return piramidesCreadas;
    }

    @Override
    public String toString() {
        String resultado = "";
        for (int i = 1; i <= altura; i++) {
            int espacios = altura - i;
            int estrellas = 2 * i - 1;
            resultado += " ".repeat(espacios) + "*".repeat(estrellas) + "\n";
        }
        return resultado;
    }
}
