package com.kodilla.testing.weather.stub;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
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

    //public double getAvgTemp(List<Integer> temperatures)
   // {
        //double tempSume = 0;
        //for(Integer temperature: temperatures)
        //{
           // tempSume += temperature;
        //}

       // double avgTemperature = tempSume / temperatures.size();

        //return avgTemperature;
   // }

    //public double getMedian(List<Integer> temperatures)
    //{
       // double median;
        //Collections.sort(temperatures);

        //if(temperatures.size() % 2 == 0)
        //{
          //  double theMiddle = temperatures.size() / 2;
          //  double median = temperatures.get(theMiddle - 0.5);

       // } else if(temperatures.size() % 2 != 0)
      //  {

       // }

        //return median;
   // }
}