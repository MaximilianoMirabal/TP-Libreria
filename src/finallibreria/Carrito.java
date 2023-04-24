package finallibreria;

import java.util.ArrayList;


public class Carrito {
	private ArrayList<ItemCarrito>items;

	public Carrito() {
		this.items = new ArrayList<ItemCarrito>();
	}

	public void agregarItem(ItemCarrito ic) {
		this.items.add(ic);
	}

	public void quitarItem(ItemCarrito ic) {
		this.items.remove(ic);
	}

	
	public void mostrarCarrito() {
		if(items.isEmpty())
			System.out.println("No hay productos en el carrito");
		else {
			for(ItemCarrito i: items) {
				i.mostrarItem();
			}
		}
	}

	private Double total() {
		Double total = 0.0;

		for (ItemCarrito item : items) {
			total += item.precio();
		}

		return Math.round(total * 100.0) / 100.0;
	}

	public void totalAbonar(){
		System.out.println("El total a abonar es: " + total());
	}

}