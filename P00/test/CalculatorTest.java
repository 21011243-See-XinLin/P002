import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	int a, b, c;
	Calculator cal;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		cal = new Calculator();
		a = 4321;
		b = 1234;
		c = 0;
	}

	@After
	public void tearDown() throws Exception {
	
	}
	
	@Test
	public void testadd() {
		// Arrange
		int a = 1234;
		int b = 8765;
		Calculator cal = new Calculator();

		// Add
		int actual = cal.add(a, b);

		// Assert
		int expected = 9999;
		assertEquals(actual, expected);
	}

	@Test
	public void testsub() {

		// add
		int actual = cal.sub(a, b);
		// assert
		int expected = 3087;
		assertEquals(expected, actual);
	}

	@Test
	public void testmul() {
		// mul
		int actual = cal.mul(a, b);
		// assert
		int expected = 5332114;
		assertEquals(expected, actual);
	}

	@Test
	public void testdiv() {
		// Arrange
		int a = 1234;
		int b = 8765;
		// add
		int actual = cal.div(a, b);
		// assert
		int expected = 0;
		assertEquals(expected, actual);

	}

	

}