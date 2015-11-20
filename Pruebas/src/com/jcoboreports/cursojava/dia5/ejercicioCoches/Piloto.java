package com.jcoboreports.cursojava.dia5.ejercicioCoches;

public class Piloto {
	private final String nombre;
	private final int edad;

	public Piloto(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "Piloto [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
}
