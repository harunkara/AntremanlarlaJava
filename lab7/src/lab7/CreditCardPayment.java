package lab7;

public class CreditCardPayment extends Payment {
	private String name,expDate,number;

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	
	
	public CreditCardPayment(double cash, String name, String expDate, String number) {
		super(cash);
		this.name = name;
		this.expDate = expDate;
		this.number = number;
		try {
			if(cash<=0)
				throw new IllegalArgumentException();
			else {
				System.out.println("the cash payment="+cash);
				System.out.println("name="+name);
				System.out.println("date="+expDate);
				System.out.println("credit number="+number);
			}
				
		

		}
		catch(IllegalArgumentException e){
			System.out.println("sayý pozitif olmalý");
			
		}
	}


}
