package com.jcoboreports.cursojava.dia6.excepciones;

public class MiPruebaExcepcionesApp {

	public static void main(String[] args) {

		long numero1 = 1222112L;
		long numero2 = 0L;
		//Ejemplo de ArithmeticException
		try{
			long resultado = numero1 / numero2;
		}
		catch (ArithmeticException ae){
			System.err.println("No se puede dividir por " + numero2);
			//ae.printStackTrace();
		}
		
		//Ejemplo de ArrayIndexOutOfBoundsException
		int[] arrayNumeros = {10,20};
		try{
			for(int i=0; i<=arrayNumeros.length;i++){
				System.out.println("Numero ["+i+"]: " + arrayNumeros[i]);
			}
		}catch(ArrayIndexOutOfBoundsException ex){
			System.err.println("Nos hemos pasado el array sólo tiene "+ arrayNumeros.length + " elementos y estamos intentando acceder al índice " + ex.getMessage());
		}
	}

}
