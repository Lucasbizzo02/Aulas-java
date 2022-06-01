package visao;

import java.util.List;
import java.util.Scanner;

import modelo.Cliente;
import util.Util;

public class Tela {
	public Cliente desenharIncluir() {
		Scanner teclado = new Scanner(System.in);
		String nome, telefone;
		int idade;
		Cliente cliente = new Cliente();
		
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
		
		teclado.close();
		
		return cliente;

	}
	public void listarCliente(List<Cliente> banco) {
		for (Cliente c : banco) {
			System.out.println(c);
		}
	}
	
	public void exibirMedia(List<Cliente> banco) {
		Util util = new Util();
		System.out.println("A média das idades é: " + util.calcularMedia(banco));
	}
	
	public void adicionarCliente(List<Cliente> banco) {
		Scanner teclado = new Scanner(System.in);
		String nome, telefone;
		int idade;
		Cliente cliente = new Cliente();
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
	}
	
	public void exluirCliente(List<Cliente> banco) {
		Scanner teclado = new Scanner(System.in);
	
		banco.remove(teclado.nextInt());
	}

}
