package com.jcoboreports.cursojava.dia2.ejercicio.Calculadora.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jcoboreports.cursojava.dia2.ejercicio.Calculadora.Calculadora;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraTest {

	@Test
	public void testSuma() {
		Calculadora calculadora = new Calculadora();
		int[] sumandos = {10,5};
		
		// mock creation
		List<String> mockedList = mock(List.class);

		// using mock object - it does not throw any "unexpected interaction" exception
		mockedList.add("one");
		//mockedList.clear();

		// selective, explicit, highly readable verification
		verify(mockedList).add("one");
		//verify(mockedList).clear();
		
		assertEquals(15, calculadora.sumar(sumandos));
	}

	@Test
	public void testResta(){
		Calculadora calculadora = new Calculadora();
		int[] numerosRestar = {10,5};
		assertEquals(5, calculadora.restar(numerosRestar));
	}
	
	@Test(expected=ArithmeticException.class)
	public void testDivision(){
		Calculadora calculadora = new Calculadora();
		calculadora.dividir(10L,0L);
	}
	
}
