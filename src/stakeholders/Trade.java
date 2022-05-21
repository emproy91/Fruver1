package stakeholders;

import java.util.Date;

public class Trade {

    Date dateTrade;
    int units;
    float price;
    float total;
    boolean fact;

    public void showTrade() {
        System.out.println("Date trade: " + dateTrade);
        System.out.println("Units: " + units);
        System.out.println("Price: " + price);
        System.out.println("Total: " + total);
        if ( fact == true ){
            System.out.println("Successful transaction, come back soon, thank you for preferring us. <3 ");
        } else {
            System.out.println("Sorry, your transaction could not be completed, please try again.");
        }
        System.out.println("__");
    }
}
