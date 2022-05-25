/**
 * Represents a government-granted transaction.
 * @author Mauricio Pérez.
 */
package main;

/**
 * Here the necessary classes created are imported.
 */
import models.Fruit;
import models.Vegetable;
import stakeholders.BankAccount;
import stakeholders.Person;
import stakeholders.Trade;

/**
 * The necessary JDK classes are imported here.
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    /**
     * Represents the main class that interacts with the others.
     */
    public static void main(String[] args) {

        /**
         * Create an object to capture keyboard input by console to Person.
         * @param name Name of person.
         * @param id1 Identification number to Person 1.
         */
        // Person.
        Scanner customer = new Scanner(System.in);
        String name;
        int id1;

        /**
         * Welcome and data request.
         */
        System.out.println("Welcome to Fruver Colombia");
        System.out.println("We have a link to the Muisca system accounts");
        System.out.println("for this we will need some information below.");
        System.out.println("Type your name please and press Enter key:");
        name = customer.next();
        System.out.println("Type your identification number no dots or spaces please and press Enter key:");
        // Convert the entered text to integer.
        id1 = Integer.parseInt(customer.next());

        /**
         * Adjustment for account number and date of birth.
         * @param acc1 Account 1 encrypted only with the sum of 1.
         * @param yBirth Year of birth adjusted to the Date library.
         * @param mBirth Month of birth adjusted to the Date library.
         * @param dBirth Day of birth set to the Date library.
         */
        int acc1 = id1+1;
        int yBirth = 2002-1900;
        int mBirth = 05-1;
        int dBirth = 20;
        Date birth = new Date( yBirth,mBirth,dBirth);

        /**
         * Create an instance of the Person class.
         * @param ln1 First last name to lastName1 at Person.
         * @param ln2 Second last name to lastName2 at Person.
         * @param h Height in meters to height at Person.
         * @param birth Fixed birthdate for dateBirth and age at Person.
         */
        Person p1 = new Person(id1, name, "Giraldo", "Garcia", (float) 1.70, birth);

        /**
         * Create an object to capture keyboard input by console to BankAccount.
         * @param a1 Account number to BankAccount 1.
         */
        // Account.
        Scanner acc = new Scanner(System.in);

        /**
         * Instructions and data request.
         */
        System.out.println("Type TRUE if your account is activated" );
        System.out.println("or");
        System.out.println("Type FALSE if your account is deactivated");
        System.out.println("and press Enter key:");

        boolean active = Boolean.parseBoolean(acc.next());
        // Convert the entered text to boolean.

        /**
         * Create an instance of the BankAccount class.
         * @param acc1 Fixed  to accountNumber at BankAccount.
         * @param active Account activation verification to activated at BankAccount.
         */
        BankAccount a1 = new BankAccount(acc1, active);

        /**
         * Please uncomment the following method to test and show the entire Account instance in the console.
         */
        // a1.showAccount();

        if (active) {

            // show benefit provided by the government today
            System.out.println("Based on your height and age this is what you were assigned free for today");

            /**
             * Create an object to send color list to Fruits.
             * @param colors Color list to colors at Fruit 1.
             */
            // Fruits.
            ArrayList<String> colors = new ArrayList();
            colors.add("green");
            colors.add("red");
            colors.add("yellow");

            /**
             * Create an instance of the Fruit class.
             * @param name Name of fruit.
             * @param averageWeight Average fruit weight.
             */
            Fruit f1 = new Fruit("Tomato", (float) 0.6, colors);
            // Shows the properties of the Fruit in a row.
            System.out.println(f1);

            /**
             * Please uncomment the following method to test and show the entire Fruit instance in the console.
             */
            // f1.showFruit(colors);

            /**
             * Create an object to send color list to Vegetable.
             * @param colorsV Color list to colors at Vegetable 1.
             */
            // Vegetable.
            ArrayList<String> colorsV = new ArrayList();
            colorsV.add("purple");
            colorsV.add("white");

            /**
             * Create an instance of the Vegetable class.
             * @param name Name of Vegetable.
             * @param averageWeight Average vegetable weight.
             */
            Vegetable v1 = new Vegetable("Onion", (float) 0.5, colorsV);
            // Shows the properties of the Fruit in a row.
            System.out.println(v1);

            /**
             * Please uncomment the following method to test and show the entire Vegetable instance in the console.
             */
            // v1.showVegetable(colorsV);

            /**
             * Create another instance of the Vegetable class.
             */
            ArrayList<String> colorsV2 = new ArrayList();
            colorsV2.add("black");
            colorsV2.add("white");
            colorsV2.add("pink");
            colorsV2.add("red");
            Vegetable v2 = new Vegetable("Beans", (float) 1, colorsV2);
            System.out.println(v2);
            // v2.showVegetable(colorsV2);

        }

        /**
         * Create an object to send account number to Trade.
         * @param acc1 Account number to accountNumber at Trade 1.
         */
        // Trade.
        Trade t1 = new Trade(acc1);

        t1.showTrade();

        p1.showPerson();


    }

}