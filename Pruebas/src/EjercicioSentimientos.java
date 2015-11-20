import java.util.LinkedHashMap;
import java.util.Map;

public class EjercicioSentimientos {

	public enum DiasSemana {
		LUNES("Pereza"),
		DOMINGO("Por fin");
		
		private final String sentimiento;
		DiasSemana(String sentimiento){
			this.sentimiento = sentimiento;
		}
		public String getSentimiento() {
			return sentimiento;
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Map sentimientos = new LinkedHashMap();
		for(DiasSemana dia: DiasSemana.values()){
			//sentimientos.put(dia, value.getSentimiento());
		}
	}

}
