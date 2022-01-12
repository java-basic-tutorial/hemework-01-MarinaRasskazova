package com.softserveinc;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        int waterInMachine= amount("Write how many ml of water the coffee machine has:");
        int milkInMachine= amount(" Write how many ml of milk the coffee machine has:");
        int coffeeBeansInMachine= amount("Write how many grams of coffee beans the coffee machine has:");
        int cupsOfCoffeeNeed= amount("Write how many cups of coffee you will need:");

        int cupsEnoughWater= enoughForCoups(waterInMachine, 200);
        int cupsEnoughMilk= enoughForCoups(milkInMachine, 50);
        int cupsEnoughCoffeeBeans= enoughForCoups(coffeeBeansInMachine, 15);

        int possibleAmountOfCups=cupsEnoughWater;

        int[] estimatedAmountOfCups = {cupsEnoughWater, cupsEnoughMilk, cupsEnoughCoffeeBeans};

        for (int i:estimatedAmountOfCups)
        {
            if (possibleAmountOfCups>i){
                possibleAmountOfCups=i;
            }
        }

        if  (possibleAmountOfCups==cupsOfCoffeeNeed){
            System.out.println("Yes, I can make that amount of coffee");
        }
        if (possibleAmountOfCups<cupsOfCoffeeNeed){
            System.out.printf("No, I can make only %d cup(s) of coffee.", possibleAmountOfCups);
        }

        if (possibleAmountOfCups>cupsOfCoffeeNeed){
                System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)",(possibleAmountOfCups-cupsOfCoffeeNeed));
            }
        }


    public static int amount(String question){
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        System.out.print(">>> ");
        int amountOfRaw = scanner.nextInt();
        return amountOfRaw;
        }

    public static int enoughForCoups(int amountOfRaw, int consuption){

        int cups = amountOfRaw/consuption;
        return cups;
        }

    }

