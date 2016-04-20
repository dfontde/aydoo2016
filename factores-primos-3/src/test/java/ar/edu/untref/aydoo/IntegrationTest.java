package ar.edu.untref.aydoo;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class IntegrationTest {

	@Test 
	public void soloConParametroNumeroImprimePorPantallaFormatoPrettyEnOrdenAscendente() {

		int numeroAFactorizar = 360;
		String [] args = {Integer.toString(numeroAFactorizar)}; 
		IdentificadorDeOpciones identificadorDeOpciones = new IdentificadorDeOpciones(args);
		numeroAFactorizar = Integer.parseInt(args[0]);		
		DescomponedorEnFactores descomponedorEnFactores = new DescomponedorEnFactores();
		List<Integer> listaDeFactoresPrimos = descomponedorEnFactores.descomponerEnFactoresPrimos(numeroAFactorizar);
		ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
		String impresionEsperada = "Factores primos 360: 2 2 2 3 3 5 "; 
				
		String impresionResultante = impresorEnFormatos.getImpresionResultante("", numeroAFactorizar, listaDeFactoresPrimos, "");

		Assert.assertEquals(impresionEsperada, impresionResultante);		

	}

	@Test 
	public void conParametroFormatoSinSortImprimePorPantallaEnOrdenAscendente() {

		int numeroAFactorizar = 360;
		String [] args = {Integer.toString(numeroAFactorizar), "--format=pretty"}; 
		IdentificadorDeOpciones identificadorDeOpciones = new IdentificadorDeOpciones(args);
		numeroAFactorizar = Integer.parseInt(args[0]);		
		String formatoImpresion = identificadorDeOpciones.getFormat();
		DescomponedorEnFactores descomponedorEnFactores = new DescomponedorEnFactores();
		List<Integer> listaDeFactoresPrimos = descomponedorEnFactores.descomponerEnFactoresPrimos(numeroAFactorizar);
		ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
		String impresionEsperada = "Factores primos 360: 2 2 2 3 3 5 "; 
				
		String impresionResultante = impresorEnFormatos.getImpresionResultante(formatoImpresion, numeroAFactorizar, listaDeFactoresPrimos, "");

		Assert.assertEquals(impresionEsperada, impresionResultante);		

	}
	

}
