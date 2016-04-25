package ar.edu.untref.aydoo;

import ar.edu.untref.aydoo.exception.AlquilerLibroCuatrimestralException;

public class AlquilerLibroCuatrimestral extends AlquilerLibro {

	final double porcentajeDescuento = 10.0;
	final double cien = 100.0;
	
	private final double precioAlquilerPorCuatrimestre = 800.0;
	private int tiempoEnAlquiler;
	
	public AlquilerLibroCuatrimestral(int tiempoEnAlquiler) {
		this.tiempoEnAlquiler = tiempoEnAlquiler;
	}

	@Override
	public double obtenerPrecioDelProducto() throws AlquilerLibroCuatrimestralException {
		
		double precioAlquiler = 0.0;
		
		if (tiempoEnAlquiler < 0 || tiempoEnAlquiler >  2) {
			throw new AlquilerLibroCuatrimestralException();
		}
		
		precioAlquiler = (precioAlquilerPorCuatrimestre - (precioAlquilerPorCuatrimestre * porcentajeDescuento /cien)) * tiempoEnAlquiler;
		
		return precioAlquiler;

	}
	
}
