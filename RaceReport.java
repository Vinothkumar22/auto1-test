package com.example;

import java.util.List;

public class RaceReport {
	void print(List<RaceData> raceData) {
        System.out.print("--------------------\n");
        
        String winner = raceData.stream().sorted().findFirst().get().getRacer();
        
        int index = 1;
        for (RaceData raceDatum : raceData) {
        	String winnerLabel = winner.equals(raceDatum.getRacer()) ? " (winner)" : "";
    		System.out.printf("Racer%s: %s%n", winnerLabel, raceDatum.getRacer());
        	System.out.printf("Average time: %dm%n",  raceDatum.getAvgLapsTime());
        	System.out.printf("Best lap: %dm%n", raceDatum.getBestLapTime());
        	
        	if (index++ < raceData.size()) { System.out.print("       -----         \n"); }
        }
        
        System.out.print("--------------------\n");
    }
}
