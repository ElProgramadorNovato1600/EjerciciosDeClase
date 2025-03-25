/**
 * @author Antonio Espinola Ramirez
 */

public class Ameba {
    private int peso;

    public Ameba() {
        this.peso = 3;
    }

    public void come(int peso) {
        if (peso > 1) {
            this.peso += (peso - 1);
        }
    }

    public void come(Ameba a1) {
        if (a1.peso > 1) {
            this.peso += (a1.peso - 1);
        }
        a1.peso = 0; //Fue comida por otra ameba
    }

    @Override
    public String toString() {
        return "Hola soy una ameba y peso " + peso + " microgramos";
    }
}
