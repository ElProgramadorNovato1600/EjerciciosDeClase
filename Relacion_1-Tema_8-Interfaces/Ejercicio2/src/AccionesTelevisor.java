/**
 * @author Antonio Espinola Ramirez
 */

public interface AccionesTelevisor {

    /**
     * Enciende el televisor.
     */
    void encender();

    /**
     * Apaga el televisor.
     */
    void apagar();

    /**
     * Cambia el canal del televisor.
     * @param canal canal Canal deseado
     */
    void cambiarCanal(int canal);

    /**
     * Ajusta el volumen del televisor.
     *
     * @param volumen El volumen deseado.
     */
    void ajustarVolumen(int volumen);
}