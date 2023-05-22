package com.ing.zoo;

public class Hippo extends Animal {
    public Hippo() {
    }

    @Override
    public void sayHello() {
        System.out.println("Hippo says hello");
    }

    @Override
    public void eat() {
        System.out.println("Hippo eats");
    }

    @Override
    public boolean isValidCommand(String command) {
        return command.equals("hello " + name) || command.equals("give leaves");
    }
}
