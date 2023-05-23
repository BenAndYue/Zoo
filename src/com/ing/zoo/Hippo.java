package com.ing.zoo;

public class Hippo extends Animal {
    private String eatText;

    public Hippo() {
        helloText = "splash";
    }

    public void eatLeaves() {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }

    @Override
    public void sayHello() {
        System.out.println(helloText);
    }
}
