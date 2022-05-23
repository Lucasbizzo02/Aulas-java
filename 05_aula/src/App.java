import java.util.ArrayList;
import java.util.List;

/*
 * Demonstração do app uso de ArrayList
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
		System.out.println("O valor está no índice " + lista.indexOf("Beatriz"));
		System.out.println("O conteúdo do índice 3 é " + lista.get(2));
	}

}
