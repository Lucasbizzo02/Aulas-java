package exercicio;

public class Calculdora {

	public static void main(String[] args) {
		Calculo calculo = new Calculo();

		System.out.println("Multiplicar " + calculo.multiplicar(55, 7));
		System.out.println("Soma " + calculo.somar(4, 6));

		if (calculo.dividir(6, 0) == 0) {
			System.out.println("N�o � permitido usar 0 na divis�o!");
		} else {
			System.out.println("Dividir " + calculo);
		}
	}
}
