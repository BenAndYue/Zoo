package com.ing.zoo;

import java.util.Random;

public class Pig extends Animal {
    private String eatText;
    private String trick;

    public Pig() {
        helloText = "splash";
    }

    public void eatLeaves() {
        eatText = "munch munch oink";
        System.out.println(eatText);
    }

    public void eatMeat() {
        eatText = "nomnomnom oink thx";
        System.out.println(eatText);
    }

    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "rolls in the mud";
        } else {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }

    @Override
    public void sayHello() {
        System.out.println(helloText);
    }
}
