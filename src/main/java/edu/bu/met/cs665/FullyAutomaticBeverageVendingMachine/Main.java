/**
 * Name: Xiangyu Hu
 * Course: CS-665 Software Design&Patterns
 * Date: 09/26/2023
 * File Name: Main.java
 * Description: main file that start the vending maching and all the function.
 * class that contains the public static void main()
 */

package edu.bu.met.cs665.FullyAutomaticBeverageVendingMachine;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**
         * Create a new vending machine
         */
        VendingMachine newVm = new VendingMachine();
        while (true) {
            System.out.println("Drink Menu:");
            System.out.println(newVm.coffeeMenu);
            System.out.println(newVm.TeaMenu);
            System.out.println("What would you like to order? (Type 'exit' to quit):");
            String order = scanner.nextLine().trim().toLowerCase();
            /*System.out.println(order);*/
            if (order.equals("exit")) {
                System.out.println("Thank you. Goodbye!");
                break;
            }
            Beverage beverage = new Beverage();
            beverage.type = order;
            beverage.price = 0;
            beverage.sugarUnit = 0;
            beverage.milkUnit = 0;
            if (newVm.coffeeMenu.contains(order)||newVm.TeaMenu.contains(order)) {
                beverage.addMilk();
                beverage.addSugar();
            }
            beverage.PrintBeverage();

        }
    }
}
