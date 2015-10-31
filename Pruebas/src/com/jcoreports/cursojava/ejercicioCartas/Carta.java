package com.jcoreports.cursojava.ejercicioCartas;

public class Carta {
	String valor;
	String palo;
	
	public Carta(String valor, String palo){
		this.valor = valor;
		this.palo = palo;
	}
	
	public Carta(String palo){
		this("Prueba",palo);
	}
	
	@Override
	public String toString(){
		String result = "Carta " + palo +" " + valor;
		return result;
	}
}
