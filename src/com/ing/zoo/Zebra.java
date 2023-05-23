package com.ing.zoo;

import java.util.Random;

public class Zebra extends Animal {
    private String eatText;

    public Zebra() {
        helloText = "zebra zebra";
    }

    public void eatLeaves() {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }

    @Override
    public void sayHello() {
        System.out.println(helloText);
    }
}
