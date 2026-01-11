package org.example;

public class WordCount {
    public static int countWords(String s) {
        if (s == null) return 0;

        String trimmed = s.trim();
        if (trimmed.isEmpty()) return 0;

        String[] parts = trimmed.split("[^\\p{L}\\p{N}]+");
        int count = 0;
        for (String p : parts) {
            if (!p.isEmpty()) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countWords("Hello, world!"));
        System.out.println(countWords("  Hi... there  friend "));
    }
}
