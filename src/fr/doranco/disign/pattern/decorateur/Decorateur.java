package fr.doranco.disign.pattern.decorateur;

public abstract class Decorateur extends Voiture {

	protected  Voiture voiture;

	public abstract String getLibelle();

	public abstract Integer getPrix();

	public abstract Integer getPoids();

}
