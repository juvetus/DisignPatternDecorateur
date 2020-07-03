package fr.doranco.disign.pattern.decorateur;

public class GPS extends Decorateur {
	private String libelle = " + GPS ";
	private int prix = 1000;
	private int poids = 20;

	public GPS(Voiture v) {

		voiture = v;
		if(voiture.getClass().isInstance(this)== true) {
			libelle = "";
			prix = 0;
			poids = 0;
		}
	}

	@Override
	public String getLibelle() {
		
		

		return voiture.getLibelle() +   libelle ;

	}

	@Override
	public Integer getPrix() {

		return voiture.getPrix() + prix;
	}

	@Override
	public Integer getPoids() {

		return voiture.getPoids() + poids;
	}

}
