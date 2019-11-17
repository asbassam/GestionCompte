package metier;

import java.util.Date;

public class CompteAnkiba extends Compte{
	private static final int tauxInteret=3;

	public CompteAnkiba(long numero, Titulaire titulaire) {
		super(numero, titulaire);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void retirer(double montant) throws Exception {
		long nb=Jour.nbreDejours(this.dateDerniereOperation, new Date());
		if(nb<15) throw new Exception("Opération impossible");
		if(montant>solde) throw new Exception("Montant issuffisant");
		solde-=montant;
	}
	
	public double interet() {
		return solde*tauxInteret/100;
	}

}
