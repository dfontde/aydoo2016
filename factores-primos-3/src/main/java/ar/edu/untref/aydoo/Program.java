package ar.edu.untref.aydoo;

import java.io.IOException;
import java.util.List;

public class Program{
    
	private static int numeroAFactorizar;
	private static String formatoImpresion;
	private static String sortImpresion;
	private static String pathImpresion;
	
	
	public static final void main(String[] args) throws IOException {

		getParametrosAplicacion(args);

		List<Integer> listaDeFactoresPrimos = getListaDeFactoresPrimos(numeroAFactorizar);
    	
    	String impresionResultante = getImpresionResultante(formatoImpresion, numeroAFactorizar, listaDeFactoresPrimos, sortImpresion);

    	if (pathImpresion == ""){
    		System.out.println(impresionResultante);
    	}else{
    		persistirEnArchivo(pathImpresion, impresionResultante);
    	}
    	
	}
	
	private static List<Integer> getListaDeFactoresPrimos(int numeroAFactorizar) {
    	
		DescomponedorEnFactores descomponedorEnFactores = new DescomponedorEnFactores();
    	List<Integer> listaDeFactoresPrimos = descomponedorEnFactores.descomponerEnFactoresPrimos(numeroAFactorizar);
    	return listaDeFactoresPrimos;
	
	}
	
	private static void getParametrosAplicacion(String[] args) {
	
		IdentificadorDeOpciones identificadorDeOpciones = new IdentificadorDeOpciones(args);
		numeroAFactorizar = Integer.parseInt(args[0]);		
		formatoImpresion = identificadorDeOpciones.getFormat();
		sortImpresion = identificadorDeOpciones.getSort();
		pathImpresion = identificadorDeOpciones.getOutput();
		
	}
	
	private static String getImpresionResultante(String formatoImpresion, int numeroAFactorizar, List<Integer> listaDeFactoresPrimos, String sortImpresion) {

		ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
		String impresionResultante = impresorEnFormatos.getImpresionResultante(formatoImpresion, numeroAFactorizar, listaDeFactoresPrimos, sortImpresion);
		return impresionResultante;
		
	}	
	
	private static void persistirEnArchivo(String pathImpresion, String impresionAPersistir) throws IOException {

		int posicionPathReal = 14;
		String pathReal = pathImpresion.substring(posicionPathReal);
		FactoresPrimosDAO factoresPrimosDAO = new FactoresPrimosDAO(pathReal);	
		factoresPrimosDAO.escribirFactorizacion(impresionAPersistir);		
	
	}


  
}