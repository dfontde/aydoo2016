package ar.edu.untref.aydoo;

public class MaquinaExpendedoraDeBebidas {
	
	private HacedorDeCafeConLeche hacedorDeCafeConLeche;
	private HacedorDeTeConLeche hacedorDeTeConLeche;
	private Azucarero azucarero;
	
	public MaquinaExpendedoraDeBebidas(){
		hacedorDeCafeConLeche = new HacedorDeCafeConLeche();
		hacedorDeTeConLeche = new HacedorDeTeConLeche();
		azucarero = new Azucarero();
	}
	
	public Vaso hacerCafeConLecheConNDeAzucar(Vaso vaso, int cantidadAzucar){
	
		this.hacedorDeCafeConLeche.prepararEnEsteVaso(vaso);
		this.azucarero.ponerNEnEsteVaso(vaso, cantidadAzucar);
	
		return vaso;
	
	}
	
	public Vaso hacerTeConLecheConNDeAzucar(Vaso vaso, int cantidadAzucar){
		
		this.hacedorDeTeConLeche.prepararEnEsteVaso(vaso);
		this.azucarero.ponerNEnEsteVaso(vaso, cantidadAzucar);
	
		return vaso;
	
	}


}
