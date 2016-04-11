package ar.edu.untref.aydoo;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class ProductoTest {

	@Test
	public void elPrecioDevueltoDeUnProductoNoIncluyeIVA() {
		
		BigDecimal precioSinIVA = new BigDecimal("100.00");
		Producto libroElTunel = new Producto("El tunel", precioSinIVA);
		
		BigDecimal precioSinIVAObtenido = libroElTunel.getPrecio();
		
		Assert.assertEquals(precioSinIVA, precioSinIVAObtenido);
		
	}

}
