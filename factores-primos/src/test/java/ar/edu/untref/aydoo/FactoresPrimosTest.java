package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class FactoresPrimosTest {

	@Test
	public void testFactorizacionConElNumero90() {
		
		int numeroAFactorizar = 90;
		String factorizacionEsperada = "2 3 3 5 ";
		String factorizacion = "";
		boolean estaBienFactorizado;
		FactoresPrimos factoresPrimos = new FactoresPrimos();
		
		factorizacion = factoresPrimos.descomponerEnFactoresPrimos(numeroAFactorizar);
		estaBienFactorizado = factorizacion.equals(factorizacionEsperada);
		
		Assert.assertTrue(estaBienFactorizado);
		
	}

	@Test
	public void testFactorizacionConElNumero360() {
		
		int numeroAFactorizar = 360;
		String factorizacionEsperada = "2 2 2 3 3 5 ";
		String factorizacion = "";
		boolean estaBienFactorizado;
		FactoresPrimos factoresPrimos = new FactoresPrimos();
		
		factorizacion = factoresPrimos.descomponerEnFactoresPrimos(numeroAFactorizar);
		estaBienFactorizado = factorizacion.equals(factorizacionEsperada);
		
		Assert.assertTrue(estaBienFactorizado);
		
	}


}
