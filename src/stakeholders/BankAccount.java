package stakeholders;
public class BankAccount {

    private int accountNumber;
    protected boolean activated;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean getActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public void showAccount() {
        System.out.println("Number: " + accountNumber);
        System.out.println("Is active? : " + activated);
        System.out.println("__");

    }
}
