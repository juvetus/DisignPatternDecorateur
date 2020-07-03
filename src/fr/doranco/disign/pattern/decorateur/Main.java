package fr.doranco.disign.pattern.decorateur;

public class Main {

	public static void main(String[] args) {
		
		  Voiture v1 = new Corsa(); 
		  System.out.println(v1);
		  
		  Voiture v2 = new C2(); 
		  v2 = new Regulateur(v2);
		  System.out.println(v2);
		  
		  Voiture v3 = new Corsa(); 
		  v3 = new ToitOuvrant(v3); 
		  v3 = new GPS(v3);
		  v3 = new Couleur(v3);
		  System.out.println(v3);
		  
		  Voiture v4 = new C2();
		  v4 = new ToitOuvrant(v4); 
		   v4 = new GPS(v4);
		 //  v4 = new ToitOuvrant(v4);
		   v4 = new GPS(v4); 
		 //  v4 = new ToitOuvrant(v4);
		   v4 = new GPS(v4);
		   v4 = new GPS(v4);
		  v4 = new GPS(v4); 
		  v4 = new Couleur(v4); 
		  v4 = new Jante(v4); 
		  System.out.println(v4);
		 
		
		/*
		 * Voiture vA = new Corsa(); Voiture vB = new GPS(vA); Voiture vC = new GPS(vB);
		 * System.out.println("Voiture 5: " + vC);
		 */

	}

}
