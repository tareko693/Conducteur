package packageVehicule;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Write a description of class Conducteur here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Conducteur {
	private String name;

	private ArrayList<Vehicule> mesVehicules;

	// instance variables - replace the example below with your own

	private boolean etat; // si l'etat est true, alors on est operationel, si
							// false alors nous sommes soit bourré ou endormi

	/**
	 * Constructor for objects of class Conducteur
	 */
	public Conducteur() {
		// initialise instance variables
		this.etat = true;
		this.name = "Roger";
		this.mesVehicules = new ArrayList<Vehicule>();
	}

	public Conducteur(String parName) {
		// initialise instance variables
		this.etat = true;
		this.name = parName;
		this.mesVehicules = new ArrayList<Vehicule>();
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Vehicule> getMesVehicules() {
		
		return this.mesVehicules;
	}

	public void setMesVehicules(ArrayList<Vehicule> mesVehicules) {
		this.mesVehicules = mesVehicules;
	}

	public void setEtat(boolean etatC) {
		this.etat = etatC;
	}

	public boolean getEtat() {
		return this.etat;
	}

	public void addVehicule(Vehicule v) {
		this.mesVehicules.add(v);
	}

	public void supprimerVehicule(Vehicule v) {
		mesVehicules.remove(v);
	}

	/**
	 * An example of a method - methode qui renvoie un text different en
	 * fonction de l'etat
	 * 
	 * */

	public boolean assoupissement() {
		if (this.etat == true) {
			return true;
		}
		return false;
	}

}
