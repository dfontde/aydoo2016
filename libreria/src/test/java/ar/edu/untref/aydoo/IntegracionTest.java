package ar.edu.untref.aydoo;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class IntegracionTest {

	@Test
	public void calcularMontoACobrarEnAgostoAJuan(){
		
		Cliente cliente = new Cliente("Juan", "Lopez", "Bonifacini 3950");
		Libreria libreria = new Libreria("Gamma");
		BigDecimal montoACobrarEsperado = new java.math.BigDecimal("90.00");
		
		BigDecimal montoACobrarObtenido = libreria.calcularMontoACobrar(Mes.AGOSTO, cliente);
		
		Assert.assertEquals(montoACobrarEsperado, montoACobrarObtenido);
		
	}

}
