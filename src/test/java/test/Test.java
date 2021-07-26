package test;

import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
<<<<<<< Updated upstream
import metier.Boutique;
=======
import metier.Client;
>>>>>>> Stashed changes
=======
<<<<<<< HEAD
=======
import metier.Boutique;
>>>>>>> main
>>>>>>> main
import metier.Console;
import metier.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Console SuperNintendo = new Console("SuperNintendo");
		Console XBoite = new Console("XBoite");
		
		List<Console> consoles=new ArrayList();
		consoles.add(XBoite);
		consoles.add(SuperNintendo);
		
		
		Jeu MarioTurfu = new Jeu("MarioTurfu", consoles);
		Jeu Pong3D = new Jeu("Pong3D", consoles);
		Jeu TurboRace = new Jeu("TurboRace", consoles);
		Jeu Bagarre = new Jeu("Bagarre", consoles);
		Jeu Karting = new Jeu("Karting", consoles);
		
<<<<<<< HEAD
<<<<<<< Updated upstream
=======
<<<<<<< HEAD
=======
>>>>>>> main
		List listejeuxmag = new ArrayList();
		listejeuxmag.add(MarioTurfu);
		listejeuxmag.add(Pong3D);
		
		Boutique magasin = new Boutique("Boutique de jeux", "avenue féérique", listejeuxmag);

<<<<<<< HEAD
=======
		
		
		List<Jeu> maListe = new ArrayList ();
		maListe.add(Karting);
		maListe.add(TurboRace);
		maListe.add(Bagarre);
	
	
	Client c = new Client ("Cengiz","Nil",maListe);	
		
	
>>>>>>> Stashed changes
=======
>>>>>>> main
>>>>>>> main
	}

}
