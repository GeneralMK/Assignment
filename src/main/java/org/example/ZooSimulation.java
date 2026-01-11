package org.example;

public class ZooSimulation {
    public static void main(String[] args) {
        Animal[] animals = new Animal[] {
                new Lion("Simba", 5),
                new Elephant("Dumbo", 12),
                new Parrot("Kiwi", 2),
                new Eagle("Sky", 4)
        };

        for (Animal a : animals) {
            a.displayInformation();
            a.eat();
            a.makeSound();
            a.sleep();
            System.out.println("----");
        }
    }
}
