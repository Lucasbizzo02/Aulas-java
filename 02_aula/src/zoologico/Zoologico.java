package zoologico;

public class Zoologico {

	public static void main(String[] args) {
		Pelicano p1, p2;
		
		p1 = new Pelicano();
		p2 = new Pelicano();
		
		p1.setCor("branco");
		p2.peso = 80;
		p2.cor = "preta";
		p2.peso = 30;
		
		p1.voar();
		p2.comer();
		p1.definirNome("Arian");
		
		System.out.println("o pelicano p1 é " + p1.cor);
		System.out.println("o pelicano p2 é " + p2.getcor());
		System.out.println("Outra forma de retornar a cor " + p2.retornarCor());
	}

}
