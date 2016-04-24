package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.untref.aydoo.exception.AlquilerLibroDiarioException;
import ar.edu.untref.aydoo.exception.AlquilerLibroExcepcion;
import ar.edu.untref.aydoo.exception.AlquilerLibroMensualException;

public class AlquilerLibroTest {

	@Test
	public void alquilarLibroPor7DiasCuesta70Pesos() throws AlquilerLibroExcepcion {
		
		int tiempoEnAlquiler = 7;
		Producto libroCrimenYCastigo = new AlquilerLibroDiario(tiempoEnAlquiler);
		double precioAlquilerEsperado = 70.0;
		
		double precioAlquilerObtenido = libroCrimenYCastigo.obtenerPrecioDelProducto();
			
		Assert.assertEquals(precioAlquilerEsperado, precioAlquilerObtenido,0);
	}

	@Test(expected=AlquilerLibroDiarioException.class)
	public void alquilarLibroPor2DiasLanzaExcepcion() throws AlquilerLibroExcepcion{
		
		int tiempoEnAlquiler = 2;
		Producto libroCrimenYCastigo = new AlquilerLibroDiario(tiempoEnAlquiler);
	
		libroCrimenYCastigo.obtenerPrecioDelProducto();
	
	}

	@Test(expected=AlquilerLibroDiarioException.class)
	public void alquilarLibroPor26DiasLanzaExcepcion() throws AlquilerLibroExcepcion {
		
		int tiempoEnAlquiler = 26;
		Producto libroCrimenYCastigo = new AlquilerLibroDiario(tiempoEnAlquiler);

		libroCrimenYCastigo.obtenerPrecioDelProducto();

	}

	@Test
	public void alquilarLibroPor2MesesCuesta400Pesos() throws AlquilerLibroExcepcion {
		
		int tiempoEnAlquiler = 2;
		Producto libroCrimenYCastigo = new AlquilerLibroMensual(tiempoEnAlquiler);
		double precioAlquilerEsperado = 400.0;
		
		double precioAlquilerObtenido = libroCrimenYCastigo.obtenerPrecioDelProducto();
			
		Assert.assertEquals(precioAlquilerEsperado, precioAlquilerObtenido,0);
	}

	@Test
	public void alquilarLibroPor3MesesCuesta600Pesos() throws AlquilerLibroExcepcion {
		
		int tiempoEnAlquiler = 3;
		Producto libroCrimenYCastigo = new AlquilerLibroMensual(tiempoEnAlquiler);
		double precioAlquilerEsperado = 600.0;
		
		double precioAlquilerObtenido = libroCrimenYCastigo.obtenerPrecioDelProducto();
			
		Assert.assertEquals(precioAlquilerEsperado, precioAlquilerObtenido,0);
	}

	@Test(expected=AlquilerLibroMensualException.class)
	public void alquilarLibroPor4MesesLanzaExcepcion() throws AlquilerLibroExcepcion {
		
		int tiempoEnAlquiler = 4;
		Producto libroCrimenYCastigo = new AlquilerLibroMensual(tiempoEnAlquiler);
		
		libroCrimenYCastigo.obtenerPrecioDelProducto();
			
	}

	@Test
	public void alquilarLibroPor1CuatrimestreCuesta720Pesos() throws AlquilerLibroExcepcion {
		
		int tiempoEnAlquiler = 1;
		Producto libroCrimenYCastigo = new AlquilerLibroCuatrimestral(tiempoEnAlquiler);
		double precioAlquilerEsperado = 720.0;
		
		double precioAlquilerObtenido = libroCrimenYCastigo.obtenerPrecioDelProducto();
			
		Assert.assertEquals(precioAlquilerEsperado, precioAlquilerObtenido,0);
	}

	@Test
	public void alquilarLibroPor2CuatrimestreCuesta1440Pesos() throws AlquilerLibroExcepcion {
		
		int tiempoEnAlquiler = 2;
		Producto libroCrimenYCastigo = new AlquilerLibroCuatrimestral(tiempoEnAlquiler);
		double precioAlquilerEsperado = 1440.0;
		
		double precioAlquilerObtenido = libroCrimenYCastigo.obtenerPrecioDelProducto();
			
		Assert.assertEquals(precioAlquilerEsperado, precioAlquilerObtenido,0);
	}

	@Test
	public void alquilarLibroPor3CuatrimestreDevuelve0() throws AlquilerLibroExcepcion {
		
		int tiempoEnAlquiler = 3;
		Producto libroCrimenYCastigo = new AlquilerLibroCuatrimestral(tiempoEnAlquiler);
		double precioAlquilerEsperado = 0.0;
		
		double precioAlquilerObtenido = libroCrimenYCastigo.obtenerPrecioDelProducto();
			
		Assert.assertEquals(precioAlquilerEsperado, precioAlquilerObtenido,0);
	}


}




