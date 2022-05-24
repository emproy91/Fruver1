package stakeholders;
public class BankAccount {

    private int accountNumber;
    protected static boolean activated;


    public BankAccount(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }

    public void showAccount() {
        System.out.println("Number: " + accountNumber);
        System.out.println("Is active? : " + activated);
        System.out.println("__");
    }
    public boolean getActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
