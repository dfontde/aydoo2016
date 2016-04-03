package ar.edu.untref.aydoo;

public class Candidato {

	private String nombre;
	private String apellido;
	private Partido partido;
	private Provincia provincia;
	
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
	
	public Partido getPartido() {
		return partido;
	}
	
	public void setPartido(Partido partido) {
		this.partido = partido;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

}
