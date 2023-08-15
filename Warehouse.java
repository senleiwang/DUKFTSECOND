package uk.ac.hw.sw2048.dukft;

import java.util.ArrayList;

import uk.ac.csrf.datamodel.locationtypes.GenericLocation;

public class Warehouse
{
	private LocationDistanceTime locDistTime = null;
	//private ModePerformance modePer=null;
	private int id =0;
	private ArrayList<Double> modeTran=null;
	private ArrayList<Double> percentages=null;
	//public String getTrainDistance;
	public Warehouse(LocationDistanceTime locDistTime, int id, ArrayList<Double> modeTran,
			ArrayList<Double> percentages) {
		super();
		this.locDistTime = locDistTime;
		this.id = id;
		this.modeTran = modeTran;
		this.percentages = percentages;
	}
	public LocationDistanceTime getLocDistTime() {
		return locDistTime;
	}
	public void setLocDistTime(LocationDistanceTime locDistTime) {
		this.locDistTime = locDistTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Double> getModeTran() {
		return modeTran;
	}
	public void setModeTran(ArrayList<Double> modeTran) {
		this.modeTran = modeTran;
	}
	public ArrayList<Double> getPercentages() {
		return percentages;
	}
	public void setPercentages(ArrayList<Double> percentages) {
		this.percentages = percentages;
	}
	
	
}
