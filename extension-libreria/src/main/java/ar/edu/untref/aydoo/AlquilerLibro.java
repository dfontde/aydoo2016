package ar.edu.untref.aydoo;

public abstract class AlquilerLibro extends Producto {
	
	public AlquilerLibro() {
		super(0, false);
	}

	@Override
	public abstract double obtenerPrecioDelProducto ();
		
}
