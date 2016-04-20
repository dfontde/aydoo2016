package ar.edu.untref.aydoo;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class IntegrationTest {

	@Test 
	public void soloConParametroNumeroImprimePorPantallaFormatoPrettyEnOrdenAscendente() {

		int numeroAFactorizar = 360;
		String [] args = {Integer.toString(numeroAFactorizar)}; 
		IdentificadorDeOpciones identificadorDeOpciones = new IdentificadorDeOpciones(args);
		numeroAFactorizar = Integer.parseInt(identificadorDeOpciones.getNumeroAFactorizar());		
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
		numeroAFactorizar = Integer.parseInt(identificadorDeOpciones.getNumeroAFactorizar());		
		String formatoImpresion = identificadorDeOpciones.getFormat();
		DescomponedorEnFactores descomponedorEnFactores = new DescomponedorEnFactores();
		List<Integer> listaDeFactoresPrimos = descomponedorEnFactores.descomponerEnFactoresPrimos(numeroAFactorizar);
		ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
		String impresionEsperada = "Factores primos 360: 2 2 2 3 3 5 "; 
				
		String impresionResultante = impresorEnFormatos.getImpresionResultante(formatoImpresion, numeroAFactorizar, listaDeFactoresPrimos, "");

		Assert.assertEquals(impresionEsperada, impresionResultante);		

	}
	
	@Test 
	public void conParametroFormatoConSortAscImprimePorPantallaEnOrdenAscendente() {

		int numeroAFactorizar = 360;
		String [] args = {Integer.toString(numeroAFactorizar), "--format=pretty", "--sort:asc"}; 
		IdentificadorDeOpciones identificadorDeOpciones = new IdentificadorDeOpciones(args);
		numeroAFactorizar = Integer.parseInt(identificadorDeOpciones.getNumeroAFactorizar());
		String formatoImpresion = identificadorDeOpciones.getFormat();
		String sort = identificadorDeOpciones.getSort();
		DescomponedorEnFactores descomponedorEnFactores = new DescomponedorEnFactores();
		List<Integer> listaDeFactoresPrimos = descomponedorEnFactores.descomponerEnFactoresPrimos(numeroAFactorizar);
		ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
		String impresionEsperada = "Factores primos 360: 2 2 2 3 3 5 "; 
				
		String impresionResultante = impresorEnFormatos.getImpresionResultante(formatoImpresion, numeroAFactorizar, listaDeFactoresPrimos, sort);

		Assert.assertEquals(impresionEsperada, impresionResultante);		

	}	

	@Test 
	public void conParametroFormatoConSortDesImprimePorPantallaEnOrdenDescendente() {

		int numeroAFactorizar = 360;
		String [] args = {Integer.toString(numeroAFactorizar), "--format=pretty", "--sort:des"}; 
		IdentificadorDeOpciones identificadorDeOpciones = new IdentificadorDeOpciones(args);
		numeroAFactorizar = Integer.parseInt(identificadorDeOpciones.getNumeroAFactorizar());		
		String formatoImpresion = identificadorDeOpciones.getFormat();
		String sort = identificadorDeOpciones.getSort();
		DescomponedorEnFactores descomponedorEnFactores = new DescomponedorEnFactores();
		List<Integer> listaDeFactoresPrimos = descomponedorEnFactores.descomponerEnFactoresPrimos(numeroAFactorizar);
		ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
		String impresionEsperada = "Factores primos 360: 5 3 3 2 2 2 "; 
				
		String impresionResultante = impresorEnFormatos.getImpresionResultante(formatoImpresion, numeroAFactorizar, listaDeFactoresPrimos, sort);

		Assert.assertEquals(impresionEsperada, impresionResultante);		

	}
	
	@Test 
	public void conParametroFormatoConSortDesConOutputPersisteEnArchivoEnDirectorioTarget() throws IOException {

		int posicionPathReal = 14;
		int numeroAFactorizar = 360;
		String [] args = {Integer.toString(numeroAFactorizar), "--format=pretty", "--sort:des", "--output-file:salida.txt"}; 
		IdentificadorDeOpciones identificadorDeOpciones = new IdentificadorDeOpciones(args);
		numeroAFactorizar = Integer.parseInt(identificadorDeOpciones.getNumeroAFactorizar());		
		String formatoImpresion = identificadorDeOpciones.getFormat();
		String sort = identificadorDeOpciones.getSort();
		String output = identificadorDeOpciones.getOutput();
		String path = output.substring(posicionPathReal);
		DescomponedorEnFactores descomponedorEnFactores = new DescomponedorEnFactores();
		List<Integer> listaDeFactoresPrimos = descomponedorEnFactores.descomponerEnFactoresPrimos(numeroAFactorizar);
		ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
		String impresionResultante = impresorEnFormatos.getImpresionResultante(formatoImpresion, numeroAFactorizar, listaDeFactoresPrimos, sort);
		FactoresPrimosDAO factoresPrimosDAO = new FactoresPrimosDAO(path);
		
		factoresPrimosDAO.escribirFactorizacion(impresionResultante);
		String impresionObtenida = factoresPrimosDAO.leerFactorizacion();
		
		Assert.assertEquals(impresionResultante.trim(), impresionObtenida.trim());		

			
	}

	@Test 
	public void conParametroFormatoSinSortConOutputPersisteEnArchivoEnDirectorioTarget() throws IOException {

		int posicionPathReal = 14;
		int numeroAFactorizar = 360;
		String [] args = {Integer.toString(numeroAFactorizar), "--format=pretty", "--output-file:salida.txt"}; 
		IdentificadorDeOpciones identificadorDeOpciones = new IdentificadorDeOpciones(args);
		numeroAFactorizar = Integer.parseInt(identificadorDeOpciones.getNumeroAFactorizar());		
		String formatoImpresion = identificadorDeOpciones.getFormat();
		String sort = identificadorDeOpciones.getSort();
		String output = identificadorDeOpciones.getOutput();
		String path = output.substring(posicionPathReal);
		DescomponedorEnFactores descomponedorEnFactores = new DescomponedorEnFactores();
		List<Integer> listaDeFactoresPrimos = descomponedorEnFactores.descomponerEnFactoresPrimos(numeroAFactorizar);
		ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
		String impresionResultante = impresorEnFormatos.getImpresionResultante(formatoImpresion, numeroAFactorizar, listaDeFactoresPrimos, sort);
		FactoresPrimosDAO factoresPrimosDAO = new FactoresPrimosDAO(path);
		
		factoresPrimosDAO.escribirFactorizacion(impresionResultante);
		String impresionObtenida = factoresPrimosDAO.leerFactorizacion();
		
		Assert.assertEquals(impresionResultante.trim(), impresionObtenida.trim());		

			
	}

	@Test 
	public void soloConParametroOutputPersisteEnArchivoEnDirectorioTargetFormatoPrettySortAsc() throws IOException {

		int posicionPathReal = 14;
		int numeroAFactorizar = 360;
		String [] args = {Integer.toString(numeroAFactorizar), "--output-file:salida.txt"}; 
		IdentificadorDeOpciones identificadorDeOpciones = new IdentificadorDeOpciones(args);
		numeroAFactorizar = Integer.parseInt(identificadorDeOpciones.getNumeroAFactorizar());		
		String formatoImpresion = identificadorDeOpciones.getFormat();
		String sort = identificadorDeOpciones.getSort();
		String output = identificadorDeOpciones.getOutput();
		String path = output.substring(posicionPathReal);
		DescomponedorEnFactores descomponedorEnFactores = new DescomponedorEnFactores();
		List<Integer> listaDeFactoresPrimos = descomponedorEnFactores.descomponerEnFactoresPrimos(numeroAFactorizar);
		ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
		String impresionResultante = impresorEnFormatos.getImpresionResultante(formatoImpresion, numeroAFactorizar, listaDeFactoresPrimos, sort);
		FactoresPrimosDAO factoresPrimosDAO = new FactoresPrimosDAO(path);
		
		factoresPrimosDAO.escribirFactorizacion(impresionResultante);
		String impresionObtenida = factoresPrimosDAO.leerFactorizacion();
		
		Assert.assertEquals(impresionResultante.trim(), impresionObtenida.trim());		

			
	}

}
