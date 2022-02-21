package com.kodilla.stream.beautifier;

public class PoemBeautifier
{
    public String beautify(String a, String b, String c, PoemDecorator poemDecorator)
    {
        String beautifyText = poemDecorator.decorate(a, b, c);
        return beautifyText;
    }
}
