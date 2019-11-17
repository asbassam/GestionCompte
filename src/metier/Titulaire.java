package metier;

public class Titulaire {
	private long nin;
	private String nom;
	private String prenom;
	
	public Titulaire(long nin, String nom, String prenom) {
		this.nin=nin;
		this.nom=nom;
		this.prenom=prenom;
	}
	
	@Override
	public String toString() {
		return "{"+nin+","+nom+","+prenom+"}";
	}
	
	public long getNin() {
		return nin;
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
}
