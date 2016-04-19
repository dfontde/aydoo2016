package ar.edu.untref.aydoo;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class ImpresorEnFormatosTest {

	private final String sortASC = "ASC";
	private final String sortDES = "DES";

	@Test 
	public void imprimirEnFormatoQuietConElNumero360Ascendente() {
		
		boolean estaBienImpreso;
		int numeroAFactorizar = 360;
		DescomponedorEnFactores descomponedorEnFactores = new DescomponedorEnFactores();
		ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
		List<Integer> listaDeFactoresPrimosObtenida = descomponedorEnFactores.descomponerEnFactoresPrimos(numeroAFactorizar);
		String impresionEsperada = "2\n2\n2\n3\n3\n5\n";
		
		String impresionObtenida = impresorEnFormatos.imprimirEnFormatoQuietSegunSort(listaDeFactoresPrimosObtenida, sortASC);
		estaBienImpreso = impresionObtenida.equals(impresionEsperada);
		
		Assert.assertTrue(estaBienImpreso);
		
	}
	
	@Test 
	public void imprimirEnFormatoQuietConElNumero90Ascendente() {
		
		boolean estaBienImpreso;
		int numeroAFactorizar = 90;
		DescomponedorEnFactores descomponedorEnFactores = new DescomponedorEnFactores();
		ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
		List<Integer> listaDeFactoresPrimosObtenida = descomponedorEnFactores.descomponerEnFactoresPrimos(numeroAFactorizar);
		String impresionEsperada = "2\n3\n3\n5\n";
		
		String impresionObtenida = impresorEnFormatos.imprimirEnFormatoQuietSegunSort(listaDeFactoresPrimosObtenida, sortASC);
		estaBienImpreso = impresionObtenida.equals(impresionEsperada);
		
		Assert.assertTrue(estaBienImpreso);
		
	}
	
	@Test 
	public void imprimirEnFormatoQuietConElNumero360Descendente() {
		
		boolean estaBienImpreso;
		int numeroAFactorizar = 360;
		DescomponedorEnFactores descomponedorEnFactores = new DescomponedorEnFactores();
		ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
		List<Integer> listaDeFactoresPrimosObtenida = descomponedorEnFactores.descomponerEnFactoresPrimos(numeroAFactorizar);
		String impresionEsperada = "5\n3\n3\n2\n2\n2\n";
		
		String impresionObtenida = impresorEnFormatos.imprimirEnFormatoQuietSegunSort(listaDeFactoresPrimosObtenida, sortDES);
		estaBienImpreso = impresionObtenida.equals(impresionEsperada);
		
		Assert.assertTrue(estaBienImpreso);
		
	}
	
	@Test 
	public void imprimirEnFormatoQuietConElNumero90Descendente() {
		
		boolean estaBienImpreso;
		int numeroAFactorizar = 90;
		DescomponedorEnFactores descomponedorEnFactores = new DescomponedorEnFactores();
		ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
		List<Integer> listaDeFactoresPrimosObtenida = descomponedorEnFactores.descomponerEnFactoresPrimos(numeroAFactorizar);
		String impresionEsperada = "5\n3\n3\n2\n";
		
		String impresionObtenida = impresorEnFormatos.imprimirEnFormatoQuietSegunSort(listaDeFactoresPrimosObtenida, sortDES);
		estaBienImpreso = impresionObtenida.equals(impresionEsperada);
		
		Assert.assertTrue(estaBienImpreso);
		
	}
	
	@Test 
	public void imprimirEnFormatoPrettyConElNumero360Ascendente() {
		
		boolean estaBienImpreso;
		int numeroAFactorizar = 360;
		DescomponedorEnFactores descomponedorEnFactores = new DescomponedorEnFactores();
		ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
		List<Integer> listaDeFactoresPrimosObtenida = descomponedorEnFactores.descomponerEnFactoresPrimos(numeroAFactorizar);
		String impresionEsperada = "Factores primos " + Integer.toString(numeroAFactorizar) + ": 2 2 2 3 3 5 ";
		
		String impresionObtenida = impresorEnFormatos.imprimirEnFormatoPrettySegunSort(numeroAFactorizar, listaDeFactoresPrimosObtenida, sortASC);
		estaBienImpreso = impresionObtenida.equals(impresionEsperada);
		
		Assert.assertTrue(estaBienImpreso);
		
	}
	
	@Test 
	public void imprimirEnFormatoPrettyConElNumero90Ascendente() {
		
		boolean estaBienImpreso;
		int numeroAFactorizar = 90;
		DescomponedorEnFactores descomponedorEnFactores = new DescomponedorEnFactores();
		ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
		List<Integer> listaDeFactoresPrimosObtenida = descomponedorEnFactores.descomponerEnFactoresPrimos(numeroAFactorizar);
		String impresionEsperada = "Factores primos " + Integer.toString(numeroAFactorizar) + ": 2 3 3 5 ";
		
		String impresionObtenida = impresorEnFormatos.imprimirEnFormatoPrettySegunSort(numeroAFactorizar, listaDeFactoresPrimosObtenida, sortASC);
		estaBienImpreso = impresionObtenida.equals(impresionEsperada);
		
		Assert.assertTrue(estaBienImpreso);
		
	}

	@Test 
	public void imprimirEnFormatoPrettyConElNumero360Descendente() {
		
		boolean estaBienImpreso;
		int numeroAFactorizar = 360;
		DescomponedorEnFactores descomponedorEnFactores = new DescomponedorEnFactores();
		ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
		List<Integer> listaDeFactoresPrimosObtenida = descomponedorEnFactores.descomponerEnFactoresPrimos(numeroAFactorizar);
		String impresionEsperada = "Factores primos " + Integer.toString(numeroAFactorizar) + ": 5 3 3 2 2 2 ";
		
		String impresionObtenida = impresorEnFormatos.imprimirEnFormatoPrettySegunSort(numeroAFactorizar, listaDeFactoresPrimosObtenida, sortDES);
		estaBienImpreso = impresionObtenida.equals(impresionEsperada);
		
		Assert.assertTrue(estaBienImpreso);
		
	}
	
	@Test 
	public void imprimirEnFormatoPrettyConElNumero90Descendente() {
		
		boolean estaBienImpreso;
		int numeroAFactorizar = 90;
		DescomponedorEnFactores descomponedorEnFactores = new DescomponedorEnFactores();
		ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
		List<Integer> listaDeFactoresPrimosObtenida = descomponedorEnFactores.descomponerEnFactoresPrimos(numeroAFactorizar);
		String impresionEsperada = "Factores primos " + Integer.toString(numeroAFactorizar) + ": 5 3 3 2 ";
		
		String impresionObtenida = impresorEnFormatos.imprimirEnFormatoPrettySegunSort(numeroAFactorizar, listaDeFactoresPrimosObtenida, sortDES);
		estaBienImpreso = impresionObtenida.equals(impresionEsperada);
		
		Assert.assertTrue(estaBienImpreso);
		
	}	

}
