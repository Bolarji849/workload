public class Account{
	private String firstName;
	private String lastName;
	private String pin;
	private double balance;

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getFirstName(){
		return firstName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;

	}
		
	public String getLastName(){
		return lastName;
	}

	public void setPin(String pin){
		this.pin = pin;
	}
	
	public String getPin(){
		return pin;
	}

	public double balance(){
		return balance;
	}

}