package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;
    List<Double> temperaturesList;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
        temperaturesList = new ArrayList<>(temperatures.getTemperatures().values());
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double getAvgTemp()
    {
        double tempSume = 0;
        for(Double temperature: temperaturesList)
        {
            tempSume += temperature;
        }

        double avgTemperature = tempSume / temperatures.getTemperatures().size();

        return avgTemperature;
    }

    public double getMedian()
    {

        Collections.sort(temperaturesList);
        int theMiddle = temperaturesList.size() / 2;

        if(temperaturesList.size() % 2 == 0)
        {
            Double firstHalf = temperaturesList.get(theMiddle);
            Double secondHalf = temperaturesList.get(theMiddle +1);
            return (firstHalf + secondHalf) / 2;
        } else {
            Double median = temperaturesList.get(theMiddle);
            return median;
        }
    }

}