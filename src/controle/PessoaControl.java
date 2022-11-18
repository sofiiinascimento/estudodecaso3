package controle;

import java.util.ArrayList;

import modelo.Pessoa;

public class PessoaControl {

	private static ArrayList<Pessoa> tabelaPessoas;
	private static PessoaControl instancia;

	/**
	 * METODO QUE UTILIZA O PADRAO SINGLETON POSSIBILITANDO QUE SE MANIPULE SEMPRE O
	 * MESMO OBJETO NA MEMORIA RAM E NAO SE PERCA A REFERENCIA DE MEMORIA
	 * 
	 * @return
	 */
	public static PessoaControl getInstancia() {

		if (instancia == null) {
			instancia = new PessoaControl();
		}

		return instancia;
	}

	/**
	 * CONSTRUTOR DA CLASSE
	 */
	private PessoaControl() {
	}

	// INSERT
	public boolean inserir(Pessoa p) {
		if (p != null) {
			tabelaPessoas.add(p);
			return true;
		}
		return false;
	}

	// UPDATE
	public boolean alterar(Pessoa p, String email) {

		for (Pessoa pessoa : tabelaPessoas) {

			if (pessoa.getEmail() == email) {
				pessoa.setNome(p.getNome());
				return true;
			}
		}
		return false;
	}

	// DELETE
	public boolean deletar(Pessoa p, String email) {

		for (Pessoa pessoa : tabelaPessoas) {
			if (pessoa.getEmail() == email) {
				tabelaPessoas.remove(pessoa);
				return true;
			}
		}

		return false;
	}

	// SELECT ALL
	public ArrayList<Pessoa> listaPessoas() {
		return this.tabelaPessoas;
	}

	public Pessoa efetuarLogin(String login, String senha) {

		return null;
	}

}
