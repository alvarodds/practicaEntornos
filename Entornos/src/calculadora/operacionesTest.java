package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class operacionesTest {

	@Test
	void testAdd() {
		operaciones calculator = new operaciones();
		int a = 1;
		int b = 5;
		int actual = calculator.multiplicar(a, b);
		
		int expected = 5;
		
		assertEquals(expected,actual);
	}

}
