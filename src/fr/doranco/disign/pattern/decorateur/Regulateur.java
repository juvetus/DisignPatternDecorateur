package fr.doranco.disign.pattern.decorateur;

public class Regulateur extends Decorateur {

	public Regulateur(Voiture v) {
		voiture = v;
	}

	@Override
	public String getLibelle() {

		return voiture.getLibelle() + " +  Regulateur";
	}

	@Override
	public Integer getPrix() {
		return voiture.getPrix() + 200;
	}

	@Override
	public Integer getPoids() {

		return voiture.getPoids() + 1;
	}
}
