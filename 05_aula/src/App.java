import java.util.ArrayList;
import java.util.List;

/*
 * Demonstra��o do app uso de ArrayList
 */

public class App {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		
		lista.add("Lucas");
		lista.add("Anna Julia");
		lista.add("Beatriz");
		
		for(String temp: lista) {
			System.out.println(temp);
		}
		
		// Procurando a Beatriz
		System.out.println("O array tem " + lista.size() + "elementos. ");
		
		System.out.println(lista.contains("Beatriz"));
		System.out.println("O valor est� no �ndice " + lista.indexOf("Beatriz"));
		System.out.println("O conte�do do �ndice 3 � " + lista.get(2));
	}

}
