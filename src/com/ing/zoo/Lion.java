package com.ing.zoo;

public class Lion extends Animal {
    public Lion() {
    }

    @Override
    public void sayHello() {
        System.out.println("Lion says hello");
    }

    @Override
    public void eat() {
        System.out.println("Lion eats");
    }

    @Override
    public boolean isValidCommand(String command) {
        return command.equals("hello " + name) || command.equals("give meat");
    }
}

// Repeat the same modifications for Hippo, Pig, Tiger, and Zebra classes
