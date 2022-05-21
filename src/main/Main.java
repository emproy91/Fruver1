package main;

import stakeholders.*;

// import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Person.
        Date birth = new Date( 2002-1900,02-1,20);

        Person p1 = new Person(111888, "Karla", "Giraldo", "Garcia", (float) 1.70, birth);

        p1.showPerson();

        Date birth2 = new Date( 1960-1900,02-1,20);
        Person p2 = new Person(222999, "Mike", "Ramone", "Rojas", (float) 1.90, birth2);

        p2.showPerson();

        // Account.
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.setAccountNumber( 123456 );
        bankAccount1.setActivated( true );
        bankAccount1.showAccount();

        // Fruits.
        ArrayList<String> colors = new ArrayList();
        colors.add( "green" );
        colors.add( "red");
        colors.add( "yellow");

        Fruit fruit1 = new Fruit();
        fruit1.name = "Mango";
        fruit1.averageWeight = 250;

        fruit1.showFruit(colors);

        // Vegetable.
        ArrayList<String> colorsV = new ArrayList();
        colorsV.add( "purple");
        colorsV.add( "white" );

        Vegetable vegetable1 = new Vegetable();
        vegetable1.name = "Onion";
        vegetable1.averageWeight = 100;

        vegetable1.showVegetable(colorsV);


    }
}