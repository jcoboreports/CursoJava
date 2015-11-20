import com.jcoboreports.cursojava.ejercicioCartas.Baraja;
import com.jcoboreports.cursojava.ejercicioCartas.Carta;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo!");
		Baraja baraja = new Baraja();
		for (Carta carta:baraja.getCartas()){
			System.out.println(carta);
		}
	}

}
