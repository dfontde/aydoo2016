package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class HacedorDeCafeConLecheTest {

	@Test
	public void testPrepararEnEsteVaso() {
		
		HacedorDeCafeConLeche hacedorDeCafeConLeche = new HacedorDeCafeConLeche();
		Vaso vasoEsperado = new Vaso();
		vasoEsperado.agregarContenido(Contenido.CAFE);
		vasoEsperado.agregarContenido(Contenido.LECHE);
		Vaso vasoObtenido = new Vaso();
		
		vasoObtenido = hacedorDeCafeConLeche.prepararEnEsteVaso(vasoObtenido);
		
		Assert.assertEquals(vasoEsperado.getContenido(), vasoObtenido.getContenido());
		
	}

}
