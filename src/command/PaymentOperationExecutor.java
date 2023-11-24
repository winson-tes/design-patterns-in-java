package command;

import java.util.List;
import java.util.ArrayList;

public class PaymentOperationExecutor {
    private final List<PaymentOperation> paymenyOperations = new ArrayList<>();
   
    public Boolean executeCommand(PaymentOperation paymentOperation) throws Exception {
        paymenyOperations.add(paymentOperation);
        return paymentOperation.execute();
    }
}
