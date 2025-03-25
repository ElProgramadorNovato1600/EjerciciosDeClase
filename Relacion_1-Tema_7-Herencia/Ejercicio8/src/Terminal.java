/**
 * @author Antonio Espinola Ramirez
 */

public class Terminal {
    private final String numero;
    private int segundosConversacion;

    public Terminal(String numero) {
        this.numero = numero;
        this.segundosConversacion = 0;
    }

    public void llama(Terminal t1, int segundos) {
        this.segundosConversacion += segundos;
        t1.segundosConversacion += segundos;
    }

    @Override
    public String toString() {
        return "Nº "+this.numero+" - "+this.segundosConversacion+"s de conversacion";
    }
}
