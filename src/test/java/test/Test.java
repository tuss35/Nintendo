package test;

import java.util.ArrayList;
import java.util.List;

import metier.Boutique;
import metier.Client;
import metier.Console;
import metier.Jeu;
import metier.Portable;
import metier.Salon;

public class Test {

	public static void main(String[] args) {
		
		Console SuperNintendo = new Portable ("SuperNintendo");
		Console XBoite = new Salon ("XBoite");
		
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

		List<Jeu> maListe = new ArrayList ();
		maListe.add(Karting);
		maListe.add(TurboRace);
		maListe.add(Bagarre);
	
	
		Client c = new Client ("Cengiz","Nil",maListe);	
	}

}
