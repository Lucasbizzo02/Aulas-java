package exercicio_2;

public class Hobbits_2 {

	public static void main(String[] args) {
		Hobbits[] h = new Hobbits[3];

		int z = 0;

		while (z < 3) {

			h[z] = new Hobbits();
			h[z].nome = "Bilbo";

			if (z == 1) {
				h[z].nome = "Frodo";
			}
			if (z == 2) {
				h[z].nome = "Sam";
			}

			System.out.println(h[z].nome +  " é um ");
			System.out.println("bom nome para um hobbit");
			
			z = z + 1;
		}

	}

}
