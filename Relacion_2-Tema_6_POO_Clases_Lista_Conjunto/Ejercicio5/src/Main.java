
/**
 * @author Antonio Espínola Ramírez
 */

public class Main {

    /*Diseña la clase calendario que representa una fecha concreta (año, mes y día). La clase debe disponer de los métodos:

     Calendario (int año, int mes, int dia): que crea un objeto con los datos pasados como parámetros, siempre y cuando,
      la fecha que representen sea correcta.
     void incrementarDia (): que incrementa en un dia la fecha del calendario.
     void incrementarMes(): que incrementa en un mes la fecha del calendario.
     void incrementarAño (int cantidad): que incrementa la fecha del calendario en el número de años especificados.
     Ten en cuenta que el año o no existió.
     void mostrar(): muestra la fecha por consola.
     boolean iguales (Calendario otraFecha): que determina si la fecha invocante y la que se pasa como parámetro son iguales o distintas.
     Por simplicidad, solo tendremos en consideración que existen meses con distinto número de días, pero no tendremos
     en cuenta los años bisiestos.*/

    public static void main(String[] args) {
        //Creamos objeto fecha
        Calendario fecha = new Calendario(2025, 2, 11);
        fecha.mostrar();

        fecha.incrementarDia();
        fecha.mostrar();

        fecha.incrementarMes();
        fecha.mostrar();

        fecha.incrementarAnio(2);
        fecha.mostrar();

        Calendario otraFecha = new Calendario(2027, 3, 12);
        System.out.println(fecha.iguales(otraFecha));
    }
}