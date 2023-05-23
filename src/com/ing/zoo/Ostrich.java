package com.ing.zoo;

public class Ostrich extends Bird {
    public Ostrich() {
        helloText = "boom boom";
    }

    @Override
    public void fly() {
        System.out.println("Tries to fly and then falls");
    }


    public void doesTrick() {
        System.out.println("Kicks ZooKeeper");
    }
}
