package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class operacionesTest {

	@Test
	void testAdd() {
		operaciones calculator = new operaciones();
		int a = 1;
		int b = 5;
		calculator.multiplicar(a, b);
	}

}
