package Main.ForErrors;

public class UserInfoError extends Exception{
    public UserInfoError() {
    }

    public UserInfoError(String message) {
        super(message);
    }

    public UserInfoError(String message, Throwable cause) {
        super(message, cause);
    }

    public UserInfoError(Throwable cause) {
        super(cause);
    }
}
