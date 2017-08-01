import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
/**
 * JUnit tests for Ex 2.
 * 
 * @author William Downs
 * @version 19/11/15
 */
public class StudentTest {

	private PGStudent james, marion, george;
	private UGStudent zippy, bungle, geoffrey;

	@Before
	public void setUp() {
		james = new PGStudent("James", "23567");
		marion = new PGStudent("Marion", "23657");

		zippy = new UGStudent("Zippy", "23549");
		bungle = new UGStudent("Bungle", "34531");
		geoffrey = new UGStudent("Geoffrey", "554432");
	}

	@Test
	public void test1() {

		boolean expected1 = true;
		boolean result1 = james.passedSWS(52.0, 50.0, 49.0);

		boolean expected2 = false;
		boolean result2 = marion.passedSWS(40, 40, 70);

		boolean expected3 = true;
		boolean result3 = marion.passedSWS(49, 49, 99);

		assertEquals(expected1, result1);
		assertEquals(expected2, result2);
		assertEquals(expected3, result3);

	}

	@Test
	public void test2() {

		boolean expected1 = false;
		boolean result1 = zippy.passedSWS(38, 40.0, 40.0);

		boolean expected2 = true;
		boolean result2 = bungle.passedSWS(40, 40, 79);

		boolean expected3 = true;
		boolean result3 = geoffrey.passedSWS(38, 39, 100);

		assertEquals(expected1, result1);
		assertEquals(expected2, result2);
		assertEquals(expected3, result3);
	}

	@Test
	public void test3() {

		boolean expected1 = true;
		boolean result1 = james.passedSWS(50.0, 50.0, 50.0);

		boolean expected2 = false;
		boolean result2 = marion.passedSWS(40, 40, 70);

		boolean expected3 = false;
		boolean result3 = marion.passedSWS(49, 15, 100);

		assertEquals(expected1, result1);
		assertEquals(expected2, result2);
		assertEquals(expected3, result3);

	}

	@Test
	public void test4() {

		boolean expected1 = false;
		boolean result1 = zippy.passedSWS(39, 40.0, 20.0);

		boolean expected2 = false;
		boolean result2 = bungle.passedSWS(10, 40, 80);

		boolean expected3 = true;
		boolean result3 = geoffrey.passedSWS(39, 38, 100);

		assertEquals(expected1, result1);
		assertEquals(expected2, result2);
		assertEquals(expected3, result3);
	}

	@Test
	public void test5() {

		boolean expected1 = false;
		boolean result1 = james.passedSWS(48.0, 50.0, 48.0);

		boolean expected2 = false;
		boolean result2 = marion.passedSWS(39, 39, 80);

		boolean expected3 = false;
		boolean result3 = marion.passedSWS(49, 49, 49);

		assertEquals(expected1, result1);
		assertEquals(expected2, result2);
		assertEquals(expected3, result3);

	}

}
