package com.ing.zoo;

public class Lion extends Animal {
    private String eatText;

    public Lion() {
        helloText = "roooaoaaaaar";
    }

    public void eatMeat() {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }

    @Override
    public void sayHello() {
        System.out.println(helloText);
    }
}
