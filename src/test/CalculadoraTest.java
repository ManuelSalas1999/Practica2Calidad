package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Pkg.Calculadora;


class CalculadoraTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
System.out.println("BEFORE ALL");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("after ALL");

	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("BEFORE each");

	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("after each");

	}
	@Test
	void testSuma() {
		
		int valorEsperado=7;
		int valorReal=Calculadora.suma(4, 3);
		
		assertEquals(valorEsperado, valorReal);
	}
	@Test
	void testResta() {
		
		int valorEsperado=1;
		int valorReal=Calculadora.resta(4, 3);
		
		assertEquals(valorEsperado, valorReal);
	}
	@Test
	void testMultiplicacion() {
		
		int valorEsperado=12;
		int valorReal=Calculadora.multiplica(4, 3);
		
		assertEquals(valorEsperado, valorReal);
	}
	@Test
	void testDivision() {
		
		int valorEsperado=2;
		int valorReal=Calculadora.division(4, 2);
		
		assertEquals(valorEsperado, valorReal);
	}
	@Test
	void testDivision0() {
		
		int valorEsperado=-1;
		int valorReal=Calculadora.division(4, 0);
		
		assertEquals(valorEsperado, valorReal);
	}
}
