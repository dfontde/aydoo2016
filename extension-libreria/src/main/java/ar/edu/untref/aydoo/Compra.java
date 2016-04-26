package ar.edu.untref.aydoo;

import ar.edu.untref.aydoo.exception.AlquilerLibroException;

public class Compra {

	Meses nuevoMes;
	Producto nuevoProductoAComprar;
	Suscripcion nuevaSuscripcion;

	public Compra(Meses mesHechaLaCompra, Producto productoComprado) throws AlquilerLibroException {
		this.nuevoMes = mesHechaLaCompra;
		this.nuevoProductoAComprar = productoComprado;
		if (productoComprado.tieneSuscripcionAnual()) {
			this.nuevaSuscripcion = new Suscripcion(productoComprado);
		}
	}

	public Producto obtenerProductoAComprar() {
		return nuevoProductoAComprar;
	}

	public Meses obtenerMes() {
		return nuevoMes;
	}

	public Producto obtenerSuscripcion() {
		return this.nuevaSuscripcion.obtenerNuevoProducto();
	}
}