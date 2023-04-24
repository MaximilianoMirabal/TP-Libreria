package finallibreria;

import java.time.LocalDate;

public class Libro extends Item {
	
	private String titulo;
	private String autor;
	private String editorial;
	
	public Libro() {
		super(1.18, 1.08);
	}

	public Libro(LocalDate fechaPublish, String codigo, Double precioCompra, String titulo, String autor, String editorial) {
		super(fechaPublish, codigo, precioCompra, 1.18, 1.08);
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;		
	}


	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return this.editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	public String mostrarItem() {
		return this.getTitulo();
	}
}