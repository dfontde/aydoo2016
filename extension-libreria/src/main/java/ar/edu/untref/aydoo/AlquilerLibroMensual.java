package ar.edu.untref.aydoo;

import ar.edu.untref.aydoo.alquilerLibro.AlquilerLibroMensualException;

public class AlquilerLibroMensual extends AlquilerLibro {

	private final double precioAlquilerPorMes = 200.0;
	private int tiempoEnAlquiler;
	
	public AlquilerLibroMensual(int tiempoEnAlquiler) {
		this.tiempoEnAlquiler = tiempoEnAlquiler;
	}

	@Override
	public double obtenerPrecioDelProducto () throws AlquilerLibroMensualException{
		
		double precioAlquiler = 0.0;
	
		if (tiempoEnAlquiler < 1 || tiempoEnAlquiler > 3) {
			throw new AlquilerLibroMensualException();
		}		
		
		precioAlquiler = tiempoEnAlquiler * precioAlquilerPorMes;	
		
		return precioAlquiler;

	}

}
