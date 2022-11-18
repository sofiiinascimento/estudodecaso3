package modelo;

import java.util.ArrayList;

public class Pessoa {

	private String nome;
	private String email;
	private String senha;
	private ArrayList<Livro> livrosPessoa;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Livro> getLivrosPessoa() {
		return livrosPessoa;
	}

	public void setLivrosPessoa(ArrayList<Livro> livrosPessoa) {
		this.livrosPessoa = livrosPessoa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
