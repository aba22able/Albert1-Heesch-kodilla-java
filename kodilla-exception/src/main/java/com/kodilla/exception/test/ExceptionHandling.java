package com.kodilla.exception.test;


import com.kodilla.exception.test.SecondChallenge;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(1.1, 0);
            System.out.println(secondChallenge.probablyIWillThrowException(3, 3));
        } catch (Exception e) {
            System.out.println("Hmm... something went wrong!");
        }

        Flight example = new Flight("WAW", "IEV");
        FlightSearcher runner = new FlightSearcher();

        try {
            runner.findFlight(example);
        } catch (RouteNotFoundException e) {
            System.out.println("There is no such flight :(");
        }

        Flight example2 = new Flight("WAW", "JFK");

        try {
            runner.findFlight(example2);
        } catch (RouteNotFoundException e) {
            System.out.println("There is no such flight :(");
        }
    }
}
