package ar.edu.untref.aydoo;

public class FactoresPrimos {

	public String descomponerEnFactoresPrimos(int numeroAFactorizar){
		//Comentario
		String factorizacion = "";
		
		int factor = 2;
		while (factor <= numeroAFactorizar){
			if((numeroAFactorizar % factor) == 0){
				factorizacion = factorizacion + Integer.toString(factor) + " "; 
				numeroAFactorizar = numeroAFactorizar/factor;
			}
			else{
				factor++;
			}     
			
		}		
		return factorizacion;	
	}
}
