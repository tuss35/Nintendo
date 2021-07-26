package test;

import java.util.ArrayList;
import java.util.List;

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
		
	}

}
