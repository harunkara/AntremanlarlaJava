package lab7;

public class CashPayment extends Payment {

	public CashPayment(double cash) {
		super(cash);
		try {
			if(cash<=0)
				throw new IllegalArgumentException();
			else
				System.out.println("the cash payment="+cash);
		

		}
		catch(IllegalArgumentException e){
			System.out.println("sayý pozitif olmalý");
			
		}
	
	}
	public void paymentDetails() {
		
	}

}
