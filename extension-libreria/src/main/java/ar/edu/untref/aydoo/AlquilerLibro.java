package ar.edu.untref.aydoo;

import ar.edu.untref.aydoo.exception.AlquilerLibroException;

public abstract class AlquilerLibro extends Producto {

	public AlquilerLibro() {
		super(0, false);
	}

	@Override
	public abstract double obtenerPrecioDelProducto() throws AlquilerLibroException;

}
