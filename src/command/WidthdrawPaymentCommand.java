package command;

import java.lang.Exception;

public class WidthdrawPaymentCommand implements PaymentOperation {
    private Account payment;
    public final int amount;

    public WidthdrawPaymentCommand(Account payment,  int amount) {
        this.payment = payment;
        this.amount = amount;
    }

    @Override
    public Boolean execute() throws Exception {
        return payment.withdraw(amount);
    }
}
