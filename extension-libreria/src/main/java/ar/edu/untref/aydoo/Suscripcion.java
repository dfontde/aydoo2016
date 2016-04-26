package ar.edu.untref.aydoo;

import ar.edu.untref.aydoo.exception.AlquilerLibroException;

public class Suscripcion extends Producto{

	private Producto nuevoProducto;
	
	public Suscripcion (Producto nuevoProductoSuscripto) throws AlquilerLibroException {
		super(nuevoProductoSuscripto.obtenerPrecioDelProducto(),true);
		this.nuevoProducto = nuevoProductoSuscripto;
	}

	public Producto obtenerNuevoProducto() {
		return nuevoProducto;
	}
	


}