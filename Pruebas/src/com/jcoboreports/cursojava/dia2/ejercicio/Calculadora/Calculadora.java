package com.jcoboreports.cursojava.dia2.ejercicio.Calculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculadora implements interfazCalculadora {
	
	public Calculadora(){
		super();
	}
	
	public int[] parseaEntrada(String entrada){		
		String[] strNumeros = entrada.split("[\\D]");
		int[] numeros = new int[strNumeros.length];
		Pattern p = Pattern.compile("[\\D]");
		Matcher m = p.matcher(entrada);
		int i= 0;
		int lastIndex = 0;
		while(m.find()){
			int index = m.start();
			if(index<0)
			{			
				m.find();
				index = m.start()-1;
				lastIndex = 0;
			}
			else{
				numeros[i]= Integer.parseInt(entrada.substring(lastIndex,index));
				lastIndex= index;
			}
			i++;
		}
		if(entrada.length()>lastIndex){
			numeros[i] = Integer.parseInt(entrada.substring(lastIndex));
		}
		/*
		String[] signos = entrada.split("[\\D]");
		for (int i=0;i<strNumeros.length;i++){
			numeros[i]= Integer.parseInt(strNumeros[i]);			
		}
		*/
		
		
		
		return numeros;
	}
	
	private int[] parseaEntrada(String[] entrada){
		int[] result = new int[entrada.length];
		for (int i=0; i < entrada.length; i++){			
			result[i] = Integer.parseInt(entrada[i]);
		}
		return result;
	}
	
	public int restar(String[] numeros) {
		return (this.restar(this.parseaEntrada(numeros)));
	}
	
	public int sumar(String[] numeros) {
		return (this.sumar(this.parseaEntrada(numeros)));
	}
	
	@Override
	public int sumar(int[] numeros) {
		int result = 0;
		for(int num:numeros){
			result +=num;
		}
		return result;
	}

	@Override
	public int restar(int[] numeros) {
		int result = numeros[0];
		for(int i=1;i<numeros.length;i++){			
			result -=numeros[i];
		}
		return result;
	}

	public long dividir(long dividendo, long divisor) {
		return dividendo / divisor;
		
	}

}
