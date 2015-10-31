import java.util.Arrays;

public class Ejemplo5_Arrays {

	public static void main(String[] args) {
		int [] enteros = {0,1,2,3,4,5};
		for(int i=0; i< enteros.length; i++){
			System.out.println("Valor "+i+"="+enteros[i]);
		}
		System.out.println(Arrays.toString(enteros));
	}

}
