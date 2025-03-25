/**
 * @author Antonio Espinola Ramirez
 */

public interface OperacionBancarias {

    void depositar(double cantidad);
    void retirar(double cantidad);
    void consultarSaldo();
}
