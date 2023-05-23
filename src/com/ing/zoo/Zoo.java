package com.ing.zoo;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        String[] commands = new String[5];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";
        commands[4] = "fly";

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
//        New animals
        Eagle majestic = new Eagle();
        majestic.setName("Majestic");
        Ostrich oscar = new Ostrich();
        oscar.setName("Oscar");

        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Voer uw command in (type 'Naar huis' om te stoppen): ");
            input = scanner.nextLine();

            if (input.equals("Naar huis")) {
                System.out.println("Veilig naar huis gegaan");
                break;
            } else if (input.equals(commands[0])) {
                // [hello] command without name
                henk.sayHello();
                elsa.sayHello();
                dora.sayHello();
                wally.sayHello();
                marty.sayHello();
            } else if (input.startsWith(commands[0] + " ") && input.length() > commands[0].length() + 1) {
                // [hello henk] command with name
                String name = input.substring(commands[0].length() + 1);
                if (name.equalsIgnoreCase(henk.name)) {
                    henk.sayHello();
                } else if (name.equalsIgnoreCase(elsa.name)) {
                    elsa.sayHello();
                } else if (name.equalsIgnoreCase(dora.name)) {
                    dora.sayHello();
                } else if (name.equalsIgnoreCase(wally.name)) {
                    wally.sayHello();
                } else if (name.equalsIgnoreCase(marty.name)) {
                    marty.sayHello();
                } else {
                    System.out.println("Unknown name: " + name);
                }
            } else if (input.equals(commands[1])) {
                // [give leaves] command
                elsa.eatLeaves();
                dora.eatLeaves();
                marty.eatLeaves();
            } else if (input.equals(commands[2])) {
                // [give meat] command
                henk.eatMeat();
                dora.eatMeat();
                wally.eatMeat();
            } else if (input.equals(commands[3])) {
                // [perform trick] command
                wally.performTrick();
                dora.performTrick();
                majestic.doTrick();
                oscar.doesTrick();
            }  else if (input.equals(commands[4])) {
            // [perform fly command
                majestic.fly();
                oscar.fly();
        } else {
                System.out.println("Unknown command: " + input);
            }
        }
    }
}
