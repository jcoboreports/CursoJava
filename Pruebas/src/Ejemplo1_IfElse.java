import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ejemplo1_IfElse {

	public static void main(String[] args) {
		
		int a = 1;
		
		int b = 3;
		
		//Siempre que trabajemos con unidades monetarias usar BigDecimal, para no tener problemas con los redondeos.
		BigDecimal bigNumber = new BigDecimal(0.10);
		
		int bitmask = 0x000F;
        int val = 0x2222;
        
		if(a<b){
			System.out.println("A es menor q B");
		} else {
			System.out.println("A es mayor o igual q B");
		}
		bigNumber = bigNumber.divide(BigDecimal.valueOf(3),2,RoundingMode.HALF_UP);
		System.out.println(bitmask | val);
		System.out.println(bigNumber);
	}

}
