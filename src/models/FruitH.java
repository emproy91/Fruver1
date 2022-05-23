package models;

import java.util.ArrayList;

public class FruitH extends Product {

    public ArrayList<String> colors;

    public FruitH(String name, float averageWeight, ArrayList<String> colors) {
        super(name, averageWeight);
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "FruitH{" +
                super.toString() +
                " colors= " + colors +
                '}';
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
}
