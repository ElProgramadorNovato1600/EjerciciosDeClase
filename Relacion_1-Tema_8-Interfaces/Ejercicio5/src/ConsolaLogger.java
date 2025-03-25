/**
 * @author Antonio Espinola Ramirez
 */

public class ConsolaLogger implements Logger {

    @Override
    public void logInfo(String message) {
        System.out.println("[INFO] " + message);
    }

    @Override
    public void logWarn(String message) {
        System.out.println("[WARN] " + message);
    }

    @Override
    public void logError(String message) {
        System.out.println("[ERROR] " + message);
    }

    @Override
    public void logDebug(String message) {
        System.out.println("[DEBUG] " + message);
    }
}