package finallibreria;

import java.time.LocalDate;

public class Principal {
    public static void main( String[] args )
    {   
        Libro libro1 = new Libro();
		libro1.setAutor("Kenzaburo Oe");
		libro1.setTitulo("El Grito Silencioso");
		libro1.setEditorial("Anagrama");
		libro1.setCodigo("L001");
		libro1.setFechaPublish(LocalDate.of(1990, 2, 23));
		libro1.setPrecioCompra(700.);

        Libro libro2 = new Libro(
			LocalDate.of(1993, 3, 11),
			"L002",
			699.99,
			"El Mito De Sisifo",
			"Albert Camus",
			"Octaedro"
		);

		Revista revista1 = new Revista(
			LocalDate.of(2023, 3, 5), 
			"R001", 
			435.50, 
			"Caras", 
			"Perfil"
		);

		Revista revista2 = new Revista(
			LocalDate.of(2023, 2, 15), 
			"R002", 
			599.99, 
			"Gente", 
			"Atlantida"
		);
		
		Carrito c = new Carrito();

		ItemCarrito ic1 = new ItemCarrito(libro1, 6, TipoDeCopia.DIGITAL);		
		ItemCarrito ic2 = new ItemCarrito(libro2, 3, TipoDeCopia.FISICA);
		
		ItemCarrito ic3 = new ItemCarrito(revista1, 1, TipoDeCopia.DIGITAL);
		ItemCarrito ic4 = new ItemCarrito(revista2, 2, TipoDeCopia.FISICA);
		
		c.agregarItem(ic1);
		c.agregarItem(ic2);
		c.agregarItem(ic3);
		c.agregarItem(ic4);

		c.mostrarCarrito();

		c.totalAbonar();

		c.quitarItem(ic3);
		
		c.mostrarCarrito();

		c.totalAbonar();
    }
}
