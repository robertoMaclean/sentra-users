package cl.technicaltest.user.exception;

public class UserExistException extends RuntimeException {

    public UserExistException(String message) {
        super(message);
    }

}
