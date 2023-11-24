package command;

public class Main {
    public static void main(String[] args) {
        try {
            PaymentOperationExecutor paymentOperationExecutor = new PaymentOperationExecutor();

            Account account = new Account(0);
            DepositPaymentCommand deposit = new DepositPaymentCommand(account, 10);
            WidthdrawPaymentCommand widthdraw = new WidthdrawPaymentCommand(account, 100);

            paymentOperationExecutor.executeCommand(deposit);
            paymentOperationExecutor.executeCommand(widthdraw);
        } catch (Exception err) {
            System.out.println(err.getMessage() + "!!!");
        }
    }
}

