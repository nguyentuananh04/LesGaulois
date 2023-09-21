package histoire;

import java.util.Iterator;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix;
		Romain minus;
		
		asterix = new Gaulois("Astérix", 8);
		minus = new Romain("Minus", 6);
		
		asterix.parler("Bonjour à tous !");
		minus.parler("UN GAU... UN GAUGAU...");
		
		for (int i = 0; i < 3; i++) {
			asterix.frapper(minus);
		}
	}

}
