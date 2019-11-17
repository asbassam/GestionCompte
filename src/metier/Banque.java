package metier;

import java.util.LinkedList;
import java.util.List;

public class Banque implements IBanque{
	private List<Compte> comptes;
	
	public Banque() {
		comptes=new LinkedList<>();
	}

	@Override
	public void addCompte(Compte c) {
		if(!comptes.contains(c)) comptes.add(c);
	}

	@Override
	public Compte getCompte(long numero) throws Exception {
		Compte ct=null;
		for(Compte c:comptes) {
			if(c.getNumero()==numero) {
				ct=c;break;
			}
		}
		if(ct==null) throw new Exception("Compte introuvable!");
		return ct;
	}

	@Override
	public void verser(double montant, long numero) throws Exception {
		Compte c=getCompte(numero);
		c.verser(montant);
	}

	@Override
	public void retirer(double montant, long numero) throws Exception {
		Compte c=getCompte(numero);
		c.retirer(montant);
	}

	@Override
	public void virement(double montant, long num1, long num2) throws Exception {
		retirer(montant, num1);
		verser(montant, num2);
	}

	@Override
	public double montantEpargne() {
		double mte=0;
		for(Compte c:comptes) {
			mte+=c.getSolde();
		}
		return mte;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return comptes.toString();
	}
}
