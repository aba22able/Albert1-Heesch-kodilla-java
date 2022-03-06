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
    }
}
