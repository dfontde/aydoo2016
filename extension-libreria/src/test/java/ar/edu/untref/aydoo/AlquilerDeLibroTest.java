package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class AlquilerDeLibroTest {

	@Test
	public void alquilarLibroPor7DiasCuesta70Pesos() {
		
		int tiempoEnAlquiler = 7;
		Producto libroCrimenYCastigo = new AlquilerLibro(TipoAlquiler.DIARIO, tiempoEnAlquiler);
		double precioAlquilerEsperado = 70.0;
		
		double precioAlquilerObtenido = libroCrimenYCastigo.obtenerPrecioDelProducto();
			
		Assert.assertEquals(precioAlquilerEsperado, precioAlquilerObtenido,0);
	}

	@Test
	public void alquilarLibroPor2DiasDevuelve0() {
		
		int tiempoEnAlquiler = 2;
		Producto libroCrimenYCastigo = new AlquilerLibro(TipoAlquiler.DIARIO, tiempoEnAlquiler);
		double precioAlquilerEsperado = 0.0;
		
		double precioAlquilerObtenido = libroCrimenYCastigo.obtenerPrecioDelProducto();
			
		Assert.assertEquals(precioAlquilerEsperado, precioAlquilerObtenido,0);
	}

	@Test
	public void alquilarLibroPor26DiasDevuelve0() {
		
		int tiempoEnAlquiler = 26;
		Producto libroCrimenYCastigo = new AlquilerLibro(TipoAlquiler.DIARIO, tiempoEnAlquiler);
		double precioAlquilerEsperado = 0.0;
		
		double precioAlquilerObtenido = libroCrimenYCastigo.obtenerPrecioDelProducto();
			
		Assert.assertEquals(precioAlquilerEsperado, precioAlquilerObtenido,0);
	}


}




