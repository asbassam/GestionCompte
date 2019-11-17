package metier;

import java.util.Date;

public abstract class Compte {
	protected long numero;
	protected double solde;
	protected Date dateDerniereOperation;
	protected Titulaire titulaire;
	
	public Compte(long numero, Titulaire titulaire ) {
		this.numero=numero;
		solde=0;
		dateDerniereOperation=new Date();
		this.titulaire=titulaire;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Compte) {
			Compte c=(Compte)o;
			if(this.numero==c.getNumero()) return true;
		}
		return false;
	}
	
	public void verser(double montant){
		solde+=montant;
	}
	
	@Override
	public String toString() {
		return titulaire.toString()+"|"+numero+","+solde;
	}
	
	public abstract void retirer(double montant) throws Exception;
	
	public long getNumero() {
		return numero;
	}
	
	public double getSolde() {
		return solde;
	}
	
	public Date getDateDerniereOperation() {
		return dateDerniereOperation;
	}
	
	public Titulaire getTitulaire() {
		return titulaire;
	}
}
