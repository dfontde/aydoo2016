package ar.edu.untref.aydoo;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ImpresorEnFormatos {


	public String getImpresionResultante(String formatoImpresion, int numeroAFactorizar, List<Integer> listaDeFactoresPrimos, String sortImpresion) {

		String impresionResultante = "";
		
		switch (formatoImpresion.toUpperCase()) {
	        case "":
	        	impresionResultante = imprimirEnFormatoPrettySegunSort(numeroAFactorizar, listaDeFactoresPrimos, sortImpresion);
	        	break;
	    	case "--FORMAT=PRETTY":
	    		impresionResultante = imprimirEnFormatoPrettySegunSort(numeroAFactorizar, listaDeFactoresPrimos, sortImpresion);
	        	break;
	        case "--FORMAT=QUIET":
	        	impresionResultante = imprimirEnFormatoQuietSegunSort(listaDeFactoresPrimos, sortImpresion);
	        	break;
	        default:
	        	impresionResultante = "Formato no aceptado. Las opciones posibles son: pretty o quiet.";
	    		break;
        }    			
	
		return impresionResultante;
		
	}
	
	private String imprimirEnFormatoQuietSegunSort(List<Integer> listaDeFactoresPrimos, String sort) {

		String impresionFormatoQuiet = "";

		ordenarLista(listaDeFactoresPrimos, sort);
		Iterator<Integer> itListaFactores = listaDeFactoresPrimos.iterator();
		while (itListaFactores.hasNext()) {
			impresionFormatoQuiet = impresionFormatoQuiet + Integer.toString(itListaFactores.next()) + "\n";
		}

		return impresionFormatoQuiet;
	}

	 private String imprimirEnFormatoPrettySegunSort(int numeroAFactorizar, List<Integer> listaDeFactoresPrimos, String sort){
			
		 String impresionFormatoPretty = "Factores primos " + Integer.toString(numeroAFactorizar) + ": ";
	
		 ordenarLista(listaDeFactoresPrimos, sort);
		 Iterator<Integer> itListaFactores = listaDeFactoresPrimos.iterator();
		 while(itListaFactores.hasNext()){
			 impresionFormatoPretty = impresionFormatoPretty +
			 Integer.toString(itListaFactores.next()) + ' ';
		 }
		
		 return impresionFormatoPretty;
	 }
	
	private List<Integer> ordenarLista(List<Integer> listaDeFactoresPrimos, String sort) {

		switch (sort.toUpperCase()) {
		case "--SORT:ASC":
			Collections.sort(listaDeFactoresPrimos);
			break;
		case "--SORT:DES":
			Comparator<Integer> comparador = Collections.reverseOrder();
			Collections.sort(listaDeFactoresPrimos, comparador);
			break;
		default:
			Collections.sort(listaDeFactoresPrimos);
			break;
		}

		return listaDeFactoresPrimos;
	}

}
