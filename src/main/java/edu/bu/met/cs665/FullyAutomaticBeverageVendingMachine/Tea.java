/**
 * Name: Xiangyu Hu
 * Course: CS-665 Software Design&Patterns
 * Date: 09/26/2023
 * File Name: Tea.java
 * Description: if we want add more function or thing on different coffee, that could add here
 * class that contains the public static void main()
 */

package edu.bu.met.cs665.FullyAutomaticBeverageVendingMachine;

public class Tea extends Beverage{

    public Tea(String type) {
        this.type = type;
        sugarUnit = 0;
        milkUnit = 0;
        price = 0;
    }
}
