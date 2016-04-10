package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	private Mes mes;
	private Cliente cliente;
	private List<Producto> productos;
	
	public Compra(Cliente cliente){
		this.setCliente(cliente);
		this.productos = new ArrayList<Producto>();
	}
	
	public void agregarProducto(Producto producto){
		productos.add(producto);
	}

	public Mes getMes() {
		return mes;
	}

	public void setMes(Mes mes) {
		this.mes = mes;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
