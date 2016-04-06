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
		MesaElectoral mesaElectoral = new MesaElectoral(crearListaConCandidatosDePrueba(), Provincia.BUENOSAIRES, crearListaConVotantesDePruebaBuenosAires());
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
		MesaElectoral mesaElectoral = new MesaElectoral(crearListaConCandidatosDePrueba(), Provincia.BUENOSAIRES, crearListaConVotantesDePruebaBuenosAires());
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
		MesaElectoral mesaElectoral = new MesaElectoral(crearListaConCandidatosDePrueba(), Provincia.BUENOSAIRES, crearListaConVotantesDePruebaBuenosAires());
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
		MesaElectoral mesaElectoral = new MesaElectoral(crearListaConCandidatosDePrueba(), Provincia.BUENOSAIRES, crearListaConVotantesDePruebaBuenosAires());
		Votante votante = new Votante("Rosa", "Garcia", "DNI", "5000000");
	
		perteneceAlPadronDeLaMesa = mesaElectoral.controlarVotanteEnPadron(votante);
		
		Assert.assertTrue(perteneceAlPadronDeLaMesa);		
		
	}
	
	@Test
	public void elVotanteNoPerteneceAlPadronDeLaMesa(){
		
		boolean perteneceAlPadronDeLaMesa = true;
		MesaElectoral mesaElectoral = new MesaElectoral(crearListaConCandidatosDePrueba(), Provincia.BUENOSAIRES, crearListaConVotantesDePruebaBuenosAires());
		Votante votante = new Votante("Hector", "Felice", "DNI", "2345765");
	
		perteneceAlPadronDeLaMesa = mesaElectoral.controlarVotanteEnPadron(votante);
		
		Assert.assertFalse(perteneceAlPadronDeLaMesa);		
		
	}


	@Test
	public void elCandidatoMasVotadoDeLaMesaEsScioli(){
		
		MesaElectoral mesaElectoral = new MesaElectoral(crearListaConCandidatosDePrueba(), Provincia.BUENOSAIRES, crearListaConVotantesDePruebaBuenosAires());
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
	public void elCandidatoMasVotadoANivelNacionalEsMacri(){
		
		CentroDeComputos centroDeComputos = new CentroDeComputos();
		MesaElectoral mesaElectoralBuenosAires = crearMesaElectoralConVotosScioliBuenosAires();
		MesaElectoral mesaElectoralCABA = crearMesaElectoralConVotosMacriCABA();		
		Candidato candidatoMacri = new Candidato("Mauricio", "Macri", Partido.CAMBIEMOS);
		centroDeComputos.setMesaElectoral(mesaElectoralBuenosAires);
		centroDeComputos.setMesaElectoral(mesaElectoralCABA);
		
		Candidato candidatoMasVotadoObtenido = centroDeComputos.getCandidatoMasVotadoANivelNacional();
			
		Assert.assertTrue(candidatoMacri.equals(candidatoMasVotadoObtenido));		
		
	}
	
	@Test
	public void elPartidoMasVotadoEnBuenosAiresEsFPV(){
		
		CentroDeComputos centroDeComputos = new CentroDeComputos();
		MesaElectoral mesaElectoralBuenosAires = crearMesaElectoralConVotosScioliBuenosAires();
		MesaElectoral mesaElectoralCABA = crearMesaElectoralConVotosMacriCABA();		
		centroDeComputos.setMesaElectoral(mesaElectoralBuenosAires);
		centroDeComputos.setMesaElectoral(mesaElectoralCABA);
		
		Partido partidoMasVotadoObtenido = centroDeComputos.getPartidoMasVotadoPorProvincia(Provincia.BUENOSAIRES);
			
		Assert.assertEquals(Partido.FPV, partidoMasVotadoObtenido);		
		
	}	
	
	@Test
	public void elPartidoMasVotadoEnBuenosAiresEsCambiemos(){
		
		CentroDeComputos centroDeComputos = new CentroDeComputos();
		MesaElectoral mesaElectoralBuenosAires = crearMesaElectoralConVotosScioliBuenosAires();
		MesaElectoral mesaElectoralCABA = crearMesaElectoralConVotosMacriCABA();
		MesaElectoral mesaElectoralBuenosAires2 = crearMesaElectoralConVotosMacriBuenosAires();
		centroDeComputos.setMesaElectoral(mesaElectoralBuenosAires);
		centroDeComputos.setMesaElectoral(mesaElectoralCABA);
		centroDeComputos.setMesaElectoral(mesaElectoralBuenosAires2);
		
		Partido partidoMasVotadoObtenido = centroDeComputos.getPartidoMasVotadoPorProvincia(Provincia.BUENOSAIRES);
			
		Assert.assertEquals(Partido.CAMBIEMOS, partidoMasVotadoObtenido);		
		
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
	
	private List<Votante> crearListaConVotantesDePruebaBuenosAires() {
		
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

	private List<Votante> crearListaConVotantesDePruebaBuenosAires2() {
		
		List<Votante> padronDeLaMesa = new ArrayList<>();
		Votante votante1 = new Votante("Maria", "Jimenez", "LE", "15000000");
		padronDeLaMesa.add(votante1);
		Votante votante2 = new Votante("Matias", "Tortorella", "LC", "45000000");
		padronDeLaMesa.add(votante2);
		Votante votante3 = new Votante("Pablo", "Renos", "DNI", "32450000");
		padronDeLaMesa.add(votante3);
		Votante votante4 = new Votante("Gabriel", "Fenos", "DNI", "33000123");
		padronDeLaMesa.add(votante4);
		Votante votante5 = new Votante("Ariel", "Larralde", "DNI", "28780000");
		padronDeLaMesa.add(votante5);
		Votante votante6 = new Votante("Nicolas", "Gutierrez", "DNI", "30001200");
		padronDeLaMesa.add(votante6);
		
		return padronDeLaMesa;
	}	
	
	private List<Votante> crearListaConVotantesDePruebaCABA() {
		
		List<Votante> padronDeLaMesa = new ArrayList<>();
		Votante votante1 = new Votante("Juan Ignacio", "Araguren", "DNI", "2900000");
		padronDeLaMesa.add(votante1);
		Votante votante2 = new Votante("Jose", "Lopez Vazquez", "DNI", "24000000");
		padronDeLaMesa.add(votante2);
		Votante votante3 = new Votante("Mateo", "Uriburu", "DNI", "22000000");
		padronDeLaMesa.add(votante3);
		Votante votante4 = new Votante("Pedro", "Amenabar", "DNI", "20000000");
		padronDeLaMesa.add(votante4);
		Votante votante5 = new Votante("Gabriel", "Marquez", "DNI", "18000000");
		padronDeLaMesa.add(votante5);
		Votante votante6 = new Votante("Magdalena", "Guizasu", "DNI", "36000000");
		padronDeLaMesa.add(votante6);
		Votante votante7 = new Votante("Gabriela", "Mistrali", "DNI", "38000770");
		padronDeLaMesa.add(votante7);
		
		return padronDeLaMesa;
	}	

	private MesaElectoral crearMesaElectoralConVotosScioliBuenosAires(){ 
	
		MesaElectoral mesaElectoralBuenosAires = new MesaElectoral(crearListaConCandidatosDePrueba(), Provincia.BUENOSAIRES, crearListaConVotantesDePruebaBuenosAires());
		List<Votante> padronDeLaMesaBuenosAires = mesaElectoralBuenosAires.getPadronDeLaMesa();
		Candidato candidatoScioli = new Candidato("Daniel", "Scioli", Partido.FPV);
		Voto votoScioli = new Voto(candidatoScioli);
		Iterator<Votante> itVotantesBuenosAires = padronDeLaMesaBuenosAires.iterator();
		Votante votanteActualBuenosAires;
		while (itVotantesBuenosAires.hasNext()){
			votanteActualBuenosAires = itVotantesBuenosAires.next(); 
			votanteActualBuenosAires.setVotoElegido(votoScioli);
			mesaElectoralBuenosAires.recibirVoto(votanteActualBuenosAires);
		}
		
		return mesaElectoralBuenosAires;
	
	}
	
	private MesaElectoral crearMesaElectoralConVotosMacriCABA(){ 
		
		MesaElectoral mesaElectoralCABA = new MesaElectoral(crearListaConCandidatosDePrueba(), Provincia.CABA, crearListaConVotantesDePruebaCABA());
		List<Votante> padronDeLaMesaCABA = mesaElectoralCABA.getPadronDeLaMesa();
		Candidato candidatoMacri = new Candidato("Mauricio", "Macri", Partido.CAMBIEMOS);
		Voto votoMacri = new Voto(candidatoMacri);
		Iterator<Votante> itVotantesCABA = padronDeLaMesaCABA.iterator();
		Votante votanteActualCABA;
		while (itVotantesCABA.hasNext()){
			votanteActualCABA = itVotantesCABA.next(); 
			votanteActualCABA.setVotoElegido(votoMacri);
			mesaElectoralCABA.recibirVoto(votanteActualCABA);
		}

		return mesaElectoralCABA;
		
	}

	private MesaElectoral crearMesaElectoralConVotosMacriBuenosAires(){ 
		
		MesaElectoral mesaElectoralBuenosAires = new MesaElectoral(crearListaConCandidatosDePrueba(), Provincia.BUENOSAIRES, crearListaConVotantesDePruebaBuenosAires2());
		List<Votante> padronDeLaMesaBuenosAires = mesaElectoralBuenosAires.getPadronDeLaMesa();
		Candidato candidatoMacri = new Candidato("Mauricio", "Macri", Partido.CAMBIEMOS);
		Voto votoMacri = new Voto(candidatoMacri);
		Iterator<Votante> itVotantesBuenosAires = padronDeLaMesaBuenosAires.iterator();
		Votante votanteActualBuenosAires;
		while (itVotantesBuenosAires.hasNext()){
			votanteActualBuenosAires = itVotantesBuenosAires.next(); 
			votanteActualBuenosAires.setVotoElegido(votoMacri);
			mesaElectoralBuenosAires.recibirVoto(votanteActualBuenosAires);
		}

		return mesaElectoralBuenosAires;
		
	}	
	

	
}