package ar.edu.untref.aydoo;

import ar.edu.untref.aydoo.exception.AlquilerLibroExcepcion;

public class Suscripcion extends Producto{

	private Producto nuevoProducto;
	
	public Suscripcion (Producto nuevoProductoSuscripto) throws AlquilerLibroExcepcion {
		super(nuevoProductoSuscripto.obtenerPrecioDelProducto(),true);
		this.nuevoProducto = nuevoProductoSuscripto;
	}

	public Producto obtenerNuevoProducto() {
		return nuevoProducto;
	}
	


}