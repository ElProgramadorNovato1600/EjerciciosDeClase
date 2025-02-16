/**
 * @author Antonio Espínola Ramírez
 */

public class Main {

    /*# Añade a la clase conjunto los siguientes métodos estáticos:

    - static boolean include(Conjunto c1, Conjunto c2): que devuelve true si el está incluido en c2, es decir, si todos los
    elementos de c1 están también en c2.
    - static Conjunto union(Conjunto c1, Conjunto c2): devuelve un nuevo conjunto con todos los elementos que están en c1,
    en c2 o en ambos (elementos comunes y no comunes).
    - static intersection(Conjunto c1, Conjunto c2): que devuelve un nuevo conjunto con todos los elementos que están en c1
    y en c2 a la vez (elementos comunes).
    - static diferencia(Conjunto c1, Conjunto c2): que devuelve un nuevo conjunto con todos los elementos que están en c1,
    pero no en c2.*/

    public static void main(String[] args) {

        Conjunto conjunto1 = new Conjunto();

        conjunto1.insertar(1);
        conjunto1.insertar(4);
        conjunto1.insertar(2);
        conjunto1.insertar(10);

        Conjunto conjunto2 = new Conjunto();

        conjunto2.insertar(10);
        conjunto2.insertar(11);
        conjunto2.insertar(12);
        conjunto2.insertar(13);

        if (Conjunto.incluido(conjunto1,conjunto2)) {
            System.out.println("el conjunto 1 estan incluido en el conjunto 2");
        }else {
            System.out.println("el conjunto 1 no esta incluido en el conjunto 2");
        }

        Conjunto conjunto3 = Conjunto.union(conjunto1,conjunto2);
        //conjunto3.mostrarConjunto();


        Conjunto conjunto4 = Conjunto.interseccion(conjunto1,conjunto2);
        //conjunto4.mostrarConjunto();

        Conjunto conjunto5 = Conjunto.diferencia(conjunto1,conjunto2);
        //conjunto5.mostrarConjunto();
    }
}