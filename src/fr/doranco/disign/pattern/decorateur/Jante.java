package fr.doranco.disign.pattern.decorateur;

public class Jante extends Decorateur {

	public Jante(Voiture v) {
		voiture = v;
	}

	@Override
	public String getLibelle() {

		return voiture.getLibelle() + " + Jante Alu";
	}

	@Override
	public Integer getPrix() {

		return voiture.getPrix() + 90;
	}

	@Override
	public Integer getPoids() {

		return voiture.getPoids() + 80;
	}

}
