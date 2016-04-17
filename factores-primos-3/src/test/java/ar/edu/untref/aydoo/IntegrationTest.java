package ar.edu.untref.aydoo;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class IntegrationTest {

	@Test 
	public void imprimirEnFormatoPrettyConElNumero360() {
		
		boolean estaBienImpreso;
		int numeroAFactorizar = 360;
		DescomponedorEnFactores descomponedorEnFactores = new DescomponedorEnFactores();
		ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
		List<Integer> listaDeFactoresPrimosObtenida = descomponedorEnFactores.descomponerEnFactoresPrimos(numeroAFactorizar);
		String impresionEsperada = "Factores primos " + Integer.toString(numeroAFactorizar) + ": 2 2 2 3 3 5 ";
		
		String impresionObtenida = impresorEnFormatos.imprimirEnFormatoPretty(numeroAFactorizar, listaDeFactoresPrimosObtenida);
		estaBienImpreso = impresionObtenida.equals(impresionEsperada);
		
		Assert.assertTrue(estaBienImpreso);
		
	}
	
	@Test 
	public void imprimirEnFormatoPrettyConElNumero90() {
		
		boolean estaBienImpreso;
		int numeroAFactorizar = 90;
		DescomponedorEnFactores descomponedorEnFactores = new DescomponedorEnFactores();
		ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
		List<Integer> listaDeFactoresPrimosObtenida = descomponedorEnFactores.descomponerEnFactoresPrimos(numeroAFactorizar);
		String impresionEsperada = "Factores primos " + Integer.toString(numeroAFactorizar) + ": 2 3 3 5 ";
		
		String impresionObtenida = impresorEnFormatos.imprimirEnFormatoPretty(numeroAFactorizar, listaDeFactoresPrimosObtenida);
		estaBienImpreso = impresionObtenida.equals(impresionEsperada);
		
		Assert.assertTrue(estaBienImpreso);
		
	}
	
	@Test 
	public void imprimirEnFormatoQuietConElNumero90() {
		
		boolean estaBienImpreso;
		int numeroAFactorizar = 90;
		DescomponedorEnFactores descomponedorEnFactores = new DescomponedorEnFactores();
		ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
		List<Integer> listaDeFactoresPrimosObtenida = descomponedorEnFactores.descomponerEnFactoresPrimos(numeroAFactorizar);
		String impresionEsperada = "5\n3\n3\n2\n";
		
		String impresionObtenida = impresorEnFormatos.imprimirEnFormatoQuiet(listaDeFactoresPrimosObtenida);
		estaBienImpreso = impresionObtenida.equals(impresionEsperada);
		
		Assert.assertTrue(estaBienImpreso);
		
	}
	
	@Test 
	public void imprimirEnFormatoQuietConElNumero360() {
		
		boolean estaBienImpreso;
		int numeroAFactorizar = 360;
		DescomponedorEnFactores descomponedorEnFactores = new DescomponedorEnFactores();
		ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
		List<Integer> listaDeFactoresPrimosObtenida = descomponedorEnFactores.descomponerEnFactoresPrimos(numeroAFactorizar);
		String impresionEsperada = "5\n3\n3\n2\n2\n2\n";
		
		String impresionObtenida = impresorEnFormatos.imprimirEnFormatoQuiet(listaDeFactoresPrimosObtenida);
		estaBienImpreso = impresionObtenida.equals(impresionEsperada);
		
		Assert.assertTrue(estaBienImpreso);
		
	}
	
	@Test 
	public void imprimirEnFormatoQuietAscendenteConElNumero360() {
		
		boolean estaBienImpreso;
		int numeroAFactorizar = 360;
		DescomponedorEnFactores descomponedorEnFactores = new DescomponedorEnFactores();
		ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
		List<Integer> listaDeFactoresPrimosObtenida = descomponedorEnFactores.descomponerEnFactoresPrimos(numeroAFactorizar);
		String impresionEsperada = "2\n2\n2\n3\n3\n5\n";
		
		String impresionObtenida = impresorEnFormatos.imprimirEnFormatoQuietAscendente(listaDeFactoresPrimosObtenida);
		estaBienImpreso = impresionObtenida.equals(impresionEsperada);
		
		Assert.assertTrue(estaBienImpreso);
		
	}
	
	@Test 
	public void imprimirEnFormatoQuietAscendeteConElNumero90() {
		
		boolean estaBienImpreso;
		int numeroAFactorizar = 90;
		DescomponedorEnFactores descomponedorEnFactores = new DescomponedorEnFactores();
		ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
		List<Integer> listaDeFactoresPrimosObtenida = descomponedorEnFactores.descomponerEnFactoresPrimos(numeroAFactorizar);
		String impresionEsperada = "2\n3\n3\n5\n";
		
		String impresionObtenida = impresorEnFormatos.imprimirEnFormatoQuietAscendente(listaDeFactoresPrimosObtenida);
		estaBienImpreso = impresionObtenida.equals(impresionEsperada);
		
		Assert.assertTrue(estaBienImpreso);
		
	}	


}
