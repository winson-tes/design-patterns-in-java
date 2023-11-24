package strategy;

class Main {
    public static void main(String[] args) {
        PaymentContext payWithVisa = new PaymentContext(new VisaStrategy("4659-xxxx-xxxx-xxx", "123", "01/29"));
        payWithVisa.pay(10);

        PaymentContext payWithMasterCard = new PaymentContext(new MasterCardStrategy("4659-xxxx-xxxx-xxx", "123", "01/29"));
        payWithMasterCard.pay(10);
    }
}