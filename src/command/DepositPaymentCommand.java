package command;

public class DepositPaymentCommand implements PaymentOperation {
    private Account payment;
    private int amount;

    public DepositPaymentCommand(Account payment, int amount) {
        this.payment = payment;
        this.amount = amount;
    }

    @Override
    public Boolean execute() {
        return payment.deposit(amount);
    }
}
