package uk.ac.hw.sw2048.dukft;

public class ModePerformance {
	private String name=null;
	private Double vot=0.0;
	private Double emissionsDiesel=0.0;
	private Double costDiesel=0.0;
	private Double demand=0.0;
	private Double payload=0.0;
	
	public ModePerformance(String name, Double vot, Double emissionsDiesel, Double costDiesel, Double demand,
			Double payload) {
		super();
		this.name = name;
		this.vot = vot;
		this.emissionsDiesel = emissionsDiesel;
		this.costDiesel = costDiesel;
		this.demand = demand;
		this.payload = payload;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getVot() {
		return vot;
	}
	public void setVot(Double vot) {
		this.vot = vot;
	}
	public Double getEmissionsDiesel() {
		return emissionsDiesel;
	}
	public void setEmissionsDiesel(Double emissionsDiesel) {
		this.emissionsDiesel = emissionsDiesel;
	}
	public Double getCostDiesel() {
		return costDiesel;
	}
	public void setCostDiesel(Double costDiesel) {
		this.costDiesel = costDiesel;
	}
	public Double getDemand() {
		return demand;
	}
	public void setDemand(Double demand) {
		this.demand = demand;
	}
	public Double getPayload() {
		return payload;
	}
	public void setPayload(Double payload) {
		this.payload = payload;
	}
	
}
