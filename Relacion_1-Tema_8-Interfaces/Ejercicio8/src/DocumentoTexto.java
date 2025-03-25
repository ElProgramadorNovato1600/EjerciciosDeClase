/**
 * @author Antonio Espinola Ramirez
 */

public class DocumentoTexto implements Formateable{

    //Atributo
    private String texto;

    //Constructor
    public DocumentoTexto(String texto) {
        this.texto = texto;
    }


    // Métodos de la interfaz Formateable

    @Override
    public void negrita() {
        System.out.println("Texto en negrita: **" + texto + "**");
    }

    @Override
    public void cursiva() {
        System.out.println("Texto en cursiva: *" + texto + "*");
    }

    @Override
    public void subrayado() {
        System.out.println("Texto subrayado: _" + texto + "_");
    }

    // Getter para el texto
    public String getTexto() {
        return texto;
    }

    // Setter para el texto
    public void setTexto(String texto) {
        this.texto = texto;
    }
}