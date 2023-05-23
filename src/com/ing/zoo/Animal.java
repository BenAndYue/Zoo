package com.ing.zoo;

public abstract class Animal {
    protected String name;
    protected String helloText;

    public Animal() {
    }

    public abstract void sayHello();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
