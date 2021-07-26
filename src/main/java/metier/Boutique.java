package metier;

import java.util.ArrayList;
import java.util.List;

public class Boutique {
	
	private String nom;
	private String adresse;
	private List<Jeu> jeux = new ArrayList();
	
	

	public Boutique(String nom, String adresse, List<Jeu> jeux) {
		this.nom = nom;
		this.adresse = adresse;
		this.jeux = jeux;
	}



	public String getNom() {
		return nom;
	}
	
	
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	
	public String getAdresse() {
		return adresse;
	}
	
	
	
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
	public List<Jeu> getJeux() {
		return jeux;
	}
	
	
	public void setJeux(List<Jeu> jeux) {
		this.jeux = jeux;
	}
	
	
	public String toString() {
		return "Boutique [nom=" + nom + ", adresse=" + adresse + ", jeux=" + jeux + "]";
	}

}
