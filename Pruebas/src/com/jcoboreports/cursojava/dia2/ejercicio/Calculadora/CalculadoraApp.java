package com.jcoboreports.cursojava.dia2.ejercicio.Calculadora;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalculadoraApp {

	public static void main(String[] args) {		
			solicitarCalculo();		
	}

	private static void solicitarCalculo(){
		try{
			do{
				BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
				Calculadora calc = new Calculadora();
				int result = 0;	
				int[] numeros;
				System.out.println("Introduzca los números a sumar separados por espacios:");
				String entrada = input.readLine();
				
				if(entrada.equalsIgnoreCase("FIN") || entrada.equalsIgnoreCase("EXIT") || entrada.equalsIgnoreCase("END")){
					System.out.println("Hasta la próxima!");
					break;
				}
				numeros = calc.parseaEntrada(entrada);
				result = calc.sumar(numeros);
					
				System.out.println(result);
			}while(true);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
}
