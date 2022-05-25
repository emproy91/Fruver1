package models;

/**
 * The necessary JDK classes are imported here.
 */
import java.util.ArrayList;

/**
 * Child class inherited from Product.
 */
public class Fruit extends Product {

    /**
     * This represents the color list of the fruit.
     */
    public ArrayList<String> colors;

    /**
     * Create a new instance of the Fruit class.
     * @param name Name of fruit.
     * @param averageWeight Weight average of fruit.
     * @param colors Color of fruit.
     */
    public Fruit(String name, float averageWeight, ArrayList<String> colors) {
        super(name, averageWeight);
        this.colors = colors;
    }

    /**
     * Create a new character string with the parameters of the parent class and this.
     * @return String array with data to show.
     */
    @Override
    public String toString() {
        return "Fruit {" +
                super.toString() +
                " colors = " + colors +
                '}';
    }
    /**
     * The following method to test and show the full Fruit instance in the console.
     * @param colors List of colors fetched from Main class.
     */
    public void showFruit(ArrayList<String> colors) {
        System.out.println("Name: " + name);
        System.out.println("Average weight: " + getAverageWeight());
        System.out.println("colors: " + colors);
        System.out.println("__");
    }

    /**
     * Access methods.
     * Setters and getters.
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
}
