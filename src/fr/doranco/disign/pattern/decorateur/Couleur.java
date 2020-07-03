package fr.doranco.disign.pattern.decorateur;

public class Couleur extends Decorateur{
	
	public Couleur (Voiture v) {
		voiture = v;
	}

	@Override
	public String getLibelle() {
		
		return voiture.getLibelle() + " + Couleur";
	}

	@Override
	public Integer getPrix() {
		
		return voiture.getPrix() + 500;
	}

	@Override
	public Integer getPoids() {
		
		return voiture.getPoids() + 0;
	}

}
