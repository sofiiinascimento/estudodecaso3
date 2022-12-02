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
	
	public boolean inserir(Livro l) {
		
		return false;
	}
	
	public boolean alterar(Livro l) {
		return false;
	}
	
	public boolean deletar (Livro l, int idLivro) {
		return false;
	}
	
	public ArrayList<Livro> listaLivro(){
		
		return null;
	}
	
}
