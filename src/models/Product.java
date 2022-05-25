package models;

/**
 * Represents a government-granted transaction.
 * @author Mauricio Pérez.
 */

public abstract class Product {
    /**
     * This is the parent class of products available at the government benefit.
     * @param un Generated units counter.
     */
    public String name;
    private float averageWeight;

    public static int un;

    /**
     * Create a new instance of the Product class.
     * @param name Name of product.
     * @param averageWeight Weight average of product.
     */
    public Product(String name, float averageWeight) {
        super();
        this.name = name;
        this.averageWeight = averageWeight;
        un ++;
    }

    /**
     * Create a new character string with the parameters of the class.
     * @return String array with data.
     */
    public String toString() {
        return  "name= '" + name + '\'' +
                ", averageWeight= " + averageWeight + " Kg,";
    }

    /**
     * Access methods.
     * Setters and getters.
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

}
