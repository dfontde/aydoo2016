package ar.edu.untref.aydoo;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class IntegracionTest {

	@Test
	public void calcularMontoACobrarEnAgostoAJuan(){
		
		Cliente cliente = new Cliente("Juan", "Lopez", "Bonifacini 3950");
		Libreria libreria = new Libreria("Gamma");
		Compra compra = new Compra(cliente);
		Producto libroElHobbit = new Libro("El Hobbit", new java.math.BigDecimal("50.00"));
		compra.agregarProducto(libroElHobbit);
		Producto articuloDeLibreriaLapicera1 = new ArticuloDeLibreria("Lapicera", new java.math.BigDecimal("5.00")); 
		compra.agregarProducto(articuloDeLibreriaLapicera1);
		Producto articuloDeLibreriaLapicera2 = new ArticuloDeLibreria("Lapicera", new java.math.BigDecimal("5.00")); 
		compra.agregarProducto(articuloDeLibreriaLapicera2);
		Producto revistaElGrafico = new DiariosYRevistas("El Grafico", new java.math.BigDecimal("30.00")); 
		compra.agregarProducto(revistaElGrafico);
		BigDecimal montoACobrarEsperado = new java.math.BigDecimal("90.00");
		libreria.agregarCompra(compra);
		
		BigDecimal montoACobrarObtenido = libreria.calcularMontoACobrar(Mes.AGOSTO, cliente);
		
		Assert.assertEquals(montoACobrarEsperado, montoACobrarObtenido);
		
	}

}
