package ar.edu.untref.aydoo;

import java.math.BigDecimal;

public class DiarioYRevista extends Producto{
	
	private Periodicidad periodicidad;
	
	public DiarioYRevista(String descripcion, BigDecimal precio) {
		super(descripcion, precio);
	}

	public Periodicidad getPeriodicidad() {
		return periodicidad;
	}

	public void setPeriodicidad(Periodicidad periodicidad) {
		this.periodicidad = periodicidad;
	}
	
	

}
