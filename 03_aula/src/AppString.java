
public class AppString {

	public static void main(String[] args) {
		Pelicano[] filhote = new Pelicano[3];
		
		Pelicano p1 = new Pelicano();
		Pelicano p2 = new Pelicano();
		
		p1.setCor("branco");
		p1.setPeso(10);
		p2.setCor("marron");
		
		filhote[0] = p1;
		filhote[1] = p2;
		filhote[2] = new Pelicano();
		
		filhote[2].setCor("preto");
		filhote[2].setPeso(90);
		
		System.out.println(filhote[0].getcor());
		System.out.println(filhote[0].getPeso());
		
		filhote[2].voar();
		
		for(Pelicano exemplo: filhote) {
			System.out.println("O pelicano tem a cor : " + exemplo.getcor()); 
		}
	}
}
