package bank;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;



public class BankAccountTest {

	@Test
	public void shouldInstantiateBankAccountWithAccountNumberTypeBalance() {
	BankAccount underTest = new BankAccount("946d31","Savings",100.00);
	
	assertNotNull(underTest);
}
}



//create the following methods: create appropriate methods needed for bank transactions