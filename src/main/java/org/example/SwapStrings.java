package org.example;

public class SwapStrings {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";

        a = a + b; // "HelloWorld"
        b = a.substring(0, a.length() - b.length()); // "Hello"
        a = a.substring(b.length()); // "World"

        System.out.println("a=" + a + ", b=" + b);
    }
}
