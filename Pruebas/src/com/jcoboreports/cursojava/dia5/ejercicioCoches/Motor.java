package com.jcoboreports.cursojava.dia5.ejercicioCoches;

public class Motor {

	private final int cilindrada;
	private final int potencia;
	
	public Motor(int cilindrada, int potencia) {
		this.cilindrada = cilindrada;
		this.potencia = potencia;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public int getPotencia() {
		return potencia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cilindrada;
		result = prime * result + potencia;
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
		Motor other = (Motor) obj;
		if (cilindrada != other.cilindrada)
			return false;
		if (potencia != other.potencia)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Motor [cilindrada=" + cilindrada + ", potencia=" + potencia + "]";
	}

	
}
