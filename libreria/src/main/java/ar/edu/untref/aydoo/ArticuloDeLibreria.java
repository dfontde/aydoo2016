package ar.edu.untref.aydoo;

import java.math.BigDecimal;

public class ArticuloDeLibreria extends Producto{

	private BigDecimal porcentajeIVA = new BigDecimal("21.00");
	private BigDecimal iva;
	
	public ArticuloDeLibreria(String descripcion, BigDecimal precioSinIVA){
		super(descripcion, precioSinIVA);
		BigDecimal cien = new BigDecimal("100.00");
		this.iva = (precioSinIVA.multiply(porcentajeIVA)).divide(cien);
	}
	
	@Override
	public BigDecimal getPrecio(){
		return this.iva.add(super.getPrecio());
	}
	
}
