package metier;

public class CompteDharura extends Compte{

	public CompteDharura(long numero, Titulaire titulaire) {
		super(numero, titulaire);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void retirer(double montant) throws Exception {
		if(montant>solde) throw new Exception("Solde insuffisant!");
		solde-=montant;
	}

}
