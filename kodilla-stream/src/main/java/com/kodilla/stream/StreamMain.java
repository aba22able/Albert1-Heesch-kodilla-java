package com.kodilla.stream;                                                   // [1]

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;                          // [2]

public class StreamMain {                                                     // [3]

    public static void main(String[] args) {                                   // [4]
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();       // [5]

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);           // [6]
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);           // [7]
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);           // [8]
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);           // [9]

        PoemBeautifier poem = new PoemBeautifier();
        String one = poem.beautify("ABC","o", " ", (a, b, c) -> a + b + a);
        String two = poem.beautify("ABC","o", " ", (a, b, c) -> a + b);
        String three = poem.beautify("ABC","o", "&", (a, b, c) -> c + a + b + a + c);
        String four = poem.beautify("ABC","o", "&", (a, b, c) -> c + a + b + a + c);

        String upper = two.toUpperCase();
        String lower = four.toLowerCase();

        System.out.println(one);
        System.out.println(upper);
        System.out.println(three);
        System.out.println(lower);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}