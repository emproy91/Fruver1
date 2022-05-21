package stakeholders;

import java.util.ArrayList;

public class Vegetable {
    public String name;
    public float averageWeight;
    ArrayList<String> colorsV;

    public void showVegetable(ArrayList<String> colorsV) {
        System.out.println("Name: " + name);
        System.out.println("Average weight: " + averageWeight);
        System.out.println("colors: " + colorsV);
        System.out.println("__");
    }
}

