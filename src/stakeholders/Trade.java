package stakeholders;

import models.Product;

import java.util.Date;

public class Trade extends BankAccount{

    boolean fact = getActivated();
    Date dateTrade = new Date();
    public String dT = "Date Trade: " + (dateTrade.getYear() + 1900) + " "+ (dateTrade.getMonth() + 1 ) +
            " " + dateTrade.getDate() + " " + dateTrade.getHours() + ":" + dateTrade.getMinutes() + ":" + dateTrade.getSeconds() + " .";

    public Trade(int accountNumber) {
        super(accountNumber, activated);
    }

    public void showTrade() {
        if (fact){
            System.out.println("|________Fruver Colombia_______|");
            System.out.println("|      Nit: 62442654-3         |");
            System.out.println("| Street 24 No 14 - 22 Alameda |");
            System.out.println("| " + dT + "|");
            System.out.println("|" + Product.un + " units free have been added |");
            System.out.println("|to your account " + getAccountNumber() + "    |");
            System.out.println("|Successful transaction, come |");
            System.out.println("|back soon, thank you for");
            System.out.println("|      preferring us. <3      |");

        } else {
            System.out.println("Sorry, your transaction could not be completed, please try again.");
        }
            System.out.println("_______________________________");
    }
}
