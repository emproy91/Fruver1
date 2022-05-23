package models;

import java.util.ArrayList;

public abstract class Product {
    public String name;
    private float averageWeight;

    public Product(String name, float averageWeight) {
        super();
        this.name = name;
        this.averageWeight = averageWeight;
    }

    public Product() {
        super();
    }

    @Override
    public String toString() {
        return  "name= '" + name + '\'' +
                ", averageWeight= " + averageWeight ;
    }

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
