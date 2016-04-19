package ar.edu.untref.aydoo;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class IntegrationTest {

	private final String sortASC = "ASC";
	private final String sortDES = "DES";

	@Test 
	public void persistirEnArchivoEnDirectorioDelProyectoEnFormatoQuietAscendenteConElNumero360() throws IOException {
		
		int numeroAFactorizar = 360;
		String path = "salida.txt";
		DescomponedorEnFactores descomponedorEnFactores = new DescomponedorEnFactores();
		ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
		FactoresPrimosDAO factoresPrimosDAO = new FactoresPrimosDAO(path);
		List<Integer> listaDeFactoresPrimosObtenida = descomponedorEnFactores.descomponerEnFactoresPrimos(numeroAFactorizar);
		String impresionAPersistir = impresorEnFormatos.imprimirEnFormatoQuietSegunSort(listaDeFactoresPrimosObtenida, sortASC);
				
		factoresPrimosDAO.escribirFactorizacion(impresionAPersistir);
		String impresionLeida = factoresPrimosDAO.leerFactorizacion();
		
		Assert.assertEquals(impresionAPersistir, impresionLeida);		

	}
	

}
