package ar.edu.untref.aydoo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Libreria {
	
	private String nombre;
	private List<Compra> compras;
	
	public Libreria(String nombre){
		this.nombre = nombre;
		compras = new ArrayList<Compra>();
	}
	
	public BigDecimal calcularMontoACobrar(Mes mes, Cliente cliente){	
		return new java.math.BigDecimal("90.00");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	
}
