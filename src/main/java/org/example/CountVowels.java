package org.example;

public class CountVowels {

    public static int countVowels(String s) {
        if (s == null) return 0;
        int count = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("documentation")); // 6
    }
}
