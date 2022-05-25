package models;

/**
 * The necessary JDK classes are imported here.
 */
import java.util.ArrayList;

/**
 * Child class inherited from Product.
 */
public class Vegetable extends Product {

    /**
     * This represents the color list of the vegetable.
     */
    public ArrayList<String> colors;

    /**
     * Create a new instance of the vegetable class.
     * @param name Name of vegetable.
     * @param averageWeight Weight average of vegetable.
     * @param colors Color of vegetable.
     */
    public Vegetable(String name, float averageWeight, ArrayList<String> colors) {
        super(name, averageWeight);
        this.colors = colors;
    }

    /**
     * Create a new character string with the parameters of the parent class and this.
     * @return String array with data to show.
     */
    @Override
    public String toString() {
        return "Vegetable {" +
                super.toString() +
                " colors = " + colors +
                '}';
    }

    /**
     * The following method to test and show the entire Vegetable instance in the console.
     * @param colorsV List of colors fetched from Main class.
     */
    public void showVegetable(ArrayList<String> colorsV) {
        System.out.println("Name: " + name);
        System.out.println("Average weight: " + getAverageWeight());
        System.out.println("colors: " + colorsV);
        System.out.println("__");
    }

}

