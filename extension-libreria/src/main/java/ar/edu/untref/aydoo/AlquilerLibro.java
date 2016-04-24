package ar.edu.untref.aydoo;

public class AlquilerLibro extends Producto {

	private int tiempoEnAlquiler;
	
	public AlquilerLibro(int tiempoEnAlquiler) {
		super(0, false);
		this.tiempoEnAlquiler = tiempoEnAlquiler;
	}
		
}
