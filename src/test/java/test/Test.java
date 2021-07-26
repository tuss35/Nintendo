package test;

import java.util.ArrayList;
import java.util.List;

import metier.Achat;
import metier.Boutique;
import metier.Client;
import metier.Console;
import metier.Jeu;
import metier.Portable;
import metier.Salon;

public class Test {

	public static void main(String[] args) {
		
		Console SuperNintendo = new Portable ("SuperNintendo", 50, "24/05/2021");
		Console XBoite = new Salon ("XBoite", 100, "25/05/2021");
		
		List<Console> consoles=new ArrayList();
		consoles.add(XBoite);
		consoles.add(SuperNintendo);
		
		
		Jeu MarioTurfu = new Jeu("MarioTurfu", consoles);
		Jeu Pong3D = new Jeu("Pong3D", consoles);
		Jeu TurboRace = new Jeu("TurboRace", consoles);
		Jeu Bagarre = new Jeu("Bagarre", consoles);
		Jeu Karting = new Jeu("Karting", consoles);


		List listejeuxmag = new ArrayList();
		listejeuxmag.add(MarioTurfu);
		listejeuxmag.add(Pong3D);
		
		Boutique magasin = new Boutique("Boutique de jeux", "avenue f��rique", listejeuxmag);

		List<Achat> listeAchat = new ArrayList ();
		Achat achat1 = new Achat(MarioTurfu,"2017-01-22",25,magasin);
		Achat achat2 = new Achat(TurboRace,"2017-03-18",25,magasin);
		Achat achat3 = new Achat(Bagarre,"2017-06-30",25,magasin);
		listeAchat.add(achat1);
		listeAchat.add(achat2);
		listeAchat.add(achat3);
	
	
		Client c = new Client ("Cengiz","Nil",listeAchat);	
	}

}
