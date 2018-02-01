package bank;

public class Bank {

	private String accountNumber;
	private String type;
	private double balance;

	public Bank(String accountNumber, String type, double balance) {
		this.accountNumber = accountNumber;
		this.type = type;
		this.balance = balance;

	}
}

public String getName()
{
	return name;
}

public double getPrice()
{
	return price;
}

public double getQuantity()
{
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

@Override
public String toString()
{
	return "Item: " + name + " Price: " + price + " Quantity: " + quantity;
}


}
}
