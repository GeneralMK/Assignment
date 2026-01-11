package org.example;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
        if (list == null) return new ArrayList<>();
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A"); list.add("B"); list.add("A"); list.add("C"); list.add("B");
        System.out.println(removeDuplicates(list));
    }

}
