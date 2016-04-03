package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class CentroDeComputosTest {
	
	
	@Test
	public void obtenerCandidatoGanadorANivelNacionalDelPartidoObrero(){
		
		CentroDeComputos centroDeComputos = new CentroDeComputos();
		Partido partidoObrero = new Partido();
		Candidato candidatoGanadorEsperado = new Candidato();
		candidatoGanadorEsperado.setNombre("Nicolas");
		candidatoGanadorEsperado.setApellido("Del Canio");
		Candidato candidatoGanadorObtenido = new Candidato();
		
		candidatoGanadorObtenido = centroDeComputos.obtenerCandidatoGanadorDelPartido(partidoObrero);
		
		Assert.assertEquals(candidatoGanadorEsperado, candidatoGanadorObtenido);
		
	}

}
