package uk.ac.hw.sw2048.dukft;

public class GeneralizedCostCal {
private Double cost=0.0;
private Double vot=0.0;
private Double distance=0.0;
private Double time=0.0;
private Double emission=0.0;
private Double price=0.1;

public GeneralizedCostCal(Double cost, Double vot, Double distance, Double time, Double emssion) {
	super();
	this.cost = cost;
	this.vot = vot;
	this.distance = distance;
	this.time = time;
	this.emission = emssion;
	}
public double GeneUtility()
{   Double cost=0.0;
    cost=distance*cost+time*vot+price*distance*emission;

	return Math.exp(-0.25*cost);
	
}


public Double getCost() {
	return cost;
}
public void setCost(Double cost) {
	this.cost = cost;
}
public Double getVot() {
	return vot;
}
public void setVot(Double vot) {
	this.vot = vot;
}
public Double getDistance() {
	return distance;
}
public void setDistance(Double distance) {
	this.distance = distance;
}
public Double getTime() {
	return time;
}
public void setTime(Double time) {
	this.time = time;
}
public Double getEmssion() {
	return emission;
}
public void setEmssion(Double emssion) {
	this.emission = emssion;
}



}
