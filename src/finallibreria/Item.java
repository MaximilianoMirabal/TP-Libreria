package finallibreria;

import java.time.LocalDate;

public abstract class Item {
	private LocalDate fechaPublish;
	private String codigo;
	private Double precioCompra;
	private Double multFisico;
	private Double multDigital;
	
	public Item(Double multFisico, Double multDigital) {		
		this.multFisico = multFisico;
		this.multDigital = multDigital;
	}

	public Item(LocalDate fechaPublish, String codigo, Double precioCompra, Double multFisico, Double multDigital) {
		this.fechaPublish = fechaPublish;
		this.codigo = codigo;
		this.precioCompra = precioCompra;
		this.multFisico = multFisico;
		this.multDigital = multDigital;
	}

	public LocalDate getFechaPublish() {
		return this.fechaPublish;
	}

	public void setFechaPublish(LocalDate fechaPublish) {
		this.fechaPublish = fechaPublish;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Double getPrecioCompra() {
		return this.precioCompra;
	}

	public void setPrecioCompra(Double precioCompra) {
		this.precioCompra = precioCompra;
	}
	
	public Double multiplier(TipoDeCopia tipo) {
		if (tipo == TipoDeCopia.FISICA) {
			return this.multFisico;
		} else {
			return this.multDigital;
		}
		
	}
	
	public abstract String mostrarItem();
	
	public Double precioVenta(TipoDeCopia tipo) {
		return getPrecioCompra() * multiplier(tipo);
	}

}
