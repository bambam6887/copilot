package fr.adam.copilot.model;

import java.util.ArrayList;

/**
 * Décrit un circuit avec les informations de base, les points du circuit à annoncer, temps
 * @author ahumphries
 *
 */
public class Circuit {

	public String nameCircuit;
	public String location;
	public String bestTime;
	public String lastTime;
	public String startLocation;
	public ArrayList<CircuitPoint> listCircuitPoints;
	public String getNameCircuit() {
		return nameCircuit;
	}
	public void setNameCircuit(String nameCircuit) {
		this.nameCircuit = nameCircuit;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getBestTime() {
		return bestTime;
	}
	public void setBestTime(String bestTime) {
		this.bestTime = bestTime;
	}
	public String getLastTime() {
		return lastTime;
	}
	public void setLastTime(String lastTime) {
		this.lastTime = lastTime;
	}
	public String getStartLocation() {
		return startLocation;
	}
	public void setStartLocation(String startLocation) {
		this.startLocation = startLocation;
	}
	public ArrayList<CircuitPoint> getListCircuitPoints() {
		return listCircuitPoints;
	}
	public void setListCircuitPoints(ArrayList<CircuitPoint> listCircuitPoints) {
		this.listCircuitPoints = listCircuitPoints;
	}
}
