package ar.edu.untref.aydoo;

public class AlquilerLibroCuatrimestral extends AlquilerLibro {

	final double porcentajeDescuento = 10.0;
	final double cien = 100.0;
	
	private final double precioAlquilerPorCuatrimestre = 800.0;
	private int tiempoEnAlquiler;
	
	public AlquilerLibroCuatrimestral(int tiempoEnAlquiler) {
		this.tiempoEnAlquiler = tiempoEnAlquiler;
	}

	@Override
	public double obtenerPrecioDelProducto (){
		
		double precioAlquiler = 0.0;
		
		if (tiempoEnAlquiler > 0 && tiempoEnAlquiler < 3) {
			precioAlquiler = (precioAlquilerPorCuatrimestre - (precioAlquilerPorCuatrimestre * porcentajeDescuento /cien)) * tiempoEnAlquiler;
		}
		
		return precioAlquiler;

	}
	
}
