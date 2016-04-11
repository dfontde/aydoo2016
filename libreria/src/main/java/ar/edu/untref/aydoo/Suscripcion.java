package ar.edu.untref.aydoo;

import java.math.BigDecimal;

public class Suscripcion extends Producto{
	
	private DiarioYRevista productoSuscripto;
	private TipoSuscripcion tipoSuscripcion;
	private BigDecimal porcentajeDescuento = new BigDecimal("20.00");
	
	public Suscripcion(String descripcion, BigDecimal precioUnitario, DiarioYRevista productoSuscripto, TipoSuscripcion tipoSuscripcion){
		super(descripcion, precioUnitario);
		this.productoSuscripto = productoSuscripto;
		this.tipoSuscripcion = tipoSuscripcion;
	}
	
	@Override
	public BigDecimal getPrecio(){
		
		BigDecimal precioSuscripcion = new BigDecimal("0.00");
		BigDecimal cien = new BigDecimal("100.00");
		BigDecimal descuento = new BigDecimal("0.00");
		if (this.tipoSuscripcion == TipoSuscripcion.ANUAL){
			descuento = super.getPrecio().multiply(porcentajeDescuento).divide(cien);
		}
		BigDecimal precioConDescuento = super.getPrecio().subtract(descuento);
		BigDecimal cantidadDeNumeros; 
		       
    	cantidadDeNumeros= new BigDecimal(this.productoSuscripto.getPeriodicidad().getCantidadDeNumerosAlMes());
    	precioSuscripcion = precioConDescuento.multiply(cantidadDeNumeros);
		
		return precioSuscripcion;
	}
	
}
