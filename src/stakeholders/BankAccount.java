package stakeholders;

/**
 * Represents a government Muisca bank account transaction.
 * @author Mauricio Pérez.
 */
public class BankAccount {

    private int accountNumber;
    protected static boolean activated;

    /**
     * Create a new instance of the BankAccount class.
     * @param accountNumber Identification number of the bank account.
     * @param activated Bank account status.
     */
    public BankAccount(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }

    /**
     * The following method to test and show the full BankAccount instance in the console.
     */
    public void showAccount() {
        System.out.println("Number: " + accountNumber);
        System.out.println("Is active? : " + activated);
        System.out.println("__");
    }

    /**
     * Access methods.
     * Setters and getters.
     */
    public boolean getActivated() {
        return activated;
    }

    public static void setActivated(boolean activated) {
        BankAccount.activated = activated;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
