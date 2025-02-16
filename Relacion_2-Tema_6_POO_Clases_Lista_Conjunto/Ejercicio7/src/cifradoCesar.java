
/**
 * @author Antonio Espínola Ramírez
 */

public class cifradoCesar {

    /**
     * Cifrado Cesar comprueba las letras, obtiene la posicion y le suma el desplazamiento
     * Ejemplo: letra A + desplazamiento 2 = letra C
     *
     * @param texto          Texto introducido
     * @param desplazamiento Desplazamiento
     * @return Devuelve una cadena de texto ya cifrada
     */
    public static String cifrar(String texto, int desplazamiento) {
        String letrasMayusculas = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String letrasMinusculas = letrasMayusculas.toLowerCase();
        char[] caracteres = texto.toCharArray();

        for (int i = 0; i < caracteres.length; i++) {
            char letra = caracteres[i];
            if (Character.isLetter(letra)) {
                String alfabeto = Character.isUpperCase(letra) ? letrasMayusculas : letrasMinusculas;
                int pos = alfabeto.indexOf(letra);
                if (pos != -1) {
                    //Con el % evitamos que se salga del rango de las letras.
                    caracteres[i] = alfabeto.charAt((pos + desplazamiento) % alfabeto.length());
                }
            }
        }
        return new String(caracteres);
    }
}