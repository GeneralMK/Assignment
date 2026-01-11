package org.example;

public class Parrot extends Bird{
    public Parrot(String name, int age) { super(name, age); }

    @Override
    public void eat() {
        System.out.println(getName() + " the Parrot is eating seeds.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " the Parrot says: 'Hello!'");
    }

    @Override
    public void displayInformation() {
        System.out.println("[Parrot] Name: " + getName() + ", Age: " + getAge() + ", Color: Green");
    }
}
