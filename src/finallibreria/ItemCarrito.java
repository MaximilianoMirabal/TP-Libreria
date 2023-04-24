package finallibreria;


public class ItemCarrito {
	Item item;
	int cantidad;
	TipoDeCopia tipo;
	
	public ItemCarrito(Item item, int cantidad, TipoDeCopia tipo) {
		this.item = item;
		this.cantidad = cantidad;
		this.tipo = tipo;
	}	
	
	public Double precio() {
		return Math.round(item.precioVenta(tipo) * cantidad * 100.0) / 100.0;
	}

	
	public void mostrarItem() {
		
		System.out.println("Producto: " + this.item.mostrarItem() + " - cantidad: " + this.cantidad);
		
		
		System.out.println("-----------------------------------------------------------------");
	}

}
