package ar.edu.untref.aydoo;

import ar.edu.untref.aydoo.alquilerLibro.AlquilerLibroExcepcion;

public abstract class AlquilerLibro extends Producto {
	
	public AlquilerLibro() {
		super(0, false);
	}

	@Override
	public abstract double obtenerPrecioDelProducto () throws AlquilerLibroExcepcion;
		
}
