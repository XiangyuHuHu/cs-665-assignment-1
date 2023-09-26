/**
 * Name: Xiangyu Hu
 * Course: CS-665 Software Design&Patterns
 * Date: 09/26/2023
 * File Name: Beverage.java
 * Description: the beverage, have add milk and add sugar function.
 * class that contains the public static void main()
 */


package edu.bu.met.cs665.FullyAutomaticBeverageVendingMachine;
import java.util.Scanner;
public class Beverage {
    public String type;
    public double price;
    public  int sugarUnit;
    public  int milkUnit;



    /**
     * ask for the input and add milk to the beverage, and add the price at the end
     */
    public void addMilk() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("How many units of milk (0-3) would you like to add? ");
            int newMilk = scanner.nextInt();
            if (newMilk < 0 || newMilk > 3) {
                System.out.println("Invalid input. Please enter a value between 0 and 3.");
                continue;
            }
            else {
                milkUnit = newMilk;
                this.price += 0.5 * milkUnit;
            }
            break;
        }
    }
    /**
     * ask for the input and add sugar to the beverage, and add the price at the end
     */
    public void addSugar() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("How many units of sugar (0-3) would you like to add? ");
            int newSugar = scanner.nextInt();
            if (newSugar < 0 || newSugar > 3) {
                System.out.println("Invalid input. Please enter a value between 0 and 3.");
                continue;
            }

            else {
                sugarUnit = newSugar;
                this.price += 0.5 * sugarUnit;
            }

            break;
        }
    }

    public void PrintBeverage() {
        System.out.println("here is your " + type);
        System.out.println("MilkUnit: " + milkUnit);
        System.out.println("SugarUnit: " + sugarUnit);
        System.out.println("Total Price: $" + price);
    }


    /**
     * All the function below is for test
     */
    public int getMilkUnit() {
        return milkUnit;
    }
    public int getSugarUnit() {
        return milkUnit;
    }

    public double getPrice() {
        return price;
    }
    public void TestaddMilk(int test) {
        if (test < 0 || test > 3) {
            System.out.println("Invalid input. Please enter a value between 0 and 3.");

            }
            else {
                milkUnit = test;
                this.price += 0.5 * milkUnit;
            }

        }


    public void TestaddSugar(int test) {
        if (test < 0 || test > 3) {
            System.out.println("Invalid input. Please enter a value between 0 and 3.");

        }
        else {
            sugarUnit = test;
            this.price += 0.5 * sugarUnit;
        }

    }

}
