package fr.adam.copilot.model;

/**
 * Décrit un point d'interêt à annoncer
 * @author ahumphries
 *
 */
public class CircuitPoint {
	
	public String type;
	public String distanceAnnonce;
	public String vitesse;
	public String longueur;
	public String suivant;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDistanceAnnonce() {
		return distanceAnnonce;
	}
	public void setDistanceAnnonce(String distanceAnnonce) {
		this.distanceAnnonce = distanceAnnonce;
	}
	public String getVitesse() {
		return vitesse;
	}
	public void setVitesse(String vitesse) {
		this.vitesse = vitesse;
	}
	public String getLongueur() {
		return longueur;
	}
	public void setLongueur(String longueur) {
		this.longueur = longueur;
	}
	public String getSuivant() {
		return suivant;
	}
	public void setSuivant(String suivant) {
		this.suivant = suivant;
	}
	
}
