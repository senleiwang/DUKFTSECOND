package uk.ac.hw.sw2048.dukft;

import uk.ac.csrf.datamodel.locationtypes.GenericLocation;

public class LocationDistanceTime extends GenericLocation
{
	private static final String prefix = "LDT_";
	
	private int id = 0;
	private String name=null;
	/*
	private Double latitude=0.0;
	private Double longitude=0.0;
	*/
	private Double warehouseSize=0.0;
	private Double truckDistance=0.0;
	private Double trainDistance=0.0;
	private Double ratioERS=0.0;
	private Double distanceIWW=0.0;
	public LocationDistanceTime(int id, String name, Double latitude, Double longitude, Double warehouseSize,
			Double truckDistance, Double trainDistance, Double ratioERS, Double distanceIWW) {
		super(prefix, String.format("%d", id), latitude, longitude);
		this.id = id;
		this.name = name;
		//this.latitude = latitude;
		//this.longitude = longitude;
		this.warehouseSize = warehouseSize;
		this.truckDistance = truckDistance;
		this.trainDistance = trainDistance;
		this.ratioERS = ratioERS;
		this.distanceIWW = distanceIWW;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getLatitude() {
		return getLat();
	}
	/*
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	*/
	public Double getLongitude() {
		return getLon();
	}
	
	/*
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	*/
	public Double getWarehouseSize() {
		return warehouseSize;
	}
	public void setWarehouseSize(Double warehouseSize) {
		this.warehouseSize = warehouseSize;
	}
	public Double getTruckDistance() {
		return truckDistance;
	}
	public void setTruckDistance(Double truckDistance) {
		this.truckDistance = truckDistance;
	}
	public Double getTrainDistance() {
		return trainDistance;
	}
	public void setTrainDistance(Double trainDistance) {
		this.trainDistance = trainDistance;
	}
	public Double getRatioERS() {
		return ratioERS;
	}
	public void setRatioERS(Double ratioERS) {
		this.ratioERS = ratioERS;
	}
	public Double getDistanceIWW() {
		return distanceIWW;
	}
	public void setDistanceIWW(Double distanceIWW) {
		this.distanceIWW = distanceIWW;
	}
	
	
}
