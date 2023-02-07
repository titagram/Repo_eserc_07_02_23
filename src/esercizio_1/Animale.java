package esercizio_1;

public class Animale {
	//att
	private String specie;
	private String razza;
	private String nome;
	private String habitat;
	private String verso;
	
	private int costituzione =100; //cibo
	private int energia =100; //sonno
	private int livello =100; //cresce
	
	
	Animale() {};
	
	Animale(String specie, String razza, String nome, String habitat) {
		this.specie = specie;
		this.razza = razza;
		this.nome = nome;
		this.habitat = habitat;
		this.verso = null;
		
	}
	
	//get set [init]
	public String getSpecie() {
		return specie;
	}

	public void setSpecie(String specie) {
		this.specie = specie;
	}

	public String getRazza() {
		return razza;
	}

	public void setRazza(String razza) {
		this.razza = razza;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public int getCostituzione() {
		return costituzione;
	}

	public void setCostituzione(int costituzione) {
		this.costituzione = costituzione;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public int getLivello() {
		return livello;
	}

	public void setLivello(int livello) {
		this.livello = livello;
	}
	
	public String getVerso() {
		
		return verso;
	}

	public void setVerso(String verso) {
		this.verso = verso;
	}
	
	//get set [end]
	

	//metodi [init]
	public void mangia() {
		this.costituzione=this.costituzione + 10;
	}
	
	public void dorme() {
		this.energia = this.energia + 10;	
		}
	
	public void cresce() {
		this.livello = this.livello + 10;
	}
	
	public String verso() {
		return "not defined yet";
	}
	
	@Override
	public String toString() {
	return "Specie: " + specie + " \nRazza: " + razza + " \nNome: " + nome + "\n\nSTATS: \n" +"Costituzione: " + costituzione +"\nEnergia: "+ energia + "\nLivello: " + livello + "\n \n" + nome + " fa: " + verso();
	}
	//metodi [end]
	
	

}
