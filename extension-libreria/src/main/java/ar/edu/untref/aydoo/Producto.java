package ar.edu.untref.aydoo;

import ar.edu.untref.aydoo.exception.AlquilerLibroException;

public abstract class Producto {

	private double precioDelProducto;
	private boolean tieneSuscripcionAnual;

	public Producto(double productoAsignaPrecio, boolean suscripcionAnual) {
		this.precioDelProducto = productoAsignaPrecio;
		this.tieneSuscripcionAnual = suscripcionAnual;
	}

	public double obtenerPrecioDelProducto() throws AlquilerLibroException {
		return this.precioDelProducto;
	}

	public void modificarPrecioDelProducto(double nuevoPrecioDelProducto) {
		this.precioDelProducto = nuevoPrecioDelProducto;
	}

	public boolean tieneSuscripcionAnual() {
		return this.tieneSuscripcionAnual;
	}

}