
/**
 * @author Antonio Espínola Ramírez
 */

public class Main {

    /*Escribe la clase Punto que representa un punto en el plano (con un componente x y un componente y), con los métodos:

     Punto (double x, double y): construye un objeto con los datos pasados como parámetros.
     void desplazaX (double dx): incrementa el componente x en la cantidad dx.
     void desplazaY (double dy): incrementa el componente y en la cantidad dy.
     void desplaza (double dx, double dy): desplaza ambos componentes según las cantidades dx (en el eje x) y dy (en el componente y).
     double distanciaEuclidea (Punto otro): calcula y devuelve la distancia euclidea entre el punto invocante y el punto otro.
     void muestra(): muestra por consola la información relativa al punto.*/

    public static void main(String[] args) {

        Punto p1 = new Punto(10,10);
        Punto p2 = new Punto(12,12);

        p1.desplazarX(16); //Aumenta 16   10+16= 26
        p1.desplazarY(16);
        p1.muestra();

        System.out.println("Distancia Euclidea: "+p1.distanciaEuclidea(p2));

    }
}