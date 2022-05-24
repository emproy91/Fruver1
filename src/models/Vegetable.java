package models;

import java.util.ArrayList;

public class Vegetable extends Product {

    public ArrayList<String> colors;

    public Vegetable(String name, float averageWeight, ArrayList<String> colors) {
        super(name, averageWeight);
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "Vegetable {" +
                super.toString() +
                " colors = " + colors +
                '}';
    }

    public void showVegetable(ArrayList<String> colorsV) {
        System.out.println("Name: " + name);
        System.out.println("Average weight: " + getAverageWeight());
        System.out.println("colors: " + colorsV);
        System.out.println("__");
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
}
