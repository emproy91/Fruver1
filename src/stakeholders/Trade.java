package stakeholders;

/**
 * Here the necessary classes created are imported.
 */
import models.Product;

/**
 * The necessary JDK classes are imported here.
 */
import java.util.Date;

/**
 * Class inherited from BankAccount.
 */
public class Trade extends BankAccount{

    /**
     * Represents the state of the account status from the bank account class,
     * to generate sales check trade.
     */
    boolean bill = getActivated();

    /**
     * Represents the integer array of the Date library with the actual date.
     */
    Date dateTrade = new Date();

    /**
     * Represents the array of integers from the Date library converted to,
     * a string with the actual sale date.
     */
    public String dT = "Date Trade: " + (dateTrade.getYear() + 1900) + " "+ (dateTrade.getMonth() + 1 ) +
            " " + dateTrade.getDate() + " " + dateTrade.getHours() + ":" + dateTrade.getMinutes() + ":" + dateTrade.getSeconds() + " ";

    /**
     * Create a new instance of the Trade class.
     */
    public Trade(int accountNumber) {
        super(accountNumber, activated);
    }

    /**
     * The following method to test and show the entire Trade instance in
     * the console, only if the bill is true.
     */
    public void showTrade() {
        if (bill){
            System.out.println("|________Fruver Colombia_______|");
            System.out.println("|      Nit: 62442654-3         |");
            System.out.println("| Street 24 No 14 - 22 Alameda |");
            System.out.println("|" + dT + "|");
            System.out.println("|" + Product.un + " units free have been added |");
            System.out.println("| to your account " + getAccountNumber() + "    |");
            System.out.println("|Successful transaction, come |");
            System.out.println("| back soon, thank you for    |");
            System.out.println("|      preferring us. <3      |");

        } else {
            System.out.println("Sorry, your transaction could not be completed.");
        }
            System.out.println("_______________________________");
    }
}
