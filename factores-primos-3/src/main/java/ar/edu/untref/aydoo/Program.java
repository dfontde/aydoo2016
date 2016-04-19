package ar.edu.untref.aydoo;

import java.io.IOException;
import java.util.List;

public class Program{
    
	public static final void main(String[] args) throws IOException{
    	
		int numeroAFactorizar = Integer.parseInt(args[0]);;
		AdministradorDeFuncionalidades administradorDeFuncionalidades = new AdministradorDeFuncionalidades(args);
		String formatoImpresion = administradorDeFuncionalidades.getFormat();
		String sortImpresion = administradorDeFuncionalidades.getSort();
    	String pathImpresion = administradorDeFuncionalidades.getOutput();
    	
    	String impresionResultante = "";
        	
    	DescomponedorEnFactores descomponedorEnFactores = new DescomponedorEnFactores();
    	ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
    	FactoresPrimosDAO factoresPrimosDAO = new FactoresPrimosDAO(pathImpresion);
    	
    	List<Integer> listaDeFactoresPrimos = descomponedorEnFactores.descomponerEnFactoresPrimos(numeroAFactorizar);
    	
    	switch (formatoImpresion.toUpperCase()) {
	        case "":
	        	impresionResultante = impresorEnFormatos.imprimirEnFormatoPrettySegunSort(numeroAFactorizar, listaDeFactoresPrimos, sortImpresion);
	        	break;
	    	case "--FORMAT=PRETTY":
	    		impresionResultante = impresorEnFormatos.imprimirEnFormatoPrettySegunSort(numeroAFactorizar, listaDeFactoresPrimos, sortImpresion);
	        	break;
	        case "--FORMAT=QUIET":
	        	impresionResultante = impresorEnFormatos.imprimirEnFormatoQuietSegunSort(listaDeFactoresPrimos, sortImpresion);
	        	break;
	        default:
	        	impresionResultante = "Formato no aceptado. Las opciones posibles son: pretty o quiet.";
	    		break;
        }    	
    	
    	if (pathImpresion != ""){
    		factoresPrimosDAO.escribirFactorizacion(impresionResultante);
    	}else{
    		System.out.println(impresionResultante);
    	}
    		
    	
	}

}