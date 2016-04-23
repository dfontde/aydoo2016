package ar.edu.untref.aydoo;

public enum TipoAlquiler {

	DIARIO(10.0),
	MENSUAL(200.0),
	CUATRIMESTRAL(800.0);
	
	private Double precioUnitario;
	
	private TipoAlquiler (Double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	
	public Double getPrecioUnitario(){
		return this.precioUnitario;
	}
	
}



