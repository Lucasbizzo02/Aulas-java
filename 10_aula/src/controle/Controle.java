package controle;

import java.util.ArrayList;
import java.util.List;

import modelo.Cliente;
import visao.Tela;

public class Controle {
	List<Cliente> banco = new ArrayList<Cliente>();

	public void avaliarOpcao(int opcao) {
		Tela tela = new Tela();

		if (opcao == 1) {
			// Inclusão do cliente

			banco.add(tela.desenharIncluir());
		} else if (opcao == 2) {
			// Listar cliente

			tela.listarCliente(banco);

		} else if (opcao == 3) {
			// Calcula a média das idades

			tela.exibirMedia(banco);
		} else if (opcao == 4) {
			//Adicionar e alterar
			tela.adicionarCliente(banco);

		} else if (opcao == 5) {
			//Excluir cliente
			tela.exluirCliente(banco);
		}

	}
}
