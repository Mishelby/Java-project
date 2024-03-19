package Main.ForErrors;

public class UserTypeError extends Exception{
    public UserTypeError() {
    }

    public UserTypeError(String message) {
        super(message);
    }

    public UserTypeError(String message, Throwable cause) {
        super(message, cause);
    }

    public UserTypeError(Throwable cause) {
        super(cause);
    }
}
