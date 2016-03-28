package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class HacedorDeTeConLecheTest {

	@Test
	public void testPrepararEnEsteVaso() {
		
		HacedorDeTeConLeche hacedorDeTeConLeche = new HacedorDeTeConLeche();
		Vaso vasoEsperado = new Vaso();
		vasoEsperado.agregarContenido(Contenido.TE);
		vasoEsperado.agregarContenido(Contenido.LECHE);
		Vaso vasoObtenido = new Vaso();
		
		vasoObtenido = hacedorDeTeConLeche.prepararEnEsteVaso(vasoObtenido);
		
		Assert.assertEquals(vasoEsperado.getContenido(), vasoObtenido.getContenido());
		
	}
		

}
