package strategy;

public class MasterCardStrategy implements PaymentStrategy {
    private String cardNumber;
	private String cvv;
    private String expiryDate;

	public MasterCardStrategy(String cardNumber, String cvv, String expiryDate){
		this.cardNumber=cardNumber;
		this.cvv=cvv;
        this.expiryDate=expiryDate;
	}

    @Override
	public void pay(int amount) {
        System.out.println(this.cardNumber + ',' + this.cvv + ',' + this.expiryDate);
		System.out.println("Paid using MasterCard :: " + amount);
	}
}
