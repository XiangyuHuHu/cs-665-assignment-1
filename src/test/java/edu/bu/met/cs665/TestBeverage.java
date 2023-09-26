package edu.bu.met.cs665;
import static org.junit.Assert.assertEquals;
import java.util.List;
import edu.bu.met.cs665.FullyAutomaticBeverageVendingMachine.Beverage;
import edu.bu.met.cs665.FullyAutomaticBeverageVendingMachine.VendingMachine;
import org.junit.Test;

public class TestBeverage {

    @Test
    public void testVendingMachineInitialization() {
        VendingMachine vendingMachine = new VendingMachine();

        List<String> expectedCoffeeMenu = List.of("espresso", "americano", "latte macchiato");
        List<String> expectedTeaMenu = List.of("black tea", "green tee", "yellow tea");

        assertEquals(expectedCoffeeMenu, vendingMachine.getCoffeeMenu());
        assertEquals(expectedTeaMenu, vendingMachine.getTeaMenu());
        System.out.println(expectedCoffeeMenu);
        System.out.println(expectedTeaMenu);

    }
    @Test
    public void testAddMilk() {
        VendingMachine vendingMachine = new VendingMachine();

        // Get a beverage (e.g., Espresso) from the vending machine
        Beverage beverage = vendingMachine.getBeverage("espresso",2,3,2.5);
        beverage.TestaddMilk(2);

        assertEquals(2, beverage.getMilkUnit());
        assertEquals(3.5, beverage.getPrice(), 0.01);
        beverage.PrintBeverage();
    }

    @Test
    public void testAddSugar() {
        VendingMachine vendingMachine = new VendingMachine();

        // Get a beverage (e.g., Espresso) from the vending machine
        Beverage beverage = vendingMachine.getBeverage("espresso",2,3,2.5);
        beverage.TestaddSugar(2);

        assertEquals(2, beverage.getSugarUnit());
        assertEquals(3.5, beverage.getPrice(), 0.01);
        beverage.PrintBeverage();
    }

    @Test
    public void testCalculatePrice() {
        VendingMachine vendingMachine = new VendingMachine();
        // Get a beverage (e.g., Espresso) from the vending machine
        Beverage beverage = vendingMachine.getBeverage("espresso",0,0,0);
        beverage.TestaddSugar(2);
        beverage.TestaddMilk(1);

        assertEquals(1.5, beverage.price, 0.01);
    }


}