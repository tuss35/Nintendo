package metier;

import java.time.LocalDate;

public abstract class Console {

	private String nom;
	private int prix;
	private String dateSortie;

	

	public Console(String nom, int prix, String dateSortie) {
		this.nom = nom;
		this.prix = prix;
		this.dateSortie = dateSortie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Console [nom=" + nom + "]";
	}
	
	
}
