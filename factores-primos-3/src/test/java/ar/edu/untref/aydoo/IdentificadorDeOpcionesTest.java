package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class IdentificadorDeOpcionesTest {

	@Test
	public void obtenerFuncionalidadesDesdeArrayDeArgumentos() {
		
		String numeroAFactorizarEsperado = "360";
		String formatoEsperado = "--FORMAT=PRETTY";
		String sortEsperado = "--SORT:ASC";
		String outputEsperado = "--OUTPUT-FILE:ARCHIVOSALIDA.TXT";
		
		String[] args = {numeroAFactorizarEsperado, formatoEsperado, sortEsperado, outputEsperado};
		IdentificadorDeOpciones administradorDeFuncionalidades = new IdentificadorDeOpciones(args);
		
		String numeroAFactorizarObtenido = administradorDeFuncionalidades.getNumeroAFactorizar();
		String formatObtenido = administradorDeFuncionalidades.getFormat();
		String sortObtenido = administradorDeFuncionalidades.getSort();
		String outputObtenido = administradorDeFuncionalidades.getOutput();
		
		Assert.assertEquals(numeroAFactorizarEsperado, numeroAFactorizarObtenido);
		Assert.assertEquals(formatoEsperado, formatObtenido);
		Assert.assertEquals(sortEsperado, sortObtenido);
		Assert.assertEquals(outputEsperado, outputObtenido);
		
	}

	@Test
	public void obtenerFuncionalidadesDesdeArrayDeArgumentosEnDistintoOrden1() {
		
		String numeroAFactorizarEsperado = "360";
		String formatoEsperado = "--FORMAT=PRETTY";
		String sortEsperado = "--SORT:ASC";
		String outputEsperado = "--OUTPUT-FILE:ARCHIVOSALIDA.TXT";
		
		String[] args = {numeroAFactorizarEsperado, sortEsperado, outputEsperado, formatoEsperado};
		IdentificadorDeOpciones administradorDeFuncionalidades = new IdentificadorDeOpciones(args);
		
		String numeroAFactorizarObtenido = administradorDeFuncionalidades.getNumeroAFactorizar();
		String formatObtenido = administradorDeFuncionalidades.getFormat();
		String sortObtenido = administradorDeFuncionalidades.getSort();
		String outputObtenido = administradorDeFuncionalidades.getOutput();
		
		Assert.assertEquals(numeroAFactorizarEsperado, numeroAFactorizarObtenido);
		Assert.assertEquals(formatoEsperado, formatObtenido);
		Assert.assertEquals(sortEsperado, sortObtenido);
		Assert.assertEquals(outputEsperado, outputObtenido);
		
	}

	@Test
	public void obtenerFuncionalidadesDesdeArrayDeArgumentosEnDistintoOrden2() {
		
		String numeroAFactorizarEsperado = "360";
		String formatoEsperado = "--FORMAT=PRETTY";
		String sortEsperado = "--SORT:ASC";
		String outputEsperado = "--OUTPUT-FILE:ARCHIVOSALIDA.TXT";
		
		String[] args = {"360", outputEsperado, sortEsperado, formatoEsperado};
		IdentificadorDeOpciones administradorDeFuncionalidades = new IdentificadorDeOpciones(args);
		
		String numeroAFactorizarObtenido = administradorDeFuncionalidades.getNumeroAFactorizar();
		String formatObtenido = administradorDeFuncionalidades.getFormat();
		String sortObtenido = administradorDeFuncionalidades.getSort();
		String outputObtenido = administradorDeFuncionalidades.getOutput();
		
		Assert.assertEquals(numeroAFactorizarEsperado, numeroAFactorizarObtenido);
		Assert.assertEquals(formatoEsperado, formatObtenido);
		Assert.assertEquals(sortEsperado, sortObtenido);
		Assert.assertEquals(outputEsperado, outputObtenido);
		
	}

	@Test
	public void obtenerFuncionalidadesDesdeArrayDeArgumentosSinOutput() {
		
		String numeroAFactorizarEsperado = "360";
		String formatoEsperado = "--FORMAT=PRETTY";
		String sortEsperado = "--SORT:ASC";
		String outputEsperado = "";
		
		String[] args = {"360", sortEsperado, formatoEsperado};
		IdentificadorDeOpciones administradorDeFuncionalidades = new IdentificadorDeOpciones(args);
		
		String numeroAFactorizarObtenido = administradorDeFuncionalidades.getNumeroAFactorizar();
		String formatObtenido = administradorDeFuncionalidades.getFormat();
		String sortObtenido = administradorDeFuncionalidades.getSort();
		String outputObtenido = administradorDeFuncionalidades.getOutput();
		
		Assert.assertEquals(numeroAFactorizarEsperado, numeroAFactorizarObtenido);
		Assert.assertEquals(formatoEsperado, formatObtenido);
		Assert.assertEquals(sortEsperado, sortObtenido);
		Assert.assertEquals(outputEsperado, outputObtenido);
		
	}

	@Test
	public void obtenerFuncionalidadesDesdeArrayDeArgumentosSinSort() {
		
		String numeroAFactorizarEsperado = "360";
		String formatoEsperado = "--FORMAT=PRETTY";
		String sortEsperado = "";
		String outputEsperado = "--OUTPUT-FILE:ARCHIVOSALIDA.TXT";
		
		String[] args = {"360", outputEsperado, formatoEsperado};
		IdentificadorDeOpciones administradorDeFuncionalidades = new IdentificadorDeOpciones(args);
		
		String numeroAFactorizarObtenido = administradorDeFuncionalidades.getNumeroAFactorizar();
		String formatObtenido = administradorDeFuncionalidades.getFormat();
		String sortObtenido = administradorDeFuncionalidades.getSort();
		String outputObtenido = administradorDeFuncionalidades.getOutput();
		
		Assert.assertEquals(numeroAFactorizarEsperado, numeroAFactorizarObtenido);
		Assert.assertEquals(formatoEsperado, formatObtenido);
		Assert.assertEquals(sortEsperado, sortObtenido);
		Assert.assertEquals(outputEsperado, outputObtenido);
		
	}

	@Test
	public void obtenerFuncionalidadesDesdeArrayDeArgumentosSinFormat() {
		
		String numeroAFactorizarEsperado = "360";
		String formatoEsperado = "";
		String sortEsperado = "--SORT:ASC";
		String outputEsperado = "--OUTPUT-FILE:ARCHIVOSALIDA.TXT";
		
		String[] args = {"360", outputEsperado, sortEsperado};
		IdentificadorDeOpciones administradorDeFuncionalidades = new IdentificadorDeOpciones(args);
		
		String numeroAFactorizarObtenido = administradorDeFuncionalidades.getNumeroAFactorizar();
		String formatObtenido = administradorDeFuncionalidades.getFormat();
		String sortObtenido = administradorDeFuncionalidades.getSort();
		String outputObtenido = administradorDeFuncionalidades.getOutput();
		
		Assert.assertEquals(numeroAFactorizarEsperado, numeroAFactorizarObtenido);
		Assert.assertEquals(formatoEsperado, formatObtenido);
		Assert.assertEquals(sortEsperado, sortObtenido);
		Assert.assertEquals(outputEsperado, outputObtenido);
		
	}

}
