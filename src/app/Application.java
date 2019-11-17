package app;

import metier.Banque;
import metier.Compte;
import metier.CompteAnkiba;
import metier.CompteDharura;
import metier.Titulaire;

public class Application {

	public static void main(String[] args) {
		Banque banque=new Banque();
		
		Compte c1=new CompteDharura(1, new Titulaire(2001, "Sidi", "Mohamed"));
		Compte c2=new CompteDharura(2, new Titulaire(2002, "Ali", "Abdou"));
		Compte c3=new CompteAnkiba(3, new Titulaire(2003, "Halima", "Kassim"));
		
		banque.addCompte(c1);banque.addCompte(c2);banque.addCompte(c3);
		
		try {
			banque.verser(100000, 1);
			banque.verser(75000, 2);
			banque.virement(50000, 1, 3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(banque.toString());
	}

}
