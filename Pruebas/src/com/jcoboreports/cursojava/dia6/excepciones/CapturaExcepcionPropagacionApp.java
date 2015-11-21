package com.jcoboreports.cursojava.dia6.excepciones;

public class CapturaExcepcionPropagacionApp {

	public static void metodo1() throws PropagacionExcepcion{
		metodo2();
	}
	
	public static void metodo2() throws PropagacionExcepcion{
		metodo3();
	}
	
	public static void metodo3() throws PropagacionExcepcion{
		metodo4();
	}
	
	public static void metodo4() throws PropagacionExcepcion{
		//throw new PropagacionExcepcion();
	}
	
	public static void main(String[] args){
		try{
			metodo1();
			System.out.println("Paso por aquí");
		}catch(PropagacionExcepcion ex){
			System.err.println("Obtiene la excepción en el método 1: "+ ex.getMessage());
			ex.printStackTrace();
		}
	}
}
