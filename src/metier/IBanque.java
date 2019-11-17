package metier;

public interface IBanque {
	public void addCompte(Compte c);
	public Compte getCompte(long numero) throws Exception;
	public void verser(double montant, long numero) throws Exception;
	public void retirer(double montant,long numero) throws Exception;
	public void virement(double montant, long num1, long num2) throws Exception;
	public double montantEpargne();
}
