package machine;

import java.util.*;

public class CoffeeMachine {

    public static void main(String[] args) {

        int initialWater = 400;
        int initialMilk = 540;
        int initialBeans = 120;
        int initialMoney = 550;
        int initialCups = 9;

        // boolean run = true;
        Scanner sc = new Scanner(System.in);

        // System.out.println(); // add empty line
        printActions();
        String action = sc.next();
        while (!action.equals("exit")) {
            if (action.equals("buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                String coffeeType = sc.next();

                if (coffeeType.equals("1")) {
                    if (initialWater >= 250 && initialBeans >= 16 && initialCups >= 1) {
                        System.out.println("I have enough resources, making you a coffee!");
                        initialWater -= 250;
                        initialBeans -= 16;
                        initialMoney += 4;
                        initialCups -= 1;
                        System.out.println(); // empty line
                        printActions();
                        action = sc.next();
                    } else {
                        if (initialWater < 250) {
                            System.out.println("Sorry, not enough water!");
                        } else if (initialBeans < 16) {
                            System.out.println("Sorry, not enough beans!");
                        } else if (initialCups < 1) {
                            System.out.println("Sorry, not enough cups!");
                        }
                        System.out.println(); // empty line
                        printActions();
                        action = sc.next();
                    }

                } else if (coffeeType.equals("2")) {
                    if (initialWater >= 350 && initialMilk >= 75 && initialBeans >= 20 && initialCups >= 1) {
                        System.out.println("I have enough resources, making you a coffee!");
                        initialWater -= 350;
                        initialMilk -= 75;
                        initialBeans -= 20;
                        initialMoney += 7;
                        initialCups -= 1;
                        System.out.println(); // empty line
                        printActions();
                        action = sc.next();
                    } else {
                        if (initialWater < 350) {
                            System.out.println("Sorry, not enough water!");
                        } else if (initialBeans < 20) {
                            System.out.println("Sorry, not enough beans!");
                        } else if (initialMilk < 75) {
                            System.out.println("Sorry, not enough milk!");
                        } else if (initialCups < 1) {
                            System.out.println("Sorry, not enough cups!");
                        }
                        System.out.println(); // empty line
                        printActions();
                        action = sc.next();
                    }

                } else if (coffeeType.equals("3")) {
                    if (initialWater >= 200 && initialMilk >= 100 && initialBeans >= 12 && initialCups >= 1) {
                        System.out.println("I have enough resources, making you a coffee!");
                        initialWater -= 200;
                        initialMilk -= 100;
                        initialBeans -= 12;
                        initialMoney += 6;
                        initialCups -= 1;
                        System.out.println(); // empty line
                        printActions();
                        action = sc.next();
                    } else {
                        if (initialWater < 200) {
                            System.out.println("Sorry, not enough water!");
                        } else if (initialBeans < 12) {
                            System.out.println("Sorry, not enough beans!");
                        } else if (initialMilk < 100) {
                            System.out.println("Sorry, not enough milk!");
                        } else if (initialCups < 1) {
                            System.out.println("Sorry, not enough cups!");
                        }
                        System.out.println(); // empty line
                        printActions();
                        action = sc.next();
                    }
                }else if(coffeeType.equals("back")){
                    printActions();
                    action = sc.next();
                }

            } else if (action.equals("fill")) {

                System.out.println("Write how many ml of water you want to add: ");
                int addWater = sc.nextInt();
                initialWater += addWater;
                System.out.println("Write how many ml of milk you want to add: ");
                int addMilk = sc.nextInt();
                initialMilk += addMilk;
                System.out.println("Write how many grams of coffee beans you want to add: ");
                int addBeans = sc.nextInt();
                initialBeans += addBeans;
                System.out.println("Write how many disposable cups you want to add: ");
                int addCups = sc.nextInt();
                initialCups += addCups;
                //print coffee Machine state after fill
                System.out.println(); // empty line
                printActions();
                action = sc.next();

            } else if (action.equals("take")) {

                takeMoney(initialMoney);
                initialMoney = 0; // reset initial money to 0
                System.out.println(); // empty line
                printActions();
                action = sc.next();

            } else if (action.equals("remaining")) {
                printMachineState(initialWater, initialMilk, initialBeans, initialCups, initialMoney);
                System.out.println();
                printActions();
                action = sc.next();
            }
        }
    }

    public static void printMachineState(int water, int milk, int beans, int cups, int money) {
        System.out.printf("\nThe coffee machine has:\n" +
                "%d ml of water\n" +
                "%d ml of milk\n" +
                "%d g of coffee beans\n" +
                "%d disposable cups\n" +
                "$%d of money\n", water, milk, beans, cups, money);
    }

    public static void printActions() {
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
    }

    public static void takeMoney(int money) {
        System.out.printf("I gave you $%d\n", money);
    }
}
