package histoire;


import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix, obelix;
		Romain minus;
		Druide panoramix;
		
		asterix = new Gaulois("Asterix", 8);
		minus = new Romain("Minus", 6);
		obelix = new Gaulois("Obélix", 25);
		
		panoramix = new Druide("Panoramix", 5, 10);
		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		panoramix.booster(asterix);
		asterix.boirePotion(panoramix.getForcePotion());
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
	}

}
