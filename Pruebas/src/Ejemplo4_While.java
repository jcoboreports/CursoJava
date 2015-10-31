
public class Ejemplo4_While {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b= 5;
		while(a<b){			
			a++;
			System.out.println("Numero: " + a);
		}
		a = 0;
		do{
			a++;
			System.out.println("Numero: " + a);
		}while(a<b);
	}
}
