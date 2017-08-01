import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * JUnit tests for WS4 Ex4.
 *
 * @author William Downs
 * @version 20/11/15
 */

public class BankAccountWithOverdraftTest {

	private Customer c1, c2;
	private BankAccount bAc1;
	private BankAccountWithOverdraft bAc2;

	@Before
	public void setUp() {

		
		c1 = new Customer("Will", "16 St. John's Road", "543210");
		c2 = new Customer("Claire", "1 Highland View", "64141");
		bAc1 = new BankAccount(c1, "123456788", "new gold dream");
		bAc2 = new BankAccountWithOverdraft(c2, "123456789", "new gold dream", 500);
	}

	@Test
	public void test1() {

		bAc1.deposit(500);
		bAc1.withdraw(501, "new gold dream");

		long expected = 500;
		long result = bAc1.getBalance();
		assertEquals(expected, result);

	}

	@Test
	public void test2() {

		bAc1.deposit(500);
		bAc1.withdraw(500, "newgold dream");

		long expected = 500;
		long result = bAc1.getBalance();
		assertEquals(expected, result);

	}

	@Test
	public void test3() {

		bAc2.deposit(500);
		bAc2.withdraw(501, "new gold dream");

		long expected = -1;
		long result = bAc2.getBalance();
		assertEquals(expected, result);

	}

	@Test
	public void test4() {

		bAc2.deposit(500);
		bAc2.withdraw(501, "new golddream");

		long expected = 500;
		long result = bAc2.getBalance();
		assertEquals(expected, result);

	}
	@Test
	public void test5() {

		bAc1.deposit(500);
		bAc1.withdraw(502, "new gold dream");

		long expected = 500;
		long result = bAc1.getBalance();
		assertEquals(expected, result);

	}
}
