/**
 * @author Antonio Espinola Ramirez
 */

public class FichaDomino {

    //Atributos
    private int numeroIzquierda;
    private int numeroDerecha;
    private boolean volteado;

    //Constructor
    public FichaDomino(int numeroIzquierda, int numeroDerecha) {
        this.numeroIzquierda = numeroIzquierda;
        this.numeroDerecha = numeroDerecha;
        volteado = false;
    }

    /**
     * Voltea la ficha de domino
     */
    public FichaDomino voltea() {
        int aux = numeroIzquierda;
        numeroIzquierda = numeroDerecha;
        numeroDerecha = aux;
        volteado = true;
        return this; //Devuelve la propia ficha
    }

    public boolean encaja(FichaDomino f) {
        return numeroIzquierda == f.numeroIzquierda || numeroIzquierda == f.numeroDerecha ||
                numeroDerecha == f.numeroIzquierda || numeroDerecha == f.numeroDerecha;
    }

    /**
     * Devuelve una representación en forma de cadena de la ficha de dominó.
     * Si un lado tiene el valor 0, se debe mostrar como un espacio vacío.
     * @return La cadena que representa la ficha
     */
    @Override
    public String toString() {
        String izquierda = (numeroIzquierda == 0) ? " " : Integer.toString(numeroIzquierda);
        String derecha = (numeroDerecha == 0) ? " " : Integer.toString(numeroDerecha);
        return "[" + izquierda + "|" + derecha + "]";
    }
}