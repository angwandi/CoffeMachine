package dems.apps;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
       /* String coffeeMachine = "Starting to make a coffee\n" +
                "Grinding coffee beans\nBoiling water\n" +
                "Mixing boiled water with crushed coffee beans\n" +
                "Pouring coffee into the cup\n" +
                "Pouring some milk into the cup\n" +
                "Coffee is ready!";
        System.out.println(coffeeMachine);*/
//        System.out.println("Write how many cups of coffee you will need: " + numberOfCupOfCoffee);
        System.out.println("Write how many cups of coffee you will need: ");
        int numberOfCupOfCoffee = scanner.nextInt();
        System.out.println("For " + numberOfCupOfCoffee + " cups of coffee you will need:");
        int water = 200;
        int milk = 50;
        int beans = 15;

        System.out.println(numberOfCupOfCoffee * water + " ml of water");
        System.out.println(numberOfCupOfCoffee * milk + " ml of milk");
        System.out.println(+numberOfCupOfCoffee * beans + " g of coffee beans");
    }
}
