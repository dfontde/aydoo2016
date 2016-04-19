package ar.edu.untref.aydoo;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class IntegrationTest {

	@Test 
	public void persistirEnArchivoEnDirectorioDelProyectoEnFormatoQuietAscendenteConElNumero360() throws IOException {

		int numeroAFactorizar = 1024;
		String formatoEsperado = "--FORMAT=PRETTY";
		String sortEsperado = "--SORT:ASC";
		String outputEsperado = "--OUTPUT-FILE:salida.txt";
		String[] args = {"1024", formatoEsperado, sortEsperado, outputEsperado};
		AdministradorDeFuncionalidades administradorDeFuncionalidades = new AdministradorDeFuncionalidades(args);		
		String sortObtenido = administradorDeFuncionalidades.getSort();
		String outputObtenido = administradorDeFuncionalidades.getOutput();
		String path = outputObtenido.substring(14);
		
		DescomponedorEnFactores descomponedorEnFactores = new DescomponedorEnFactores();
		ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
		FactoresPrimosDAO factoresPrimosDAO = new FactoresPrimosDAO(path);
		List<Integer> listaDeFactoresPrimosObtenida = descomponedorEnFactores.descomponerEnFactoresPrimos(numeroAFactorizar);
		String impresionAPersistir = impresorEnFormatos.imprimirEnFormatoQuietSegunSort(listaDeFactoresPrimosObtenida, sortObtenido);
				
		factoresPrimosDAO.escribirFactorizacion(impresionAPersistir);
		String impresionLeida = factoresPrimosDAO.leerFactorizacion();
		
		Assert.assertEquals(impresionAPersistir, impresionLeida);		

	}

}
