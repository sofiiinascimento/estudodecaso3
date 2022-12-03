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
	
	public boolean update(Pessoa pessoa, Livro l) {
		return false;
	}
	
	public boolean delete(Pessoa pessoa, Livro l) {
		
		if (l != null) {
			pessoa.getLivrosPessoa().remove(l);
			return true;
		}
		
		return false;
	}
}
