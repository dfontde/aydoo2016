package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class MesaElectoral {

	private List<Voto> urna;
	private List<Candidato> listaDeCandidatos;
	private Provincia provincia;

	/**
	 * La mesa electoral se crea considerando el voto en blanco como valido.
	 */
	
	public MesaElectoral(List<Candidato> candidatos, Provincia provincia){
		Candidato candidatoEnBlanco = new Candidato("", "",null);
		this.urna = new ArrayList<Voto>();
		this.listaDeCandidatos = candidatos;
		this.listaDeCandidatos.add(candidatoEnBlanco);
		this.provincia = provincia;
	}

	public void recibirVoto(Votante votante){
		urna.add(votante.emitirVoto());
	}
	
	public HashMap<Candidato, Integer> getCandidatoMasVotado(){
		return null;
	}
	
	public HashMap<Candidato, Integer> getPartidoMasVotadoPorProvincia(Provincia provincia){
		return null;
	}

	/**
	 * Un voto es considerado valido si el candidato forma parte de la lista de candidatos de la mesa. 
	 */
	public boolean esVotoValido(Voto voto) {
		
		boolean encontrado = false;
		Iterator<Candidato> itCandidatos = listaDeCandidatos.iterator();
		while (itCandidatos.hasNext() && !encontrado){
			if (voto.getCandidato().equals(itCandidatos.next())){
				encontrado = true;
			}
		}
		
		return encontrado;
	}	
	
}
