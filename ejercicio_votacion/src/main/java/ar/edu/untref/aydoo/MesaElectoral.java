package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class MesaElectoral {

	private List<Voto> urna;
	private List<Candidato> listaDeCandidatos;
	private Provincia provincia;
	private List<Votante> padronDeLaMesa;

	/**
	 * La mesa electoral se crea considerando el voto en blanco como valido.
	 */
	public MesaElectoral(List<Candidato> candidatos, Provincia provincia, List<Votante> padronDeLaMesa){
		Candidato candidatoEnBlanco = new Candidato("", "",null);
		this.urna = new ArrayList<Voto>();
		this.listaDeCandidatos = candidatos;
		this.listaDeCandidatos.add(candidatoEnBlanco);
		this.setProvincia(provincia);
		this.padronDeLaMesa = padronDeLaMesa;
	}

	public List<Candidato> getListaDeCandidatos(){
		return this.listaDeCandidatos;
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
	
	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public void agregarVotanteAlPadronDeLaMesa(Votante votante){
		padronDeLaMesa.add(votante);
	}
	
	public List<Votante> getPadronDeLaMesa() {
		return padronDeLaMesa;
	}

	public void setPadronDeLaMesa(List<Votante> padronDeLaMesa) {
		this.padronDeLaMesa = padronDeLaMesa;
	}

	public boolean controlarVotanteEnPadron(Votante votante) {
				
		boolean encontrado = false;
		Iterator<Votante> itPadronDeLaMesa = padronDeLaMesa.iterator();
		while (itPadronDeLaMesa.hasNext() && !encontrado){
			if (votante.equals(itPadronDeLaMesa.next())){
				encontrado = true;
			}
		}
		
		return encontrado;		
	}	
	
}