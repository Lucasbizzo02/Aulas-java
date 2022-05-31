package atividade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int opcao;
		int idade;
		int estrela;
		String nome, telefone;
		
		Cliente cliente;
		App app = new App();

		List<Cliente> banco = new ArrayList<Cliente>();
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("----MENU----");
			System.out.println("1 - Ler Cliente");
			System.out.println("2 - Lista Clientes");
			System.out.println("3 - Média de idade");
			System.out.println("4 - Alterar cliente");
			System.out.println("5 - Excluir cliente");
			System.out.println("6 - Classificar cliente");
			System.out.println("7 - Fim");
			System.out.println("------------------");
			System.out.println("Digite uma opeção:");

			opcao = teclado.nextInt();

			if (opcao == 1) {
				// Inclusão do cliente
				cliente = new Cliente();

				System.out.println("--------------------------");
				System.out.println("Informe o nome do cliente: ");
				nome = teclado.next();
				cliente.setNome(nome);

				System.out.println("Informe o telefone: ");
				telefone = teclado.next();
				cliente.setTelefone(telefone);

				System.out.println("Qual a idade do cliente?");
				idade = teclado.nextInt();
				cliente.setIdade(idade);
				
				System.out.println("Avalie o cliente: ");
				estrela = teclado.nextInt();
				cliente.setEstrela(estrela);

				banco.add(cliente);
			} else if (opcao == 2) {
				for (Cliente c : banco) {
					System.out.println(c);	
				} 
			}else if (opcao == 3) {
				 System.out.println("A média das idades é: " + app.calcularMedia(banco));
			} else if (opcao == 4) {
				Cliente dados = banco.get(0);
				
				System.out.println("Informe o nome do cliente: ");
				nome = teclado.next();
				dados.setNome(nome);
				
				System.out.println("Informe o telefone: ");
				telefone = teclado.next();
				dados.setTelefone(telefone);
				
				System.out.println("Qual a idade do cliente?");
				idade = teclado.nextInt();
				dados.setIdade(idade);

			} else if (opcao == 5) {
				banco.remove(teclado.nextInt());
			} else if (opcao == 6) {
				
			}

		} while (opcao < 7);

		teclado.close();
	}

	public double calcularMedia(List<Cliente> lista) {
		int somaIdade = 0; 
		
		for (Cliente c: lista) {
			somaIdade += somaIdade + c.getIdade();
		}
		
		return (somaIdade / lista.size());
	}
}
