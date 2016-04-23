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
				precioDelProducto = 0.0;
		    	break;
		    case CUATRIMESTRAL:
		    	precioDelProducto = 0.0;
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


}
