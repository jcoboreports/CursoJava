package com.jcoboreports.cursojava.ejercicioCartas;

public class Carta {
	Valor valor;
	Palo palo;
	
	public enum Palo {
		OROS,
		COPAS,
		ESPADAS,
		BASTOS
	}
	
	public enum Valor{
		AS(1),
		DOS(2),
		TRES(3),
		CUATRO(4),
		CINCO(5),
		SEIS(6),
		SIETE(7),
		SOTA(10),
		CABALLO(11),
		REY(12);
		
		private int value = 0;
		Valor(int value){
			this.value = value;
		}
	}
	
	public Carta(Palo palo, Valor valor){
		this.valor = valor;
		this.palo = palo;
	}
	
	@Override
	public String toString(){
		String result = "Carta " + valor.toString() + " de " + palo.toString();
		return result;
	}
}
