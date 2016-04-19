package ar.edu.untref.aydoo;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class FactoresPrimosDAOTest {

	@Test
	public void persistirEnArchivoEnDirectorioDelProyecto() throws IOException {
		
		String impresionEsperada = "Factores primos 90: 2 2 2 3 3 5 ";
		String path = "salida.txt";
		FactoresPrimosDAO persistidorEnArchivo = new FactoresPrimosDAO(path);
		persistidorEnArchivo.escribirFactorizacion(impresionEsperada);
		
		String impresionObtenida = persistidorEnArchivo.leerFactorizacion();
		
		Assert.assertEquals(impresionEsperada, impresionObtenida);
	
	}

//	@Test
//	public void persistirEnArchivoEnVariasLineasEnDirectorioDelProyecto() throws IOException {
//		
//		String impresionEsperada = "2\n2\n2\n3\n3\n5\n";
//		String path = "salida.txt";
//		PersistidorEnArchivo persistidorEnArchivo = new PersistidorEnArchivo(path);
//		persistidorEnArchivo.escribirFactorizacion(impresionEsperada);
//		
//		String impresionObtenida = persistidorEnArchivo.leerFactorizacion();
//		
//		Assert.assertEquals(impresionEsperada, impresionObtenida);
//	
//	}
	
//	@Test
//	public void persistirEnArchivoEnUnPathDefinido() throws IOException {
//		
//		String impresionEsperada = "Factores primos 90: 2 2 2 3 3 5 ";
//		String path = "/home/lucas/aydoo2016/factores-primos-3/archivosSalida/salida.txt";
//		
//		PersistidorEnArchivo persistidorEnArchivo = new PersistidorEnArchivo(path);
//		persistidorEnArchivo.escribirFactorizacion(impresionEsperada);
//		
//		String impresionObtenida = persistidorEnArchivo.leerFactorizacion();
//		
//		Assert.assertEquals(impresionEsperada, impresionObtenida);
//	
//	}

}
