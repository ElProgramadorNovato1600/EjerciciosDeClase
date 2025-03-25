/**
 * @author Antonio Espinola Ramirez
 */


public class Main {

    /*Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase Tiempo
     son intervalos de tiempo y se crean de la forma Tiempo t = new Tiempo(1, 20, 30)
     donde los parámetros que se le pasan al constructor son las horas, los minutos
     y los segundos respectivamente. Crea el metodo toString para ver los intervalos
     de tiempo de la forma 10h 35m 5s. Si se suman por ejemplo 30m 40s y 35m 20s el
     resultado debería ser 1h 6m 0s. Realiza un programa de prueba para comprobar
     que la clase funciona bien.*/

    public static void main(String[] args) {

        //Suma
        Tiempo t1 = new Tiempo(10, 50, 50);
        t1.sumar(0, 9, 10);
        System.out.println(t1);


        System.out.println("-------------------------------------"); //Separador

        //Resta
        Tiempo t2 = new Tiempo(0, 30, 0);
        t2.restar(0, 50, 0);//Resta no posible
        System.out.println(t2);


        t2.restar(0, 20, 0); //Resta Posible
        System.out.println(t2);
    }
}