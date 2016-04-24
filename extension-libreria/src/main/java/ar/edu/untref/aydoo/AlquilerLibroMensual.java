package ar.edu.untref.aydoo;

public class AlquilerLibroMensual extends Producto{

	private final double precioAlquilerPorMes = 200.0;
	private int tiempoEnAlquiler;
	
	public AlquilerLibroMensual(int tiempoEnAlquiler) {
		super(0, false);
		this.tiempoEnAlquiler = tiempoEnAlquiler;
	}

	@Override
	public double obtenerPrecioDelProducto (){
		
		double precioAlquiler = 0.0;
	
		if (tiempoEnAlquiler > 0 && tiempoEnAlquiler < 4) {
			precioAlquiler = tiempoEnAlquiler * precioAlquilerPorMes;	
		}
	
		return precioAlquiler;

	}
	
	
}
