package uk.ac.hw.sw2048.dukft;

import java.util.ArrayList;
import java.util.List;

public class ModeTransport {
    private List<Double> modeShares;
    private List<Vehicle> vehicles;
    
    public ModeTransport(List<Double> modeShares) {
        this.modeShares = modeShares;
        this.vehicles = new ArrayList<Vehicle>();
    }
//Implement Monte Carlo simulation 
    public List<Vehicle> generateVehicles(int demand) {
        for (int i = 0; i < demand; i++) {
            double rand = Math.random()*100;
            double cumulativeShare = 0.0;
            for (int j = 0; j < modeShares.size(); j++) {
                cumulativeShare +=modeShares.get(j);
                if (rand < cumulativeShare) {// a higher mode share, a higher probability of generating vehicles
                    //if (j=)
                	vehicles.add(createVehicle(j));
                    break; 
                }
            }
        }
        return vehicles;
    }
//
    private Vehicle createVehicle(int modeIndex) {
        switch (modeIndex) {
            case 0:
                return new RailVehicle() ;
            case 1:
                return new InlandWaterwaysVehicle();
            case 2:
                return new RoadVehicle();
            default:
                throw new IllegalArgumentException("Invalid mode index: " + modeIndex);
        }
    }
}
