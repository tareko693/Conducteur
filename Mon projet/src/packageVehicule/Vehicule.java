package packageVehicule;

/**
 * Write a description of class Vehicule here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehicule {
	// instance variables - replace the example below with your own
	private int roues;
	private int vitesse;
	private int imat;
	private Conducteur monConducteur;

	/**
	 * Constructor for objects of class Vehicule
	 */
	public Vehicule() {
		// initialise instance variables
		this.roues = 4;
		this.vitesse = 130;
		this.monConducteur = new Conducteur();
		this.imat= 123;
	}

	public int getRoues() {
		return this.roues;
	}

	public int getVitesse() {
		return this.vitesse;
	}
	
	

	public int getImat() {
		return imat;
	}

	public void setImat(int imat) {
		this.imat = imat;
	}


	public void setRoues(int mesRoues) {
		if(mesRoues>0)
		this.roues = mesRoues;
		
		
	}

	public void setVitesse(int maVitesse) {
		if(maVitesse>0)
		this.vitesse = maVitesse;
	}

	public Conducteur getConducteur() {
		return this.monConducteur;
	}

	public void setConducteur(Conducteur c) {
		this.monConducteur = c;
	}

	/**
	 * compare la vitesse avec la voiture devant, si notre vitesse est
	 * superieur, la fonction retourne true si la vitesse est inferieur, la
	 * fonction retourne false
	 */
	public boolean compareVitesse(int vitesseV) {
		if ((this.vitesse > vitesseV)
				&& (monConducteur.assoupissement() == true)) {
			return true;
		}
		if (monConducteur.assoupissement() == false) {
			return false;
		}
		return false;
	}

	public boolean testproprio(Conducteur c) {
		if (monConducteur.getName() == c.getName())
			return true;
		return false;
	}	
	
	public void vendre(Conducteur c) {
		monConducteur.getMesVehicules().remove(this);
		this.setConducteur(c);
		c.addVehicule(this);
	}
}
