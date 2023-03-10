package personnages;

public class Romain {
	private String nom;
	private int force;
	public String getNom() {
		return nom;
	}
	
	public Romain(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + " >>");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("A?e");
		} else {
			parler("J'abandonne...");
		}
	}
}
