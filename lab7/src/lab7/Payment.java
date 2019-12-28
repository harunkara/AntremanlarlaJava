package lab7;

public abstract class Payment {

	private double cash;

	public double getCash() {
		return cash;
	}
	public void setCash(double cash) {
		this.cash = cash;
	}
	
	public Payment(double cash) {
		this.cash = cash;
	}
	
	public void paymentDetails() {
		
	}
}
