/**
 * @author Antonio Espinola Ramirez
 */

public class Main {
    public static void main(String[] args) {
        DocumentoTexto documento = new DocumentoTexto("Este es un texto de prueba");

        // Usar los métodos de la interfaz Formateable
        System.out.println("Texto original: " + documento.getTexto());
        documento.negrita();    // Mostrar el texto en negrita
        documento.cursiva();    // Mostrar el texto en cursiva
        documento.subrayado();  // Mostrar el texto subrayado
    }
}