package ar.edu.untref.aydoo;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class IntegracionTest {

	@Test
	public void calcularMontoACobrarEnAgostoAJuan(){
		
		Cliente cliente = new Cliente("Juan", "Lopez", "Bonifacini 3950");
		Libreria libreria = new Libreria("Gamma");
		Compra compra = new Compra(Mes.AGOSTO, cliente);
		Producto libroElHobbit = new Libro("El Hobbit", new java.math.BigDecimal("50.00"));
		compra.agregarProducto(libroElHobbit);
		Producto articuloDeLibreriaLapicera1 = new ArticuloDeLibreria("Lapicera", new java.math.BigDecimal("5.00")); 
		compra.agregarProducto(articuloDeLibreriaLapicera1);
		Producto articuloDeLibreriaLapicera2 = new ArticuloDeLibreria("Lapicera", new java.math.BigDecimal("5.00")); 
		compra.agregarProducto(articuloDeLibreriaLapicera2);
		Producto revistaElGrafico = new DiarioYRevista("El Grafico", new java.math.BigDecimal("30.00")); 
		compra.agregarProducto(revistaElGrafico);
		BigDecimal montoACobrarEsperado = new java.math.BigDecimal("92.10");
		libreria.agregarCompra(compra);
		
		BigDecimal montoACobrarObtenido = libreria.calcularMontoACobrar(Mes.AGOSTO, cliente);
		
		Assert.assertEquals(montoACobrarEsperado, montoACobrarObtenido);
		
	}

	@Test
	public void calcularMontoACobrarEnEneroAMaria(){
		
		Cliente cliente = new Cliente("Maria", "Suarez", "Patricios 1420");
		Libreria libreria = new Libreria("Gamma");
		Compra compra = new Compra(Mes.ENERO, cliente);
		Producto diarioPagina12 = new DiarioYRevista("Pagina 12", new java.math.BigDecimal("12.00")); 
		compra.agregarProducto(diarioPagina12);
		DiarioYRevista revistaBarcelona = new DiarioYRevista("Revista Barcelona", new java.math.BigDecimal("20.00"));
		revistaBarcelona.setPeriodicidad(Periodicidad.QUINCENAL);
		Producto suscripcionAnualARevistaBarcelona = new Suscripcion("Suscripcion anual a Revista Barcelona", new java.math.BigDecimal("20.00"), revistaBarcelona);		
		compra.agregarProducto(suscripcionAnualARevistaBarcelona);				
		
		BigDecimal montoACobrarEsperado = new java.math.BigDecimal("44.00");
		libreria.agregarCompra(compra);
		
		BigDecimal montoACobrarObtenido = libreria.calcularMontoACobrar(Mes.ENERO, cliente);
		
		Assert.assertEquals(montoACobrarEsperado, montoACobrarObtenido);
		
	}

}
