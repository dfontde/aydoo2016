package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FactoresPrimosTest {

	@Test 
	public void testFactorizacionConElNumero90() {
		
		
		boolean estaBienFactorizado;
		int numeroAFactorizar = 90;
		List<Integer> listaDeFactoresPrimosEsperada = new ArrayList<Integer>();
		listaDeFactoresPrimosEsperada.add(2);
		listaDeFactoresPrimosEsperada.add(3);
		listaDeFactoresPrimosEsperada.add(3);
		listaDeFactoresPrimosEsperada.add(5);
		List<Integer> listaDeFactoresPrimosObtenida = new ArrayList<Integer>();		
		FactoresPrimos factoresPrimos = new FactoresPrimos();
		
		listaDeFactoresPrimosObtenida = factoresPrimos.descomponerEnFactoresPrimos(numeroAFactorizar);
		estaBienFactorizado = listaDeFactoresPrimosObtenida.equals(listaDeFactoresPrimosEsperada);
		
		Assert.assertTrue(estaBienFactorizado);
		
	}

	@Test
	public void testFactorizacionConElNumero360() {
		
		boolean estaBienFactorizado;
		int numeroAFactorizar = 360;
		List<Integer> listaDeFactoresPrimosEsperada = new ArrayList<Integer>();
		listaDeFactoresPrimosEsperada.add(2);
		listaDeFactoresPrimosEsperada.add(2);
		listaDeFactoresPrimosEsperada.add(2);
		listaDeFactoresPrimosEsperada.add(3);
		listaDeFactoresPrimosEsperada.add(3);
		listaDeFactoresPrimosEsperada.add(5);
		List<Integer> listaDeFactoresPrimosObtenida = new ArrayList<Integer>();		
		FactoresPrimos factoresPrimos = new FactoresPrimos();
		
		listaDeFactoresPrimosObtenida = factoresPrimos.descomponerEnFactoresPrimos(numeroAFactorizar);
		estaBienFactorizado = listaDeFactoresPrimosObtenida.equals(listaDeFactoresPrimosEsperada);
		
		Assert.assertTrue(estaBienFactorizado);
		
	}


}
