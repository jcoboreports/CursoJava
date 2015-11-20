import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class EjercicioSentimientos {

	public enum DiasSemana {
		LUNES("Pereza"),
		MARTES("más Pereza"),
		MIERCOLES("ya falta poco pal viernes"),
		JUEVES("ya está aquí el viernes!"),
		VIERNES("al fín es viernes!"),
		SABADO("a descansar"),
		DOMINGO("Por fin domingo!");
		
		private final String sentimiento;
		DiasSemana(String sentimiento){
			this.sentimiento = sentimiento;
		}
		
		public String getSentimiento() {
			return sentimiento;
		}
		
		
	}
	
	public static void main(String[] args) {
		
		//No se pueden crear colecciones de tipos básicos sólo de objectos
		final List<Long> prueba = new ArrayList<>();
		
		final Map<DiasSemana,String> sentimientos = new LinkedHashMap<>();
		
		//Recorro los valores de la enumeración y los voy guardando en un Mapa
		for(DiasSemana dia: DiasSemana.values()){
			sentimientos.put(dia, dia.getSentimiento());
		}
		
		//Recorro el mapa imprimiendo su clave y valor
		for(DiasSemana dia: sentimientos.keySet()){
			System.out.println("El día " + dia + " siento " + sentimientos.get(dia));
		}
	}

}
