
public class Ejercicio1 {

	public static void main(String[] args) {
		int [][] matriz = new int[10][];
		//damos valores a la matriz
		for (int i= 0; i< matriz.length; i++){
			matriz[i] = crearFila(i);
		}
		
		imprimirDiabolo(matriz);
	}

	private static void imprimirDiabolo(int[][]matriz){
		imprimirMedioDiabolo(matriz, true);
		imprimirMedioDiabolo(matriz, false);
	}
	
	private static void imprimirMedioDiabolo(int[][] matriz, boolean esParteSuperior){
		
		for (int i= matriz.length -1; i>=0; i--){
			int indice = i;
			if(!esParteSuperior){
				indice = matriz.length -1 - i;
			}
			System.out.println(imprimeFila(matriz[indice]));
		}	
	}
	private static int[] crearFila(int numFila){		
		int[] result = new int[numFila+1];
		for (int i=0;i< result.length;i++){
			result[i] = numFila;
		}
		return result;
	}
	
	private static String imprimeFila(int[]fila)
	{
		StringBuilder result = new StringBuilder();
		for(int j=0;j<10-fila.length;j++){
			result.append(" ");
		}
		for(int i=0; i < fila.length; i++){			
			result.append(fila[i]);
			if((i<fila.length-1)){
				result.append(" ");
			}
		}
		return result.toString();
	}
}
