package org.example;

public class Lion extends Mammal{
    public Lion(String name, int age) { super(name, age); }

    @Override
    public void eat() {
        System.out.println(getName() + " the Lion is eating meat.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " the Lion roars!");
    }

    @Override
    public void displayInformation() {
        System.out.println("[Lion] Name: " + getName() + ", Age: " + getAge() + ", Diet: Carnivore");
    }
}
