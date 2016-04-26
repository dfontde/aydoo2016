package ar.edu.untref.aydoo.exception;

public class AlquilerLibroMensualException extends AlquilerLibroException {

	private static final long serialVersionUID = 1L;
	private final static String mensaje = "El periodo de alquiler es entre 1 y 3 meses.";

	public AlquilerLibroMensualException() {
		super(mensaje);
	}
	
}
