package stakeholders;

/**
 * The necessary JDK classes are imported here.
 */
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

/**
 * It represents person and their data, being benefited by the government.
 * @author Mauricio Pérez.
 */
public class Person {

    /**
     * Represents Identification number of Person.
     */
    public int iD;

    /**
     * Represents name of Person.
     */
    public String name;

    /**
     * Represents First last name of Person.
     */
    public String lastName1;

    /**
     * Represents Second last name of Person.
     */
    public String lastName2;

    /**
     * Height [m] of Person.
     */
    public float height;

    /**
     * Birthdate of Person.
     */
    public Date dateBirth;

    // Constructor.

    /**
     * Create a new instance of the Person class.
     * @param idp Identification number to new Person.
     * @param n Name to new person.
     * @param ln1 First last name to new Person.
     * @param ln2 Second last name to new Person.
     * @param h Height in meters to new Person.
     * @param db Birthdate to new Person.
     */
    public Person(int idp, String n, String ln1, String ln2, float h, Date db){
        this.iD = idp;
        this.name = n;
        this.lastName1 = ln1;
        this.lastName2 = ln2;
        this.height = h;
        this.dateBirth = db;
    }

    /**
     * The following function compares birthdate than actual date.
     * @return Actual age at new person.
     */
    private int showAge () {

        Date actual = new Date();
        // System.out.println(actual);
        int yActual = actual.getYear();
        int yBirth = dateBirth.getYear();
        int age;
        if (yBirth >= 2000) {
            age = yActual - yBirth -1900;
        }else {
            age = yActual - yBirth;
        }
        return age;
    }

    /**
     * The following method to test and show the entire Person instance in
     * the console, only if the user requires it.
     */
    public void showPerson() {
        Scanner see = new Scanner(System.in);
        String show;

        System.out.println("Do you want to see your information in the system?");
        System.out.println("Press Y to view or N to finish and enter key:");
        show = see.next();
        if ((Objects.equals(show, "y")) || (Objects.equals(show, "Y"))) {
            System.out.println("Identification number: " + iD);
            System.out.println("Name: " + name);
            System.out.println("First last name: " + lastName1);
            System.out.println("Second last name: " + lastName2);
            System.out.println("Birth date: " + dateBirth);
            System.out.println("Height [m]: " + height);
            System.out.println("Age: " + showAge());
            System.out.println("__");
            System.out.println("Thank you for visit Fruver Colombia");
            System.out.println("__");
        }else {
            System.out.println("__");
            System.out.println("Thank you for visit Fruver Colombia");
            System.out.println("__");
        }
    }

    /**
     * Access methods.
     * Setters and getters.
     */

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
