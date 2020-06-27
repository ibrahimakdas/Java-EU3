package review_sessions.week6;

public class CheckingAccount {
	
	double balance;
	long accountNumber;
	String accountHolder;
	String type = "checking"; //set checking as default value
	
	public void setInfo(double pBalance,long pAccNumber,String pAccHolder) {
		
		System.out.println("Setting accout info...");
		balance = pBalance;
		accountNumber = pAccNumber;
		accountHolder = pAccHolder;
	}
	
	public void getAccountInfo() {
		System.out.println("Checking Account: $" + balance + "," + accountNumber + "," + accountHolder);
	}
	
	public void deposit(double amount) {
		System.out.println("Depositing $ " + amount + " to account number: " + accountNumber);
		balance += amount;
	}
	
	

}
