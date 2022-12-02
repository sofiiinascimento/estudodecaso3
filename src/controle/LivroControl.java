package controle;

import java.util.ArrayList;

import modelo.Livro;

public class LivroControl {
	
	public static ArrayList<Livro> tabelaLivros;
	private static LivroControl instancia;
	
	public static LivroControl getInstancia() {

		if (instancia == null) {
				instancia = new LivroControl();
				tabelaLivros = new ArrayList<>();
		}

		return instancia;
	} 
	
	public boolean insert (Livro l) {
		
		if (l != null) {
			this.tabelaLivros.add(l);
			
			return true;
		}
		
		return false;
	}
	
	public boolean update(Livro l) {
		return false;
	}
	
	public boolean delete(Livro l, int idLivro) {
		return false;
	}
	
	public ArrayList<Livro> listaLivro(){
		
		return null;
	}
	
}
