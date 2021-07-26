package metier;

public class Adresse {
	
	
	private int numero;
	private String adresse;
	private String ville;
	public Adresse(int numero, String adresse, String ville) {
		super();
		this.numero = numero;
		this.adresse = adresse;
		this.ville = ville;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	@Override
	public String toString() {
		return "Adresse [numero=" + numero + ", adresse=" + adresse + ", ville=" + ville + "]";
	}
	
	

}
