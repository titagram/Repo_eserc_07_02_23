package esercizio_1;

public class Gatto extends Animale {
	
	private String pelo;
	private String verso;
	
	
	Gatto(){};
	
	Gatto (String specie, String razza, String nome, String habitat, String pelo){
		super(specie, razza, nome, habitat);
		
		this.pelo=pelo;
		
	}
	
	@Override
	public String toString() {
	return "Specie: " + getSpecie() + " \nRazza: " + getRazza() + " \nNome: " + getNome() + " \nPelo: " + this.pelo  + "\n\nSTATS: \n" +"Costituzione: " + getCostituzione() +"\nEnergia: "+ getEnergia() + "\nLivello: " + getLivello() + "\n \n" + getNome() + " fa: " + this.verso;
	}
	
	@Override
	public String verso() {
		return "miao miao motherfucker";
	}
	
}
