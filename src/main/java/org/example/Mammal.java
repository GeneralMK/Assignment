package org.example;

public class Mammal extends Animal{
    public Mammal(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " mammal is eating.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " mammal makes a sound.");
    }

    @Override
    public void displayInformation() {
        System.out.println("[Mammal] Name: " + getName() + ", Age: " + getAge());
    }
}
