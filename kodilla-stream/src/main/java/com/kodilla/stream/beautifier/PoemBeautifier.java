package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String someText, String decorator, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorator(someText, decorator);
        System.out.println(result);
    }

}
