package entities;

public class Account {

	private int account;
	private String name;
	private double value;
	
	//Constructors
	public Account(int account, String name, double initialValue) {
		this.account = account;
		this.name = name;
		deposit(initialValue);
	}
		public Account(int account, String name) {
		this.account = account;
		this.name = name;
	}

	//Getters and Setters
	public int getAccount() {
		return account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}

	
	//Other Functions
	public void deposit(double Value) {
		this.value += Value;
	}
	
	public void withdraw(double Value) {
		this.value -= (Value + 5);
	}
		
	public String toString() {
		return 	"Account "
				+ getAccount()
				+ ", Holder: "
				+ getName()
				+ ", Balance : $"
				+ String.format("%.2f", getValue());
	}
	
}
