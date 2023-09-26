/**
 * Name: Xiangyu Hu
 * Course: CS-665 Software Design&Patterns
 * Date: 09/26/2023
 * File Name: VendingMachine.java
 * Description: this file is for adding new beverage on the menu. and form a new menu at beginning. also separate to two menu that easy to fix and manage.
 * class that contains the public static void main()
 */


package edu.bu.met.cs665.FullyAutomaticBeverageVendingMachine;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    ArrayList<String> coffeeMenu = new ArrayList<String>();
    ArrayList<String> TeaMenu = new ArrayList<String>();

    public VendingMachine() {
        coffeeMenu.add("Espresso".toLowerCase());
        coffeeMenu.add("Americano".toLowerCase());
        coffeeMenu.add("Latte Macchiato".toLowerCase());
        TeaMenu.add("Black Tea".toLowerCase());
        TeaMenu.add("Green Tee".toLowerCase());
        TeaMenu.add("Yellow Tea".toLowerCase());

    }


    public List<String> getCoffeeMenu() {
        return coffeeMenu;
    }

    public List<String> getTeaMenu() {
        return TeaMenu;
    }



    public Beverage getBeverage(String beverageType,int milk, int sugar, double price) {
        Beverage beverage = new Beverage();
        beverage.type = beverageType.toLowerCase();
        beverage.sugarUnit = sugar;
        beverage.milkUnit = milk;
        beverage.price = price;
        return beverage;
    }
}
