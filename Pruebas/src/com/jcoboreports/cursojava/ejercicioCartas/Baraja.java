package com.jcoboreports.cursojava.ejercicioCartas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import com.jcoboreports.cursojava.ejercicioCartas.Carta;
import com.jcoboreports.cursojava.ejercicioCartas.Carta;

public class Baraja {
	private List<Carta> cartas;

	public List<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(List<Carta> cartas) {
		this.cartas = cartas;
	}
	
	public Baraja(){
		this.cartas = new ArrayList<>();
		for (Carta.Palo palo:Carta.Palo.values()){
			for(Carta.Valor valor:Carta.Valor.values()){
				Carta carta = new Carta(palo, valor);
				this.cartas.add(carta);
			}
		}
	}
}
