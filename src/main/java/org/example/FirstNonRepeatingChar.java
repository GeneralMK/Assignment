package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static Character firstNonRepeating(String s) {
        if (s == null || s.isEmpty()) return null;

        Map<Character, Integer> freq = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> e : freq.entrySet()) {
            if (e.getValue() == 1) return e.getKey();
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeating("abracadabra"));
    }
}
