package atividade;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ler {

	public static void main(String[] args) {
		int numeroClientes;
		Scanner teclado = new Scanner(System.in);
		String caixa, nome, telefone, idade;
		Cliente cliente;
		
		System.out.println("1 - Ler Cliente");
		System.out.println("2 - Lista Clientes");
		System.out.println("3 - Fim");
		caixa = teclado.next();
		
		if (caixa.equals("1")) {
			
		}
		for (int i = 0; i < numeroClientes; i++) {
			cliente = new Cliente();

			System.out.println("Digite o nome do cliente" + (i + 1));
			nome = teclado.next();

			System.out.println("Digite o telefone");
			telefone = teclado.next();
			
			System.out.println("Digite a data de aniversario");
			idade = teclado.next();

			cliente.setNome(nome);
			cliente.setTelefone(telefone);
			cliente.setIdade(idade);
			
		}

	}

}
