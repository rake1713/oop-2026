package Problem3;
import java.util.Vector;

public class Bank {
    private Vector<Account> accounts;

    public Bank() {
        this.accounts = new Vector<>();
    }

    public void openAccount(Account a) {
        if (a != null) {
            accounts.add(a);
            System.out.println("Account " + a.getAccountNumber() + " has been opened.");
        }
    }    

    public void closeAccount(Account a) {
        if (accounts.contains(a)) {
            accounts.remove(a);
            System.out.println("Account " + a.getAccountNumber() + " has been closed.");
        } else {
            System.out.println("Account not found in the system.");
        }
    }

    public Vector<Account> getAccounts() {
        return accounts;
    }
    public void update() {
        for (Account a : accounts) {
            if (a instanceof SavingsAccount) {
                ((SavingsAccount) a).addInterest();
            } else if (a instanceof CheckingAccount) {
                ((CheckingAccount) a).deductFee();
            }
        }
    }
}