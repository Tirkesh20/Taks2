package by.epamtc.task2.exception;

public class NoMuchFound extends Exception{
    public NoMuchFound() {
    }

    public NoMuchFound(String message) {
        super(message);
    }

    public NoMuchFound(String message, Throwable cause) {
        super(message, cause);
    }

    public NoMuchFound(Throwable cause) {
        super(cause);
    }
}
