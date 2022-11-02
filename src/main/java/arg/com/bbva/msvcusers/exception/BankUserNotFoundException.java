package arg.com.bbva.msvcusers.exception;

public class BankUserNotFoundException extends RuntimeException {

    public BankUserNotFoundException(Long id) {
        super("Could not find user " + id);
    }

}
