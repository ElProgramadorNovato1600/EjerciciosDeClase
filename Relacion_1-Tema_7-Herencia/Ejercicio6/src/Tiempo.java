/**
 * @author Antonio Espinola Ramirez
 */

public class Tiempo {

    //Atributos
    private int hora;
    private int minutos;
    private int segundos;


    //Constructor
    public Tiempo(int hora, int minutos, int segundos) {
        if (minutos < 60 && segundos < 60) {
            this.hora = hora;
            this.minutos = minutos;
            this.segundos = segundos;
        }
    }

    /**
     * Metodo que suma tiempo validando los minutos y segundos, las horas no se validan por que no se especifica
     * que sea tiempo de dia
     *
     * @param horas horas
     * @param min   minutos
     * @param seg   segundos
     */
    public void sumar(int horas, int min, int seg) {
        if (seg >= 60 || min >= 60) {
            System.out.println("No se puede realizar la suma");
        } else {
            this.segundos += seg;
            this.minutos += min;
            this.hora += horas;
            while ((this.segundos >= 60) || (this.minutos >= 60)) {
                if (this.segundos >= 60) {
                    this.minutos++;
                    this.segundos -= 60;
                }
                if (this.minutos >= 60) {
                    this.hora++;
                    this.minutos -= 60;
                }
            }
        }
    }

    /**
     * Metodo que resta el tiempo validando los minutos y segundos, las horas no se validan por que no se especifica
     * que sea tiempo de dia
     *
     * @param horas hora
     * @param min   minutos
     * @param seg   segundos
     */
    public void restar(int horas, int min, int seg) {
        int horaRestadas;
        int minRestados;
        int segRestados;
        if (this.hora < horas || seg >= 60 || min >= 60) {
            System.out.println("No se puede realizar la resta");
        } else {
            horaRestadas = this.hora - horas;
            minRestados = this.minutos - min;
            segRestados = this.segundos - seg;
            if (minRestados < 0 && horaRestadas > 0) {
                this.hora--;
                minRestados *= -1; //Cambiar el valor a positivo
            }
            if (segRestados < 0 && minRestados > 0) {
                minRestados--;
                segRestados *= -1; //Cambiar el valor a positivo
            }
            //Si no se puede realizar la resta aparecera un mensaje por pantalla
            if (segRestados < 0 || minRestados < 0) {
                System.out.println("No se puede realizar la resta");
            } else {
                this.hora = horaRestadas;
                this.minutos = minRestados;
                this.segundos = segRestados;
            }
        }
    }

    @Override
    public String toString() {
        return hora + "h " + minutos + "m " + segundos + "s";
    }
}
