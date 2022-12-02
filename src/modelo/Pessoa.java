package modelo;

import java.util.ArrayList;

public class Pessoa {

	private String nome;
	private String email;
	private String senha;
	private String dataNasc;
	private String cpf;
	private String cidade;
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
	
	public String getDataNasc() {
		return dataNasc;
	}
	
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
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
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	

	

}
