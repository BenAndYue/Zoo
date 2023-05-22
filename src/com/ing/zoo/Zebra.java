package com.ing.zoo;

public class Zebra extends Animal {
    public Zebra() {
    }

    @Override
    public void sayHello() {
        System.out.println("Zebra says hello");
    }

    @Override
    public void eat() {
        System.out.println("munch munch zank yee bra");
    }

    @Override
    public boolean isValidCommand(String command) {
        return command.equals("hello " + name);
    }
}
