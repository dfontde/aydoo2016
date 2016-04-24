package ar.edu.untref.aydoo;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

import ar.edu.untref.aydoo.Periodico;
import ar.edu.untref.aydoo.alquilerLibro.AlquilerLibroDiarioException;
import ar.edu.untref.aydoo.alquilerLibro.AlquilerLibroExcepcion;

public class PeriodicoTest {

	Periodico nuevoPeriodico;

	@Before
	public void inicializar(){
		nuevoPeriodico = new Periodico("Diario Popular", 10.0, 30, false);
	}

	@Test
	public void comprobarPrecioMensual() throws AlquilerLibroExcepcion{
		Assert.assertEquals(300.0, nuevoPeriodico.obtenerPrecioDelProducto(),0);
	}

	@Test
	public void comprobarPeriodicidadDelDiarioEnUnMes(){
		Assert.assertEquals(30, nuevoPeriodico.obtenerperiodicidadDelPeriodico(),0);
	}
}
