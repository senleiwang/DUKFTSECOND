package uk.ac.hw.sw2048.dukft;
import java.text.DecimalFormat;

import java.util.ArrayList;
import java.util.List;

import com.graphhopper.GraphHopper;

import uk.ac.csrf.datamodel.ghtools.GHCoreRequest;
import uk.ac.csrf.datamodel.gis.DistanceManager.FAIL_SEVERITY;
import uk.ac.csrf.datamodel.gis.GeoPoint;
import uk.ac.csrf.datamodel.gis.JourneyResult;
import uk.ac.csrf.datamodel.locationtypes.BareLocation;
import uk.ac.csrf.logisticsalgorithms.PathProperties;

public class MainDriver {

	public static void main(String[] args) {
	
	PathProperties.readPaths();
	
	GraphHopper hopper = new GraphHopper().forDesktop();
	hopper.load(System.getProperty("uk.ac.csrf.datamodel.paths.files.absolute.gis.greatbritain"));
	
		
	ArrayList<Warehouse> warehouseList = new ArrayList<Warehouse>();
	ArrayList<ModePerformance> modePerformanceList = (ArrayList<ModePerformance>) DataManager.getModeData();
	
	int i=0;
	List<LocationDistanceTime> locationDistanceTime =DataManager.getWarehouseData();
    
	for(LocationDistanceTime locDistTime : locationDistanceTime) 
	{       ArrayList<Double> gcMode=new ArrayList<Double> ();
	
		for (ModePerformance modePer : modePerformanceList)
		{    
			if (modePer.getName().equals("rail Train"))
				{	  
				//System.out.println(modePer.getName());
						GeneralizedCostCal gcTrain=new GeneralizedCostCal(modePer.getCostDiesel(), modePer.getVot(), locDistTime.getTrainDistance(),locDistTime.getTrainDistance()/60, modePer.getEmissionsDiesel());
						gcMode.add(gcTrain.GeneUtility());
				}
			if (modePer.getName().equals("road Truck"))
				{
				 		GeneralizedCostCal gcRoad=new GeneralizedCostCal(modePer.getCostDiesel(), modePer.getVot(), locDistTime.getTruckDistance(),locDistTime.getTruckDistance()/60, modePer.getEmissionsDiesel());
				 		gcMode.add(gcRoad.GeneUtility());
				}
			if (modePer.getName().equals("iww Vessel"))
				{
						GeneralizedCostCal gcIWW=new GeneralizedCostCal(modePer.getCostDiesel(), modePer.getVot(), locDistTime.getDistanceIWW(), locDistTime.getDistanceIWW()/20, modePer.getEmissionsDiesel());
						gcMode.add(gcIWW.GeneUtility());
				}
									
		}
		
		//convert a array of GC to Utility
   		ModeShare modeShare=new ModeShare();
		ArrayList<Double> percentages=modeShare.UtilityToShare(gcMode);
		if (i==0)			
		{ 
			System.out.println(gcMode);
			System.out.println(percentages);
		}
	   	warehouseList.add(new Warehouse(locDistTime,i,gcMode,percentages));	
	   	i++;
	}
	
	final BareLocation originLoc = new BareLocation("immingham", new GeoPoint(53.632839, -0.221760));
	
	//warehouse locations and its accessible model of transport with their shares
	for(Warehouse wh : warehouseList) {
		System.out.println("name: "+wh.getLocDistTime().getName().substring(0,7) +", (Latitude longitude): "+wh.getLocDistTime().getLatitude() +", " +wh.getLocDistTime().getLongitude() +", Road share (%): train share (%): IWW share (%) " + wh.getPercentages());
		
		// Use GraphHopper to calculate road distance between this warehouse and the origin point
		JourneyResult jny = GHCoreRequest.journeyCalc(hopper, originLoc, wh.getLocDistTime(), FAIL_SEVERITY.FAILURE_RETURN, false);
		
		if (!jny.fails())
		{
			System.out.println("Crow flies distance: " + originLoc.haversineDistanceKm(wh.getLocDistTime()) + " km");
			System.out.println("Road distance: " + jny.getKm() + " km");
			System.out.println("Road duration: " + jny.getDur().toString());
			
		}
					
		    // Create instances of ModeTransport and ModeShare
		      
		    ModeTransport modeTransport = new ModeTransport(wh.getPercentages());
            double demand=(32000000/26)*wh.getLocDistTime().getWarehouseSize()/11531791;// for example, a container
            System.out.println("demand: " + demand);
		    List<Vehicle> vehicles = modeTransport.generateVehicles((int)demand);

		    // Move the vehicles
		    for (Vehicle vehicle : vehicles) {
		        vehicle.move();
		    }
		}

	}
	
	
}
	


