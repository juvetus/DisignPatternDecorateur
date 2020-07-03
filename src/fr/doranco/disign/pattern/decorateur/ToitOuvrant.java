package fr.doranco.disign.pattern.decorateur;

public class ToitOuvrant extends Decorateur {

	public ToitOuvrant(Voiture v) {
		voiture = v;
	}

	@Override
	public String getLibelle() {

		return voiture.getLibelle() + " + Toit Ouvrant";
	}

	@Override
	public Integer getPrix() {

		return voiture.getPrix() + 2000;
	}

	@Override
	public Integer getPoids() {

		return voiture.getPoids() + 15;
	}

}
