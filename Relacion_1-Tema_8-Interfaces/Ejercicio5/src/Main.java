/**
 * @author Antonio Espinola Ramirez
 */

public class Main {
    public static void main(String[] args) {
        Logger logger = new ConsolaLogger();

        // Registrando mensajes con diferentes niveles de severidad
        logger.logInfo("La aplicación se ha iniciado correctamente.");
        logger.logWarn("El archivo de configuración no se ha encontrado.");
        logger.logError("Error al intentar conectar con el servidor.");
        logger.logDebug("Se está procesando el archivo de entrada.");
    }
}