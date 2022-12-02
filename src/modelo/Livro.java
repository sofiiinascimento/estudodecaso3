package modelo;

public class Livro {
	
	private String tituloLivro;
	public String getTituloLivro() {
		return tituloLivro;
	}
	public void setTituloLivro(String tituloLivro) {
		this.tituloLivro = tituloLivro;
	}

	private String autor;
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}

	private String genero;
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	private String quantPag;
	public String getQuantPag() {
			return quantPag;
	}
	public void setQuantPag(String quantPag) {
		this.quantPag = quantPag;
	}
}
