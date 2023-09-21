package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + " « " + texte + " »");
	}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
	}
	
	public void setEffetPotion(int effetPotion) {
		this.effetPotion = effetPotion;
	}
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public static void main(String[] args) {
		Gaulois asterix;
		Romain leo;
		
		asterix = new Gaulois("Astérix", 8);
		leo = new Romain("Léo", 5);
		
		asterix.parler("Bonjour à tous !");
		leo.parler("Bonjour Astérix ! ");
		asterix.frapper(leo);
		asterix.frapper(leo);
		asterix.frapper(leo);
	}
}
