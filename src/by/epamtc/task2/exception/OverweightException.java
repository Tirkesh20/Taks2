package by.epamtc.task2.exception;

public class OverweightException extends  Exception{
    public OverweightException() {
    }

    public OverweightException(String message) {
        super(message);
    }

    public OverweightException(String message, Throwable cause) {
        super(message, cause);
    }

    public OverweightException(Throwable cause) {
        super(cause);
    }
}
