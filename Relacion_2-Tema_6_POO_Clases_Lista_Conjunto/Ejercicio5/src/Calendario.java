
/**
 * @author Antonio Espínola Ramírez
 */

public class Calendario {
    //Atributos
    private int anio;
    private int mes;
    private int dia;

    //Constructor
    public Calendario(int anio, int mes, int dia) {
        if (fechaValida(mes, dia)) {
            this.anio = anio;
            this.mes = mes;
            this.dia = dia;
        } else {
            System.out.println("La fecha introducida no es correcta");
        }
    }

    // Días de cada mes si tener en cuenta los años bisiestos
    private static final int[] DIAS_POR_MES = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /**
     * Validar la fecha sin tener en cuenta los años bisiestos
     *
     * @param mes mes
     * @param dia dia
     * @return Devuelve true si la fecha es valida
     */
    private boolean fechaValida(int mes, int dia) {
        return mes >= 1 && mes <= 12 && dia >= 1 && dia <= DIAS_POR_MES[mes];
    }

    /**
     * Incrementa un dia, tiene en cuenta que no se supere los dias que tiene un mes en concreto
     */
    public void incrementarDia() {
        dia++;
        if (dia > DIAS_POR_MES[mes]) {
            dia = 1;
            incrementarMes();
        }
    }

    /**
     * Incrementa un mes, si se pasa de los 12 incrementara un año
     */
    public void incrementarMes() {
        mes++;
        if (mes > 12) {
            mes = 1;
            anio++;
        }
    }

    /**
     * Incrementa una cantidad de años
     *
     * @param cantidad cantidad de años introducidos
     */
    public void incrementarAnio(int cantidad) {
        if (cantidad > 0) {
            anio += cantidad;
        }
    }

    /**
     * Muestra la fecha
     */
    public void mostrar() {
        System.out.println(anio + "-" + mes + "-" + dia);
    }

    /**
     * Compara dos fechas
     *
     * @param otraFecha otra fecha
     * @return Devuelve true si las dos fechas son iguales
     */
    public boolean iguales(Calendario otraFecha) {
        return this.anio == otraFecha.anio && this.mes == otraFecha.mes && this.dia == otraFecha.dia;
    }
}