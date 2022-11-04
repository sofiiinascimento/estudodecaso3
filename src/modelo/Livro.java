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

private Integer quantPag;
public Integer getQuantPag() {
	return quantPag;
}
public void setQuantPag(Integer quantPag) {
	this.quantPag = quantPag;
}

}
