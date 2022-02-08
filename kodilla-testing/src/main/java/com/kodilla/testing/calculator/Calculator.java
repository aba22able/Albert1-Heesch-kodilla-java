package com.kodilla.testing.calculator;

public class Calculator
{
    int a;
    int b;

    public Calculator(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public void addition()
    {
        int c = a + b;
        System.out.println(c);
    }

    public void subtraction() {
        int d = a - b;
        System.out.println(d);
    }
}