package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class IntegracionTest {
	
	@Test
	public void elVotoEmitidoEsValido() {
		
		boolean esVotoValido = false;
		MesaElectoral mesaElectoral = new MesaElectoral(crearListaConCandidatosDePrueba(), Provincia.BUENOSAIRES, crearListaConVotantesDePrueba());
		Votante votante = new Votante("Rosa", "Garcia", "DNI", "5000000");
		Candidato candidatoElegido = new Candidato("Pitrola", "Nestor", Partido.OBRERO);
		Voto votoElegido = new Voto(candidatoElegido);
		votante.setVotoElegido(votoElegido);
	
		esVotoValido = mesaElectoral.esVotoValido(votante.emitirVoto());
		
		Assert.assertTrue(esVotoValido);
		
	}

	@Test
	public void elVotoEmitidoNoEsValidoPorCandidatoInexistente() {
		
		boolean esVotoValido = true;
		MesaElectoral mesaElectoral = new MesaElectoral(crearListaConCandidatosDePrueba(), Provincia.BUENOSAIRES, crearListaConVotantesDePrueba());
		Votante votante = new Votante("Rosa", "Garcia", "DNI", "5000000");
		Candidato candidatoElegido = new Candidato("Carrio", "Elisa", Partido.CAMBIEMOS);
		Voto votoElegido = new Voto(candidatoElegido);
		votante.setVotoElegido(votoElegido);
	
		esVotoValido = mesaElectoral.esVotoValido(votante.emitirVoto());
		
		Assert.assertFalse(esVotoValido);
		
	}
	
	@Test
	public void elVotoEmitidoEsValidoEnBlanco() {
		
		boolean esVotoValido = false;
		MesaElectoral mesaElectoral = new MesaElectoral(crearListaConCandidatosDePrueba(), Provincia.BUENOSAIRES, crearListaConVotantesDePrueba());
		Votante votante = new Votante("Rosa", "Garcia", "DNI", "5000000");
		Candidato candidatoElegido = new Candidato("", "", null);
		Voto votoElegido = new Voto(candidatoElegido);
		votante.setVotoElegido(votoElegido);
	
		esVotoValido = mesaElectoral.esVotoValido(votante.emitirVoto());
		
		Assert.assertTrue(esVotoValido);
		
	}
	
	@Test
	public void elVotantePerteneceAlPadronDeLaMesa(){
		
		boolean perteneceAlPadronDeLaMesa = false;
		MesaElectoral mesaElectoral = new MesaElectoral(crearListaConCandidatosDePrueba(), Provincia.BUENOSAIRES, crearListaConVotantesDePrueba());
		Votante votante = new Votante("Rosa", "Garcia", "DNI", "5000000");
	
		perteneceAlPadronDeLaMesa = mesaElectoral.controlarVotanteEnPadron(votante);
		
		Assert.assertTrue(perteneceAlPadronDeLaMesa);		
		
	}
	
	@Test
	public void elVotanteNoPerteneceAlPadronDeLaMesa(){
		
		boolean perteneceAlPadronDeLaMesa = true;
		MesaElectoral mesaElectoral = new MesaElectoral(crearListaConCandidatosDePrueba(), Provincia.BUENOSAIRES, crearListaConVotantesDePrueba());
		Votante votante = new Votante("Hector", "Felice", "DNI", "2345765");
	
		perteneceAlPadronDeLaMesa = mesaElectoral.controlarVotanteEnPadron(votante);
		
		Assert.assertFalse(perteneceAlPadronDeLaMesa);		
		
	}


	@Test
	public void elCandidatoMasVotadoDeLaMesaEsScioli(){
		
		MesaElectoral mesaElectoral = new MesaElectoral(crearListaConCandidatosDePrueba(), Provincia.BUENOSAIRES, crearListaConVotantesDePrueba());
		List<Votante> padronDeLaMesa = mesaElectoral.getPadronDeLaMesa();
		Candidato candidatoScioli = new Candidato("Scioli", "Daniel", Partido.FPV);
		Voto votoScioli = new Voto(candidatoScioli);
		Iterator<Votante> itVotantes = padronDeLaMesa.iterator();
		Votante votanteActual;
		while (itVotantes.hasNext()){
			votanteActual = itVotantes.next(); 
			votanteActual.setVotoElegido(votoScioli);
			mesaElectoral.recibirVoto(votanteActual);
		}
		
		Candidato candidatoMasVotadoObtenido = mesaElectoral.getCandidatoMasVotado();
			
		Assert.assertEquals(candidatoScioli, candidatoMasVotadoObtenido);		
		
	}	
	
	@Test
	public void elCandidatoMasVotadoDeLaMesaNoEsSanz(){
		
		MesaElectoral mesaElectoral = new MesaElectoral(crearListaConCandidatosDePrueba(), Provincia.BUENOSAIRES, crearListaConVotantesDePrueba());
		List<Votante> padronDeLaMesa = mesaElectoral.getPadronDeLaMesa();
		Candidato candidatoScioli = new Candidato("Sanz", "Eduardo", Partido.CAMBIEMOS);
		Voto votoScioli = new Voto(candidatoScioli);
		Iterator<Votante> itVotantes = padronDeLaMesa.iterator();
		Votante votanteActual;
		while (itVotantes.hasNext()){
			votanteActual = itVotantes.next(); 
			votanteActual.setVotoElegido(votoScioli);
			mesaElectoral.recibirVoto(votanteActual);
		}
		
		Candidato candidatoMasVotadoObtenido = mesaElectoral.getCandidatoMasVotado();
			
		Assert.assertEquals(candidatoScioli, candidatoMasVotadoObtenido);		
		
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
	
	private List<Votante> crearListaConVotantesDePrueba() {
		
		List<Votante> padronDeLaMesa = new ArrayList<>();
		Votante votante1 = new Votante("Rosa", "Garcia", "DNI", "5000000");
		padronDeLaMesa.add(votante1);
		Votante votante2 = new Votante("Jose", "Lopez", "DNI", "31000000");
		padronDeLaMesa.add(votante2);
		Votante votante3 = new Votante("Mateo", "Gomez", "DNI", "32000000");
		padronDeLaMesa.add(votante3);
		Votante votante4 = new Votante("Lucas", "Garcia", "DNI", "33000000");
		padronDeLaMesa.add(votante4);
		Votante votante5 = new Votante("Gabriel", "Suarez", "DNI", "34000000");
		padronDeLaMesa.add(votante5);

		return padronDeLaMesa;
	}
	
	
}