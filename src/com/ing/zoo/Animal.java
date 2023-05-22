package com.ing.zoo;

import java.util.Random;

public abstract class Animal {
    public String name;

    public Animal() {
    }

    public abstract void sayHello();

    public abstract void eat();

    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            System.out.println("Animal performs trick 1");
        } else {
            System.out.println("Animal performs trick 2");
        }
    }

    public boolean isValidCommand(String command) {
        return false;
    }
}
