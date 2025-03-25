/**
 * @author Antonio Espinola Ramirez
 */

public interface Logger {
    void logInfo(String message);
    void logWarn(String message);
    void logError(String message);
    void logDebug(String message);
}
