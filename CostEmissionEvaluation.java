package uk.ac.hw.sw2048.dukft;

public class CostEmissionEvaluation {
	
	public CostEmissionEvaluation(Double emission_road, Double emission_rail, Double emission_iww,
			Double operating_cost_road, Double operating_cost_rail, Double operating_cost_iww) {
		super();
		this.emission_road = emission_road;
		this.emission_rail = emission_rail;
		this.emission_iww = emission_iww;
		this.operating_cost_road = operating_cost_road;
		this.operating_cost_rail = operating_cost_rail;
		this.operating_cost_iww = operating_cost_iww;
	}
	private Double emission_road=0.0;
	private Double emission_rail=0.0;
	private Double emission_iww=0.0;
	
	private Double operating_cost_road=0.0;
	private Double operating_cost_rail=0.0;
	private Double operating_cost_iww=0.0;
	public Double getEmission_road() {
		return emission_road;
	}
	public void setEmission_road(Double emission_road) {
		this.emission_road = emission_road;
	}
	public Double getEmission_rail() {
		return emission_rail;
	}
	public void setEmission_rail(Double emission_rail) {
		this.emission_rail = emission_rail;
	}
	public Double getEmission_iww() {
		return emission_iww;
	}
	public void setEmission_iww(Double emission_iww) {
		this.emission_iww = emission_iww;
	}
	public Double getOperating_cost_road() {
		return operating_cost_road;
	}
	public void setOperating_cost_road(Double operating_cost_road) {
		this.operating_cost_road = operating_cost_road;
	}
	public Double getOperating_cost_rail() {
		return operating_cost_rail;
	}
	public void setOperating_cost_rail(Double operating_cost_rail) {
		this.operating_cost_rail = operating_cost_rail;
	}
	public Double getOperating_cost_iww() {
		return operating_cost_iww;
	}
	public void setOperating_cost_iww(Double operating_cost_iww) {
		this.operating_cost_iww = operating_cost_iww;
	}
}
