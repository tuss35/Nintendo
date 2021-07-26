package metier;

import java.util.List;

public class Client {

	private String nom;
	private String prenom;
	private List<Achat> listeAchat;
	
	public Client(String nom, String prenom, List<Achat> listeAchat) {
		this.nom = nom;
		this.prenom = prenom;
		this.listeAchat = listeAchat;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<Achat> getListeAchat() {
		return listeAchat;
	}

	public void setListeAchat(List<Achat> listeAchat) {
		this.listeAchat = listeAchat;
	}


	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", listeAchat=" + listeAchat + "]";
	}
}
