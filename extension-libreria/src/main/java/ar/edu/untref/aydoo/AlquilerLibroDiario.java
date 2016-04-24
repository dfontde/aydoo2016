package ar.edu.untref.aydoo;

import ar.edu.untref.aydoo.alquilerLibro.AlquilerLibroDiarioException;

public class AlquilerLibroDiario extends AlquilerLibro {

	private final double precioAlquilerPorDia = 10.0;
	private int tiempoEnAlquiler;
	
	public AlquilerLibroDiario(int tiempoEnAlquiler) {
		this.tiempoEnAlquiler = tiempoEnAlquiler;
	}

	@Override
	public double obtenerPrecioDelProducto() throws AlquilerLibroDiarioException{
		
		double precioAlquiler = 0.0;
		
		if (tiempoEnAlquiler < 3 || tiempoEnAlquiler > 25) {
			throw new AlquilerLibroDiarioException();
		}
		
		precioAlquiler = tiempoEnAlquiler * precioAlquilerPorDia ;	

		return precioAlquiler;

	}
	
}
 