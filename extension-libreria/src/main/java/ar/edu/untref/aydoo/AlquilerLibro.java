package ar.edu.untref.aydoo;

public class AlquilerLibro extends Producto {

	private TipoAlquiler tipoAlquiler;
	private int tiempoEnAlquiler;
	
	public AlquilerLibro(TipoAlquiler tipoAlquiler, int tiempoEnAlquiler) {
		super(0, false);
		this.tipoAlquiler = tipoAlquiler;
		this.tiempoEnAlquiler = tiempoEnAlquiler;
	}
	
	@Override
	public double obtenerPrecioDelProducto (){
		
		double precioDelProducto = 0.0;
			
		switch (tipoAlquiler) {	
		    case DIARIO:
		    	precioDelProducto = calcularPrecioAlquilerDiario();
		    	break;
			case MENSUAL:
				precioDelProducto = calcularPrecioAlquilerMensual();
		    	break;
		    case CUATRIMESTRAL:
		    	precioDelProducto = calcularPrecioAlquilerCuatrimestral();
		    	break;
		    default:
		    	precioDelProducto = 0.0;
				break; 
		}  		
		
		return precioDelProducto;
	}

	/**
	 * pre: el tiempo de alquiler debe estar entre los 3 y los 25 dias.
	 * post: precio de alquiler, devuelve 0 si no se cumple la precondicion.
	 */
	private double calcularPrecioAlquilerDiario() {
		
		double precioAlquiler = 0.0;
	
		if (tiempoEnAlquiler > 2 && tiempoEnAlquiler < 26) {
			precioAlquiler = tipoAlquiler.getPrecioUnitario() * tiempoEnAlquiler;
		}
		
		return precioAlquiler;

	}

	/**
	 * pre: el tiempo de alquiler debe estar entre 1 y 3 meses.
	 * post: precio de alquiler, devuelve 0 si no se cumple la precondicion.
	 */
	private double calcularPrecioAlquilerMensual() {
		
		double precioAlquiler = 0.0;
	
		if (tiempoEnAlquiler > 0 && tiempoEnAlquiler < 4) {
			precioAlquiler = tipoAlquiler.getPrecioUnitario() * tiempoEnAlquiler;
		}
		
		return precioAlquiler;
	}
	
	/**
	 * pre: el tiempo de alquiler debe estar entre 1 y 2 cuatrimestres.
	 * post: precio de alquiler, devuelve 0 si no se cumple la precondicion.
	 */
	private double calcularPrecioAlquilerCuatrimestral() {
		
		double precioAlquiler = 0.0;
		final double porcentajeDescuento = 10.0;
		final double cien = 100.0;
	
		if (tiempoEnAlquiler > 0 && tiempoEnAlquiler < 3) {
			precioAlquiler = (tipoAlquiler.getPrecioUnitario() - (tipoAlquiler.getPrecioUnitario() * porcentajeDescuento /cien)) * tiempoEnAlquiler;
		}
		
		return precioAlquiler;
	}
	
}
