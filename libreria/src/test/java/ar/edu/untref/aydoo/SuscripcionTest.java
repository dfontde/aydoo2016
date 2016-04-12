package ar.edu.untref.aydoo;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class SuscripcionTest {

	@Test
	public void tipoDeSuscripcionAnualObtiene20PorCientoDeDescuento(){
		
		DiarioYRevista revistaElGrafico = new DiarioYRevista("Revista El Grafico", new java.math.BigDecimal("30.00"),
															Periodicidad.MENSUAL);
		Producto suscripcionAnualARevistaElGrafico = new Suscripcion("Suscripcion anual a Revista El Grafico", 
																	new java.math.BigDecimal("30.00"), 
																	revistaElGrafico, TipoSuscripcion.ANUAL);
		BigDecimal precioSuscripcionEsperado = new BigDecimal("24.00");
		
		BigDecimal precioSuscripcionObtenido = suscripcionAnualARevistaElGrafico.getPrecio();
		
		Assert.assertEquals(precioSuscripcionEsperado, precioSuscripcionObtenido);
		
	}

}
