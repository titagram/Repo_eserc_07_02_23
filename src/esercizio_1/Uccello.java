package esercizio_1;

public class Uccello extends Animale{
	
	private String piume;
	private String verso;

	Uccello(){};
		
	Uccello (String specie, String razza, String nome, String habitat, String piume){
			super(specie, razza, nome, habitat);
			
			this.piume=piume;
			
		}
	
	@Override
	public String toString() {
	return "Specie: " + getSpecie() + " \nRazza: " + getRazza() + " \nNome: " + getNome() + " \nPiume: " + this.piume  + "\n\nSTATS: \n" +"Costituzione: " + getCostituzione() +"\nEnergia: "+ getEnergia() + "\nLivello: " + getLivello() + "\n \n" + getNome() + " fa: " + verso();
	}
	
	@Override
	public String verso() {
		return "cip cip motherfucker";
	}

}
