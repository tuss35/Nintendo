package test;

import java.util.ArrayList;
import java.util.List;

import metier.Boutique;
import metier.Console;
import metier.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Console SuperNintendo = new Console("SuperNintendo");
		Console XBoite = new Console("XBoite");
		
		
		
		Jeu MarioTurfu = new Jeu("MarioTurfu", SuperNintendo);
		Jeu Pong3D = new Jeu("Pong3D", XBoite);
		Jeu TurboRace = new Jeu("TurboRace", SuperNintendo);
		Jeu Bagarre = new Jeu("Bagarre", SuperNintendo);
		Jeu Karting = new Jeu("Karting", XBoite);
		
		List listejeuxmag = new ArrayList();
		listejeuxmag.add(MarioTurfu);
		listejeuxmag.add(Pong3D);
		
		Boutique magasin = new Boutique("Boutique de jeux", "avenue féérique", listejeuxmag);

	}

}
