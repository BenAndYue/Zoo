package com.ing.zoo;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Lion henk = new Lion();
        henk.name = "henk";
        Hippo elsa = new Hippo();
        elsa.name = "elsa";
        Pig dora = new Pig();
        dora.name = "dora";
        Tiger wally = new Tiger();
        wally.name = "wally";
        Zebra marty = new Zebra();
        marty.name = "marty";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();
        if (input.startsWith(commands[0])) {
            String[] inputParts = input.split(" ");
            if (inputParts.length > 1) {
                String animalName = inputParts[1];
                Animal animal = null;
                if (animalName.equals(henk.name)) {
                    animal = henk;
                } else if (animalName.equals(elsa.name)) {
                    animal = elsa;
                } else if (animalName.equals(dora.name)) {
                    animal = dora;
                } else if (animalName.equals(wally.name)) {
                    animal = wally;
                } else if (animalName.equals(marty.name)) {
                    animal = marty;
                }

                if (animal != null && animal.isValidCommand(input)) {
                    animal.sayHello();
                } else {
                    System.out.println("Unknown command: " + input);
                }
            } else {
                System.out.println("Unknown command: "
