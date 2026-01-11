package org.example;

public class Bird extends Animal{
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " (bird) is pecking food.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " (bird) chirps.");
    }

    @Override
    public void displayInformation() {
        System.out.println("[Bird] Name: " + getName() + ", Age: " + getAge());
    }
}
