package org.example;

public class Elephant extends Mammal{
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the Elephant is eating grass and fruits.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " the Elephant trumpets!");
    }

    @Override
    public void displayInformation() {
        System.out.println("[Elephant] Name: " + getName() + ", Age: " + getAge() + ", Trait: Strong");
    }
}
