package main;

import models.Fruit;
import models.Vegetable;
import stakeholders.*;

// import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Person.

        Scanner customer = new Scanner(System.in);
        String name = "*";
        int id1 = 0;
        System.out.println("Welcome to Fruver Colombia");
        System.out.println("We have a link to the Muisca system accounts");
        System.out.println("for this we will need some information below.");
        System.out.println("Type your name please and press Enter key");
        name = customer.next();
        System.out.println("Type your identification number please and press Enter key");
        id1 = Integer.parseInt(customer.next());

        // int id1 = 111888;
        int Acc1 = id1+1;
        int yBirth = 2002-1900;
        int mBirth = 05-1;
        int dBirth = 20;
        Date birth = new Date( yBirth,mBirth,dBirth);
        Person p1 = new Person(id1, name, "Giraldo", "Garcia", (float) 1.70, birth);
        // p1.showPerson();

        // Account.
        Scanner acc = new Scanner(System.in);
        System.out.println("Type TRUE if your account is activated" );
        System.out.println("or");
        System.out.println("Type FALSE if your account is deactivated");
        System.out.println("and press Enter key");
        boolean active = Boolean.parseBoolean(acc.next());
        BankAccount a1 = new BankAccount(Acc1, active);
        // a1.showAccount();
        System.out.println("Based on your height and weight this is what you were assigned free for today");
        // Fruits.
        ArrayList<String> colors = new ArrayList();
        colors.add( "green" );
        colors.add( "red");
        colors.add( "yellow");
        Fruit f1 = new Fruit("Tomato", (float) 2.6, colors);
        System.out.println( f1.toString() );
        // f1.showFruit(colors);

        // Vegetable.
        ArrayList<String> colorsV = new ArrayList();
        colorsV.add( "purple");
        colorsV.add( "white");
        Vegetable v1 = new Vegetable("Onion", (float) 0.5, colorsV);
        System.out.println( v1.toString() );
        // v1.showVegetable(colorsV);

        ArrayList<String> colorsV2 = new ArrayList();
        colorsV2.add( "black" );
        colorsV2.add( "white");
        colorsV2.add( "pink" );
        colorsV2.add( "red");
        Vegetable v2 = new Vegetable("Beans", (float) 1, colorsV2);
        System.out.println( v2.toString() );
        // v2.showVegetable(colorsV2);

        // Trade.
        Trade t1 = new Trade(Acc1);
        t1.showTrade();


    }

}