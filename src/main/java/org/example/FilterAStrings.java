package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAStrings {
    public static List<String> keepAInLower(List<String> input) {
        if (input == null) return List.of();
        return input.stream()
                .filter(s -> s != null && s.startsWith("A"))
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> data = Arrays.asList("Apple", "Banana", "Ant", "aero", null, "Axe");
        System.out.println(keepAInLower(data));
    }
}
