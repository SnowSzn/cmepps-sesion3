package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {

	private static Cuenta cuenta, cuenta0014_12345, cuenta0014_67890;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuenta = new Cuenta("base", "base", 0);
		cuenta0014_12345 = new Cuenta("12345", "test0014a", 50);
		cuenta0014_67890 = new Cuenta("67890", "test0014b", 0);	
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		assertEquals(-250, cuenta0014_12345.getSaldo());
		assertEquals(-450, cuenta0014_67890.getSaldo());
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresarBase() {
		cuenta.limpiar();
		cuenta.ingresar(500);
		assertEquals(500, cuenta.getSaldo());
	}
	
	@Test
	void testRetirarBase() {
		cuenta.limpiar();
		cuenta.retirar(500);
		assertEquals(-500, cuenta.getSaldo());
	}

	@Test
	void test0014step1() {
		cuenta0014_12345.retirar(200);
		assertEquals(-150, cuenta0014_12345.getSaldo());
	}
	
	@Test
	void test0014step2() {
		cuenta0014_67890.retirar(350);
		assertEquals(-350, cuenta0014_67890.getSaldo());
	}
	
	@Test
	void test0014step3() {
		cuenta0014_12345.ingresar(100);
		assertEquals(-50, cuenta0014_12345.getSaldo());
	}
	
	@Test
	void test0014step4() {
		cuenta0014_67890.retirar(200);
		assertEquals(-350, cuenta0014_67890.getSaldo());
	}
	
	@Test
	void test0014step5() {
		cuenta0014_67890.retirar(150);
		assertEquals(-500, cuenta0014_67890.getSaldo());
	}
	
	@Test
	void test0014step6() {
		cuenta0014_12345.retirar(200);
		assertEquals(-250, cuenta0014_12345.getSaldo());
	}
	
	@Test
	void test0014step7() {
		cuenta0014_67890.ingresar(50);
		assertEquals(-450, cuenta0014_67890.getSaldo());
	}
	
	@Test
	void test0014step8() {
		cuenta0014_67890.retirar(100);
		assertEquals(-450, cuenta0014_67890.getSaldo());		
	}
}
