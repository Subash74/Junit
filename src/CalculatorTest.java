import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Calculator mycalc = new Calculator(3,3);
		mycalc.allocatememory();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Calculator mycalc = new Calculator(3,3);
		mycalc.releasememory();
	}
	

	@Before
	public void setUp() throws Exception {
		Calculator mycalc = new Calculator(3,3);
		mycalc.clearMemory();
	}

	@After
	public void tearDown() throws Exception {
		Calculator mycalc = new Calculator(3,3);
		mycalc.reset();
	}

	@Test
	public void testAdd() {
		Calculator mycalc = new Calculator(3,3);
		
		int result = mycalc.Add();
		
		int expected = 6;
		
		assertEquals (result, expected);
	}

	@Test
	public void testSub() {
Calculator mycalc = new Calculator(6,3);
		
		int result = mycalc.Sub();
		
		int expected = 3;
		
		assertEquals (result, expected);
		
	}

	@Test
	public void testDiv() {
Calculator mycalc = new Calculator(6,3);
		
		int result = mycalc.Div();
		
		int expected = 2;
		
		assertEquals (result, expected);
	}
		
	@Test 
	public void testboolean() {
	Calculator mycalc = new Calculator (3,3);
	
	boolean result = mycalc.validate();
	
//	 boolean expected = true;
	
	assertTrue (result);
	
		
	

	}
}
