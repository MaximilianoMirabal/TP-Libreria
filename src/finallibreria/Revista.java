package finallibreria;

import java.time.LocalDate;

public class Revista extends Item {
	
	private String nombre;
	private String editor;
	
	public Revista() {
		super(1.22, 1.12);
	}

	public Revista(LocalDate fechaPublish, String codigo, Double precioCompra, String nombre, String editor) {
		super(fechaPublish, codigo, precioCompra, 1.22, 1.12);
		this.setNombre(nombre);
		this.setEditor(editor);
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEditor() {
		return this.editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}


	public String mostrarItem() {
		return this.getNombre();		
	}

}