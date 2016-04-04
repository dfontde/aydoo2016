package ar.edu.untref.aydoo;

public class Votante {

	private String nombre;
	private String apellido;
	private String tipoDoc;
	private String nroDoc;
	private Voto votoElegido;
	
	public Votante(String nombre, String apellido, String tipoDoc, String nroDoc){
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipoDoc = tipoDoc;
		this.nroDoc = nroDoc;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getNroDoc() {
		return nroDoc;
	}
	
	public void setNroDoc(String nroDoc) {
		this.nroDoc = nroDoc;
	}
	
	public String getTipoDoc() {
		return tipoDoc;
	}
	
	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}
	
	public Voto emitirVoto() {
		return votoElegido;
	}

	public void setVotoElegido(Voto votoElegido) {
		this.votoElegido = votoElegido;
	}
	
	public boolean equals(Votante votante){
		return (this.tipoDoc == votante.tipoDoc && 
				this.nroDoc == votante.nroDoc);		
	}
	
}
