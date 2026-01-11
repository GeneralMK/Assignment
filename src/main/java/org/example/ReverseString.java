package org.example;

public class ReverseString {
    public static String reverse(String myString) {
        if (myString == null) return null;
        StringBuilder sb = new StringBuilder(myString);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("Hello"));
    }
}
