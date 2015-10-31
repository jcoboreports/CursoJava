package com.jcoreports.cursojava.dia2.ejercicio.Calculadora;

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
				System.out.println("Introduzca los números a sumar separados por espacios:");
				String entrada = input.readLine();
				calc.parseaEntrada(entrada);
				
				if(entrada.equalsIgnoreCase("FIN")){
					break;
				}
				if(entrada.contains("+")){
					result = calc.sumar(entrada.split("\\+"));	
				}else if(entrada.contains("-")){
					result = calc.restar(entrada.split("-"));		
				}
				else if(entrada.contains(" "))
				{
					result = calc.sumar(entrada.split(" "));				
				}			
				System.out.println(result);
			}while(true);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
}
