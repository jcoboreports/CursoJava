package com.jcoboreports.cursojava.dia6.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LecturadeFicherosApp {

	public static void main(String[] args) {
		//Lista todos los ficheros de un directorio
		File directorio = new File("/home/autentia/Descargas/");
		if(directorio.isDirectory()){
			int i = 0;
			for(File file:directorio.listFiles()){
				i++;
				System.out.println("Fichero "+i+"/"+directorio.listFiles().length+" : "+ file.getName());
				if(file.getName().toLowerCase().endsWith("txt")){
					imprimirTXT(file);
				}
			}
		}else{
			System.err.println("Debe seleccionar un directorio");
		}
	}

	//Usando InputStreamReader
//	private static void imprimirTXT(File file) {
//		InputStreamReader inputStreamReader = null;
//		try {
//			inputStreamReader = new InputStreamReader(new FileInputStream(file));
//			char[] charactersBuffer = new char[1024];
//			System.out.println("--------------------------------------------------------------------------------------");			
//			System.out.println("Contenido del fichero "+file.getName()+":");
//			System.out.println("----------------------------------INICIO CONTENIDO------------------------------------");
//			while(inputStreamReader.read(charactersBuffer)!=-1){
//				System.out.print(charactersBuffer);				
//			}
//			System.out.println();
//			System.out.print("----------------------------------FIN CONTENIDO------------------------------------");
//		} catch (IOException e) {			
//			e.printStackTrace();
//		} finally{
//			System.out.flush();
//			if (inputStreamReader != null){
//				try {
//					inputStreamReader.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		}		
//	}
	
	//Usando FileReader
	private static void imprimirTXT(File file) {
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
			char[] charactersBuffer = new char[1024];
			System.out.println("--------------------------------------------------------------------------------------");			
			System.out.println("Contenido del fichero "+file.getName()+":");
			System.out.println("----------------------------------INICIO CONTENIDO------------------------------------");
			while(fileReader.read(charactersBuffer)!=-1){
				System.out.print(charactersBuffer);				
			}
			System.out.println();
			System.out.print("----------------------------------FIN CONTENIDO------------------------------------");
		} catch (IOException e) {			
			e.printStackTrace();
		} finally{
			System.out.flush();
			if (fileReader != null){
				try {
					fileReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}		
	}
}
