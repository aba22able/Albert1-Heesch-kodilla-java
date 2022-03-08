package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearcher
{
    public void findFlight(Flight flight) throws RouteNotFoundException
    {
        Map<String, Boolean> airports = new HashMap<>();

        Flight flight1 = new Flight("WAW", "IEV");
        Flight flight2 = new Flight("IEV", "WAW");
        Flight flight3 = new Flight("WMI", "BCN");
        Flight flight4 = new Flight("BCN", "WMI");
        Flight flight5 = new Flight("NQZ", "WAW");
        Flight flight6 = new Flight("WAW", "NQZ");

        airports.put(flight1.getArrivalAirport(), false);
        airports.put(flight2.getArrivalAirport(), false);
        airports.put(flight3.getArrivalAirport(), true);
        airports.put(flight4.getArrivalAirport(), true);
        airports.put(flight5.getArrivalAirport(), true);
        airports.put(flight6.getArrivalAirport(), true);


        boolean isTheSame = true;
        if(flight != null) {
            for (Map.Entry<String, Boolean> flights : airports.entrySet()) {
                if (flights.getKey().equals(flight.getArrivalAirport())) {
                    System.out.println("We have found your flight!");
                    isTheSame = false;
                }
            }
        } else {
            throw new RouteNotFoundException();
        }

        if(isTheSame)
        {
            throw new RouteNotFoundException();
        }

    }
}
