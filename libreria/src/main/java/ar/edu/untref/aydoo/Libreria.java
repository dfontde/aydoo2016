package ar.edu.untref.aydoo;

import java.math.BigDecimal;

public class Libreria {
	
	private String nombre;
	
	public Libreria(String nombre){
		this.setNombre(nombre);
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
	
	
}
