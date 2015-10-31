
public class Ejemplo2_Switch {

	public static void main(String[] args) {
		
		String key = "2";
		String valor = "";
		
		switch (key) {
		case "1":
			valor+= "1";			
		case "2":
			valor+= "2";			
		default:
			valor += "Defecto";			
		}
		
		System.out.println(valor);
	}

}
