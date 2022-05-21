package stakeholders;

import java.util.ArrayList;

public class Fruit {

    public String name;
    public float averageWeight;
    public ArrayList <String> colors;

    public void showFruit(ArrayList<String> colors) {
        System.out.println("Name: " + name);
        System.out.println("Average weight: " + averageWeight);
        System.out.println("colors: " + colors);
        System.out.println("__");
    }

}