package controle;

import java.util.ArrayList;

import modelo.Livro;

public class LivroControl {
	
	private ArrayList<Livro> tabelaLivros;
	
	public LivroControl() { this.tabelaLivros = new ArrayList<>(); } 
	
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
