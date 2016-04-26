package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.untref.aydoo.exception.AlquilerLibroCuatrimestralException;
import ar.edu.untref.aydoo.exception.AlquilerLibroDiarioException;
import ar.edu.untref.aydoo.exception.AlquilerLibroException;
import ar.edu.untref.aydoo.exception.AlquilerLibroMensualException;

public class AlquilerLibroTest {

	@Test
	public void alquilarLibroPor7DiasCuesta70Pesos() throws AlquilerLibroException {

		int tiempoEnAlquiler = 7;
		Producto libroCrimenYCastigo = new AlquilerLibroDiario(tiempoEnAlquiler);
		double precioAlquilerEsperado = 70.0;

		double precioAlquilerObtenido = libroCrimenYCastigo.obtenerPrecioDelProducto();

		Assert.assertEquals(precioAlquilerEsperado, precioAlquilerObtenido, 0);
	}

	@Test(expected = AlquilerLibroDiarioException.class)
	public void alquilarLibroPor2DiasLanzaExcepcion() throws AlquilerLibroException {

		int tiempoEnAlquiler = 2;
		Producto libroCrimenYCastigo = new AlquilerLibroDiario(tiempoEnAlquiler);

		libroCrimenYCastigo.obtenerPrecioDelProducto();

	}

	@Test(expected = AlquilerLibroDiarioException.class)
	public void alquilarLibroPor26DiasLanzaExcepcion() throws AlquilerLibroException {

		int tiempoEnAlquiler = 26;
		Producto libroCrimenYCastigo = new AlquilerLibroDiario(tiempoEnAlquiler);

		libroCrimenYCastigo.obtenerPrecioDelProducto();

	}

	@Test
	public void alquilarLibroPor2MesesCuesta400Pesos() throws AlquilerLibroException {

		int tiempoEnAlquiler = 2;
		Producto libroCrimenYCastigo = new AlquilerLibroMensual(tiempoEnAlquiler);
		double precioAlquilerEsperado = 400.0;

		double precioAlquilerObtenido = libroCrimenYCastigo.obtenerPrecioDelProducto();

		Assert.assertEquals(precioAlquilerEsperado, precioAlquilerObtenido, 0);
	}

	@Test
	public void alquilarLibroPor3MesesCuesta600Pesos() throws AlquilerLibroException {

		int tiempoEnAlquiler = 3;
		Producto libroCrimenYCastigo = new AlquilerLibroMensual(tiempoEnAlquiler);
		double precioAlquilerEsperado = 600.0;

		double precioAlquilerObtenido = libroCrimenYCastigo.obtenerPrecioDelProducto();

		Assert.assertEquals(precioAlquilerEsperado, precioAlquilerObtenido, 0);
	}

	@Test(expected = AlquilerLibroMensualException.class)
	public void alquilarLibroPor4MesesLanzaExcepcion() throws AlquilerLibroException {

		int tiempoEnAlquiler = 4;
		Producto libroCrimenYCastigo = new AlquilerLibroMensual(tiempoEnAlquiler);

		libroCrimenYCastigo.obtenerPrecioDelProducto();

	}

	@Test(expected = AlquilerLibroMensualException.class)
	public void alquilarLibroPor0MesesLanzaExcepcion() throws AlquilerLibroException {

		int tiempoEnAlquiler = 0;
		Producto libroCrimenYCastigo = new AlquilerLibroMensual(tiempoEnAlquiler);

		libroCrimenYCastigo.obtenerPrecioDelProducto();

	}

	@Test
	public void alquilarLibroPor1CuatrimestreCuesta720Pesos() throws AlquilerLibroException {

		int tiempoEnAlquiler = 1;
		Producto libroCrimenYCastigo = new AlquilerLibroCuatrimestral(tiempoEnAlquiler);
		double precioAlquilerEsperado = 720.0;

		double precioAlquilerObtenido = libroCrimenYCastigo.obtenerPrecioDelProducto();

		Assert.assertEquals(precioAlquilerEsperado, precioAlquilerObtenido, 0);
	}

	@Test
	public void alquilarLibroPor2CuatrimestreCuesta1440Pesos() throws AlquilerLibroException {

		int tiempoEnAlquiler = 2;
		Producto libroCrimenYCastigo = new AlquilerLibroCuatrimestral(tiempoEnAlquiler);
		double precioAlquilerEsperado = 1440.0;

		double precioAlquilerObtenido = libroCrimenYCastigo.obtenerPrecioDelProducto();

		Assert.assertEquals(precioAlquilerEsperado, precioAlquilerObtenido, 0);
	}

	@Test(expected = AlquilerLibroCuatrimestralException.class)
	public void alquilarLibroPor3CuatrimestreLanzaExcepcion() throws AlquilerLibroException {

		int tiempoEnAlquiler = 3;
		Producto libroCrimenYCastigo = new AlquilerLibroCuatrimestral(tiempoEnAlquiler);

		libroCrimenYCastigo.obtenerPrecioDelProducto();

	}

	@Test(expected = AlquilerLibroCuatrimestralException.class)
	public void alquilarLibroPor0CuatrimestreLanzaExcepcion() throws AlquilerLibroException {

		int tiempoEnAlquiler = 0;
		Producto libroCrimenYCastigo = new AlquilerLibroCuatrimestral(tiempoEnAlquiler);

		libroCrimenYCastigo.obtenerPrecioDelProducto();

	}

}
