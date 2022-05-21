package stakeholders;

// import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

    public static int iD;
    public String name;
    private String lastName1;
    private String lastName2;
    float height;
    Date dateBirth;

    // Constructor.
    public Person(int idp, String n, String ln1, String ln2, float h, Date db){
        this.iD = idp;
        this.name = n;
        this.lastName1 = ln1;
        this.lastName2 = ln2;
        this.height = h;
        this.dateBirth = db;
    }

    private int showAge () {

        // Date birth = dateBirth;
        Date actual = new Date();
        System.out.println(actual);
        int yActual = actual.getYear();
        int yBirth = dateBirth.getYear();
        int age = 0;
        if (yBirth >= 2000) {
            age = yActual - yBirth -1900;
        }else {
            age = yActual - yBirth;
        }
        return age;
    }

    public void showPerson() {
        System.out.println("Identification number: " + iD);
        System.out.println("Name: " + name);
        System.out.println("First last name: " + lastName1);
        System.out.println("Second last name: " + lastName2);
        System.out.println("Birth date: " + dateBirth);
        System.out.println("Height [m]: " + height);
        System.out.println("Age: " + showAge());
        System.out.println("__");

    }
    public static int getiD() {
        return iD;
    }
}
