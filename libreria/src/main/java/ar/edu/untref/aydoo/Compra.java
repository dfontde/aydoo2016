package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	private Cliente cliente;
	List<Producto> productos;
	Mes mes;
	
	public Compra(Cliente cliente){
		this.cliente = cliente;
		productos = new ArrayList<Producto>();
	}
	
	public void agregarProducto(Producto producto){
		productos.add(producto);
	}
	
}
