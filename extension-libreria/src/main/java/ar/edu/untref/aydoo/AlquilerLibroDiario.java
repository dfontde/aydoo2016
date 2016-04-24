package ar.edu.untref.aydoo;

public class AlquilerLibroDiario extends Producto{

	private final double precioAlquilerPorDia = 10.0;
	private int tiempoEnAlquiler;
	
	public AlquilerLibroDiario(int tiempoEnAlquiler) {
		super(0, false);
		this.tiempoEnAlquiler = tiempoEnAlquiler;
	}

	@Override
	public double obtenerPrecioDelProducto (){
		
		double precioAlquiler = 0.0;
	
		if (tiempoEnAlquiler > 2 && tiempoEnAlquiler < 26) {
			precioAlquiler = tiempoEnAlquiler * precioAlquilerPorDia ;	
		}
	
		return precioAlquiler;

	}
	
}
