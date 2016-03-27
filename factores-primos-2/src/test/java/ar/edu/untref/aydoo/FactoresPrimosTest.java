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

	@Test 
	public void testImprimirEnFormatoPrettyConElNumero360() {
		
		boolean estaBienImpreso;
		int numeroAFactorizar = 360;
		FactoresPrimos factoresPrimos = new FactoresPrimos();
		List<Integer> listaDeFactoresPrimosObtenida = factoresPrimos.descomponerEnFactoresPrimos(numeroAFactorizar);
		String impresionEsperada = "Factores primos " + Integer.toString(numeroAFactorizar) + ": 2 2 2 3 3 5 ";
		
		String impresionObtenida = factoresPrimos.imprimirEnFormatoPretty(numeroAFactorizar, listaDeFactoresPrimosObtenida);
		estaBienImpreso = impresionObtenida.equals(impresionEsperada);
		
		Assert.assertTrue(estaBienImpreso);
		
	}
	
	@Test 
	public void testImprimirEnFormatoPrettyConElNumero90() {
		
		boolean estaBienImpreso;
		int numeroAFactorizar = 90;
		FactoresPrimos factoresPrimos = new FactoresPrimos();
		List<Integer> listaDeFactoresPrimosObtenida = factoresPrimos.descomponerEnFactoresPrimos(numeroAFactorizar);
		String impresionEsperada = "Factores primos " + Integer.toString(numeroAFactorizar) + ": 2 3 3 5 ";
		
		String impresionObtenida = factoresPrimos.imprimirEnFormatoPretty(numeroAFactorizar, listaDeFactoresPrimosObtenida);
		estaBienImpreso = impresionObtenida.equals(impresionEsperada);
		
		Assert.assertTrue(estaBienImpreso);
		
	}
	
	
}
