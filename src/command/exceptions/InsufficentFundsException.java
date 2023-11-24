package command.exceptions;

public class InsufficentFundsException extends Exception {
    public InsufficentFundsException() {
        super("You have insufficent funds");
    }
}
