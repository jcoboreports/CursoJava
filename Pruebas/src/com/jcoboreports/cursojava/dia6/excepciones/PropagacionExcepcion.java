package com.jcoboreports.cursojava.dia6.excepciones;

public class PropagacionExcepcion extends Exception {

	public PropagacionExcepcion(){
		super("Excepción que se propaga");
	}
	
	public PropagacionExcepcion(String mensaje, Exception raiz){
		super(mensaje, raiz);
	}
}
