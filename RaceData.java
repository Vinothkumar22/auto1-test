package com.example;

import java.util.List;

public class RaceData implements Comparable<RaceData> {
	private String racer;
    private List<Integer> lapsTime; //time in minutes (integers)

    //racer - name of the racer
    //lapsTime - time of each lap in minutes
    RaceData(String racer, List<Integer> lapsTime) {
        this.racer = racer;
        this.lapsTime = lapsTime;
    }

    String getRacer() {
        return racer;
    }

    List<Integer> getLapsTime() {
        return lapsTime;
    }
    
    int getAvgLapsTime() {
    	return getTotalLapsTime() / lapsTime.size();
    }
    
    int getTotalLapsTime() {
    	return lapsTime.stream().mapToInt(lapTime -> lapTime).sum();
    }
    
    int getBestLapTime() {
    	return lapsTime.stream().mapToInt(lapTime -> lapTime).sorted().findFirst().getAsInt();
    }

	@Override
	public int compareTo(RaceData o) {
		if (getTotalLapsTime() == o.getTotalLapsTime()) return 0;
		if (getTotalLapsTime() < o.getTotalLapsTime()) return -1;
		return 1;
	}
}
