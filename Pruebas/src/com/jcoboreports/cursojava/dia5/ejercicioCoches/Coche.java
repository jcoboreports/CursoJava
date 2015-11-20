package com.jcoboreports.cursojava.dia5.ejercicioCoches;

public class Coche {
	
	private final String marca;
	private final String modelo;
	private final Motor motor;
	private final Piloto piloto;
	
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public Motor getMotor() {
		return motor;
	}
	public Piloto getPiloto() {
		return piloto;
	}
	
	public Coche(String marca, String modelo, Motor motor, Piloto piloto) {
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
		this.piloto = piloto;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + ((motor == null) ? 0 : motor.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (motor == null) {
			if (other.motor != null)
				return false;
		} else if (!motor.equals(other.motor))
			return false;
		return true;
	}
	/*
	@Override
	public boolean equals(Object obj) {
		boolean result = false; 
		if(Coche.class == obj.getClass()){
			Coche cocheB = (Coche)obj;
			if (this.getMarca().equals(cocheB.getMarca()) &&
					this.getModelo().equals(cocheB.getModelo()) &&
					this.getMotor().equals(cocheB.getMotor())){
				result = true;
			}
		}
		return result;
	}
	*/
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + ", piloto=" + piloto + "]\n";
	}
	
	
}
