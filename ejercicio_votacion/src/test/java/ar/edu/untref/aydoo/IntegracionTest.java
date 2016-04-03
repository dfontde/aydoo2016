package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class IntegracionTest {
	
	@Test
	public void elVotoEmitidoEsValido() {
		
		boolean esVotoValido = false;
		List<Candidato> candidatosPosibles = crearListaConCandidatosDePrueba();
		MesaElectoral mesaElectoral = new MesaElectoral(candidatosPosibles, Provincia.BUENOSAIRES);
		Votante votante = new Votante("Rosa", "Garcia", "DNI", "5000000");
		Candidato candidatoElegido = new Candidato("Pitrola", "Nestor", Partido.OBRERO);
		Voto votoElegido = new Voto(candidatoElegido);
		votante.setVotoElegido(votoElegido);
	
		esVotoValido = mesaElectoral.esVotoValido(votante.emitirVoto());
		
		Assert.assertTrue(esVotoValido);
		
	}

	@Test
	public void elVotoEmitidoEsValidoEnBlanco() {
		
		boolean esVotoValido = false;
		List<Candidato> candidatosPosibles = crearListaConCandidatosDePrueba();
		MesaElectoral mesaElectoral = new MesaElectoral(candidatosPosibles, Provincia.BUENOSAIRES);
		Votante votante = new Votante("Rosa", "Garcia", "DNI", "5000000");
		Candidato candidatoElegido = new Candidato("", "", null);
		Voto votoElegido = new Voto(candidatoElegido);
		votante.setVotoElegido(votoElegido);
	
		esVotoValido = mesaElectoral.esVotoValido(votante.emitirVoto());
		
		Assert.assertTrue(esVotoValido);
		
	}
	
	private List<Candidato> crearListaConCandidatosDePrueba(){
		
		List<Candidato> candidatos = new ArrayList<>(); 
		Candidato candidatoFPV1 = new Candidato("Scioli", "Daniel", Partido.FPV);
		candidatos.add(candidatoFPV1);
		Candidato candidatoFPV2 = new Candidato("Randazzo", "Florencio", Partido.FPV);
		candidatos.add(candidatoFPV2);
		Candidato candidatoCambiemos1 = new Candidato("Macri", "Mauricio", Partido.CAMBIEMOS);
		candidatos.add(candidatoCambiemos1);
		Candidato candidatoCambiemos2 = new Candidato("Sanz", "Eduardo", Partido.CAMBIEMOS);
		candidatos.add(candidatoCambiemos2);
		Candidato candidatoObrero1 = new Candidato("DelCanio", "Nicolas", Partido.OBRERO);
		candidatos.add(candidatoObrero1);
		Candidato candidatoObrero2 = new Candidato("Pitrola", "Nestor", Partido.OBRERO);
		candidatos.add(candidatoObrero2);		
		
		return candidatos;		
	}


}
