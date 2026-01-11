package org.example;

import java.util.Arrays;

public class AnagramCheck {
    public static boolean areAnagrams(String a, String b) {
        if (a == null || b == null) return false;

        String s1 = a.replaceAll("\\s+", "").toLowerCase();
        String s2 = b.replaceAll("\\s+", "").toLowerCase();
        if (s1.length() != s2.length()) return false;

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("listen", "silent"));
        System.out.println(areAnagrams("hello", "world"));
    }
}
