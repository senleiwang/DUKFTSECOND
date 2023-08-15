package uk.ac.hw.sw2048.dukft;

import java.util.ArrayList;

public class ModeShare {
	
	

	public ArrayList<Double> UtilityToShare(ArrayList<Double> utili) {
	    double totalSum = 0.0000;
	    ArrayList<Double> percentages = new ArrayList<>();

	    // calculate total sum of numbers
	    for (int i = 0; i < utili.size(); i++) {
	        totalSum += utili.get(i);
	        
	    }

	    // calculate percentages
	    for (int i = 0; i < utili.size(); i++) {
	        percentages.add((utili.get(i) / totalSum) * 100);
	    }

	    // return percentages
	    //System.out.println(percentages);
	    return percentages;
	}




}