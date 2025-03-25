/**
 * @author Antonio Espinola Ramirez
 */

public class ComparadorStrings implements Comparador {

    public int comparar(Object o1, Object o2) {
        if (o1 instanceof String && o2 instanceof String) {
            String str1 = (String) o1;
            String str2 = (String) o2;

            // Retorna un valor negativo si str1 es menor que str2, 0 si son iguales y positivo si str1 es mayor
            return str1.compareTo(str2);
        }
        throw new IllegalArgumentException("Ambos objetos deben ser instancias de String");
    }
}
