package TeachMeSkills.Exceptions;

public class WrongPasswordException extends Exception {

    public WrongPasswordException(String message) {
        super("Either login or password is incorrect. Please, try again.");
    }
}
