package uk.ac.hw.sw2048.dukft;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opencsv.CSVReaderHeaderAware;
import com.opencsv.exceptions.CsvValidationException;
import java.util.Scanner;
public class DataManager {

	public static List<LocationDistanceTime> getWarehouseData(){
		//create a csv reader
		CSVReaderHeaderAware dataReader =null;

			try {
				dataReader = new CSVReaderHeaderAware(new FileReader("./input/anylogic_excel_data_1.csv"));

			} catch (IOException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		
		//check data available or not
		if (dataReader == null) { return null; }
				Map<String, String> recordValues = null;
		ArrayList<LocationDistanceTime> dataList = new ArrayList<LocationDistanceTime>();
		do { 
			
			try {
				recordValues = dataReader.readMap();
			} catch (CsvValidationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			if (recordValues != null) {
				LocationDistanceTime record = new LocationDistanceTime(
						Integer.parseInt(recordValues.get("id")),
						recordValues.get("name"),
						Double.parseDouble(recordValues.get("latitude")),
						Double.parseDouble(recordValues.get("longitude")),
						Double.parseDouble(recordValues.get("warehousesize")),
						Double.parseDouble(recordValues.get("distancetruck")),
						Double.parseDouble(recordValues.get("distancetrain")),
						Double.parseDouble(recordValues.get("ERSratio")),
						Double.parseDouble(recordValues.get("distanceIWW"))

						);
				dataList.add(record);
				}
			} while (recordValues != null);
		
		
		
			
		return dataList;
		
		
	}
	
	public static List<ModePerformance> getModeData(){
		//create a csv reader
		CSVReaderHeaderAware dataReader =null;

			try {
				dataReader = new CSVReaderHeaderAware(new FileReader("./input/mode_performance.csv"));

			} catch (IOException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		
		//check data available or not
		if (dataReader == null) { return null; }
				Map<String, String> recordValues = null;
		ArrayList<ModePerformance> dataList = new ArrayList<ModePerformance>();
		do { 
			
			try {
				recordValues = dataReader.readMap();
			} catch (CsvValidationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			if (recordValues != null) {
				ModePerformance record = new ModePerformance(
						recordValues.get("name"),
						Double.parseDouble(recordValues.get("vot")),
						Double.parseDouble(recordValues.get("emissionsDiesel")),
						Double.parseDouble(recordValues.get("costDiesel")),
						Double.parseDouble(recordValues.get("demand")),
						Double.parseDouble(recordValues.get("payload"))
						);
				System.out.println(">>>>>>>>>>>>>>>>>>"+recordValues.get("name"));
				dataList.add(record);
				}
			} while (recordValues != null);
		
		
		
			
		return dataList;
		
		
	}
}
