package org.example;

public abstract class Animal implements AnimalBehavior {

    private final String name;
    private final int age;

    protected Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping... Zzz");
    }

    public abstract void displayInformation();
}
