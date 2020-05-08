public class RomNumbersException extends Exception{
    public RomNumbersException() {
    }

    public RomNumbersException(String message) {
        super(message);
    }

    public RomNumbersException(String message, Throwable cause) {
        super(message, cause);
    }

    public RomNumbersException(Throwable cause) {
        super(cause);
    }

    public RomNumbersException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
