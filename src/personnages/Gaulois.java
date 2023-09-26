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
	
	public int getForce() {
		return force;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + " « " + texte + " »");
	}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup(force/3*effetPotion);
	}
	
	public void setEffetPotion(int effetPotion) {
		this.effetPotion = effetPotion;
	}
	
	public void boirePotion(int effetPotion) {
		this.effetPotion = effetPotion;
		parler("Merci Druide, je sens que ma force est " + effetPotion + " fois décuplée.");
	}
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public static void main(String[] args) {
		Gaulois asterix;
		Romain leo;
		
		asterix = new Gaulois("Asterix", 8);
		leo = new Romain("Leo", 5);
		
		asterix.parler("Bonjour a  tous !");
		leo.parler("Bonjour Asterix ! ");
		asterix.boirePotion(2);
		asterix.frapper(leo);
		asterix.frapper(leo);
	}
}
