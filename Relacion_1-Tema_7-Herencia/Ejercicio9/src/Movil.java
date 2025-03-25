import java.text.DecimalFormat;

/**
 * @author Antonio Espinola Ramirez
 */


public class Movil extends Terminal {
    private String tarifa;
    private double costeTotal;

    public Movil(String numero, String tarifa) {
        super(numero);
        this.tarifa = tarifa;
        this.costeTotal = 0;
    }

    @Override
    public void llama(Terminal otro, int segundos) {
        super.llama(otro, segundos);

        double costePorSegundo = switch (this.tarifa) {
            case "rata" -> 0.06 / 60;
            case "mono" -> 0.12 / 60;
            case "bisonte" -> 0.30 / 60;
            default -> 0;
        };

        this.costeTotal += costePorSegundo * segundos;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return super.toString() + " - tarificados " + df.format(this.costeTotal) + " euros";
    }
}