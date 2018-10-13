package dwrightmod4csc_201;

public class Rainfall {
private double[] rain;


public Rainfall(double[] downpour) {
	rain = downpour;
	
	
}

public double getTotalRainfall() {
	double totalRain = 0;
	
	for(int i = 0; i< rain.length;i++)
		totalRain += rain[i];
	
	return totalRain;
}

public double getAverageRainFall() {
	double average, total = 0;
	for(int i = 0; i< rain.length;i++)
	total += rain[i];
	
	average = total/12;
	return average;
	
}

public int getHighestMonth() {
	int month = 0;
	double highest = 0;
	
	for(int i = 0; i< rain.length;i++) {
		if(rain[i] > highest) {
			month = i;
			highest = rain[i];
		}
	}
	
	return month;
}

public int getLowestMonth() {
	int month = 0;
	double lowest = 999;
	
	for(int i = 0; i< rain.length;i++) {
		if(rain[i] < lowest) {
			month = i;
			lowest = rain[i];
		}
	}
	
	return month;
}

public double getRainAt(int mon) {
	int month = mon;
	double rainFall;
	rainFall = rain[month];
	
	return rainFall;
}

public double[] getRain() {
	return rain;
}

public void setRain(double[] rain) {
	this.rain = rain;
}



}
