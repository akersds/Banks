package bank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;


public class BankAccountTest {

	@Test
	public void shouldInstantiateBankAccountWithAccountNumberTypeBalance() {
		BankAccount underTest = new BankAccount("946d31", "Savings", 100.00);

		assertNotNull(underTest);
	}

	@Test
	public void shouldReturnAccountNumber1() {
		BankAccount underTest = new BankAccount("946d31", "Savings", 100.00);
		String check = underTest.getAccountNumber();
		assertEquals("946d31", check);
	}
	
	@Test
	public void shouldReturnAccountNumber2(){
		BankAccount underTest = new BankAccount("0002", "Savings", 100.00);
		String check = underTest.getAccountNumber();
		assertEquals("0002", check);
		
		
	}
}

// create the following methods: create appropriate methods needed for bank
// transactions