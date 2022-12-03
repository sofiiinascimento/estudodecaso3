package controle;

import java.util.ArrayList;

import modelo.Livro;
import modelo.Pessoa;

public class LivroControl {
	
	private static LivroControl instancia;
	
	public static LivroControl getInstancia() {

		if (instancia == null) {
				instancia = new LivroControl();
		}

		return instancia;
	} 
	
	public boolean insert (Pessoa pessoa, Livro l) {
		
		if (l != null) {
			pessoa.getLivrosPessoa().add(l);
			return true;
		}
		
		return false;
	}
	
	public boolean update(Pessoa pessoa, Livro livroAntigo, Livro livroNovo) {
		
		int posicao = pessoa.getLivrosPessoa().indexOf(livroAntigo);
		pessoa.getLivrosPessoa().remove(livroAntigo);
		pessoa.getLivrosPessoa().add(posicao, livroNovo);
		
		return true;
	}
	
	public boolean delete(Pessoa pessoa, Livro l) {
		
		if (l != null) {
			pessoa.getLivrosPessoa().remove(l);
			return true;
		}
		
		return false;
	}
}
