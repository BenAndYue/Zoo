package com.ing.zoo;

public abstract class Bird extends Animal {
    public Bird() {
        helloText = "chirp chirp";
    }

    public void fly() {
        System.out.println("Flies in the air");
    }

    public void trick(){
        System.out.println("Poops in his cage");
    }


    @Override
    public void sayHello() {
        System.out.println(helloText);
    }
}
