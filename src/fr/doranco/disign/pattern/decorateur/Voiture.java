package fr.doranco.disign.pattern.decorateur;

public abstract class Voiture {

	private String libelle;
	private Integer prix;
	private Integer poids;

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Integer getPrix() {
		return prix;
	}

	public void setPrix(Integer prix) {
		this.prix = prix;
	}

	public Integer getPoids() {
		return poids;
	}

	public void setPoids(Integer poids) {
		this.poids = poids;
	}

	public String toString() {
		return "Voiture : " + getLibelle() + " , Prix : " + getPrix() + " , Poids :" + getPoids();
	}

}
