package controle;

import java.util.ArrayList;

import modelo.Pessoa;

public class PessoaControl {

	private static ArrayList<Pessoa> tabelaPessoas;
	private static PessoaControl instancia;

	public static PessoaControl getInstancia() {

		if (instancia == null) {
			instancia = new PessoaControl();
			tabelaPessoas = new ArrayList<>();

		}

		return instancia;
	}

	/**
	 * CONSTRUTOR DA CLASSE
	 */
	public PessoaControl() {}

	// INSERT
	public boolean insert(Pessoa p) {
		if (p != null) {
			tabelaPessoas.add(p);
			return true;
		}
		return false;
	}

	// UPDATE
	public boolean update(Pessoa p, String senha) {

		for (Pessoa pessoa : tabelaPessoas) {

			if (pessoa.getEmail() == senha) {
				pessoa.setNome(p.getNome());
				return true;
			}
		}
		return false;
	}

	// DELETE
	public boolean deletar(Pessoa p, String senha) {

		for (Pessoa pessoa : tabelaPessoas) {
			if (pessoa.getEmail() == senha) {
				tabelaPessoas.remove(senha);
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
			for (Pessoa pessoa : tabelaPessoas) {
				if (pessoa.getNome().equals(login) && pessoa.getSenha().equals(senha)) {
					return pessoa;
				}
				
			}
		return null;
	}

}
