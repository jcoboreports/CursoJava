package com.jcoboreports.cursojava.dia5.ejercicioCoches;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

public class Main {

	public static void main(String[] args) {
		
		//Crear 2 coches iguales pero con diferente Piloto
		Coche coche1 = new Coche("Seat","Leon",new Motor(2000,150), new Piloto("Antonio Rass",17));
		Coche coche2 = new Coche("Seat","Leon",new Motor(2000,150), new Piloto("Fernando Espero",32));
		
		System.out.println("Inicio el ejercicio");
		
		List<Coche> coches = new ArrayList<>();
//		Set<Coche> coches = new LinkedHashSet<>();
		
		//comprobar que el coche2 está ya en la lista pq es igual que el 1
		coches.add(coche1);
		if (coches.contains(coche2)){
			System.out.println("Ya tengo un coche Marca "+ coche2.getMarca() + " y modelo " + coche2.getModelo() + " igual en la lista!");
		}
		else
		{
			System.out.println("No tengo ese coche en la lista");
		}
		
		//Añadir un tercer coche diferente
		Coche coche3 = new Coche("BMW","320",new Motor(2200,190), new Piloto("Fitipaldi",62));
		
		coches.add(coche3);
		//Coche2 no es añadido a lista pq ya existe el 1 q es igual!
		coches.add(coche2);
		coches.remove(coches.lastIndexOf(coche2));
		System.out.println(coches.toString());
		
	}

}
