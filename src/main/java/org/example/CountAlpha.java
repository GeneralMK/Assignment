package org.example;

public class CountAlpha {
    public static int countAlpha(String s) {
        if (s == null) return 0;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countAlpha("Hi! 123 _ A-z"));

    }
}
