package bank;

public class BankAccount {

	private String accountNumber;
	private String type;
	private double balance;

	public BankAccount(String accountNumber, String type, double balance) {
		this.accountNumber = accountNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}
}
