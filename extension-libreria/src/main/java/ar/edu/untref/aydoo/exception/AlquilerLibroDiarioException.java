package ar.edu.untref.aydoo.exception;

public class AlquilerLibroDiarioException extends AlquilerLibroExcepcion {

	private static final long serialVersionUID = 1L;
	private final static String mensaje = "El periodo de alquiler es entre 3 y 25 dias.";

	public AlquilerLibroDiarioException() {
		super(mensaje);
	}

}
