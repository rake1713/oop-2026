package Problem3;

public class Account {
    private double balance; 
    private int accNumber; 

    public Account(int a) {
        this.accNumber = a; 
        this.balance = 0.0; 
    }

    public void deposit(double sum) { 
        if (sum > 0) balance += sum; 
    }
    public void withdraw(double sum) { 
        if (sum > 0 && balance >= sum) balance -= sum; 
    } 
    public double getBalance() { 
        return balance; 
    } 
    public int getAccountNumber() { 
        return accNumber; 
    } 

    public void transfer(double a, Account other) {
        if (a <= balance) {
            this.withdraw(a);
            other.deposit(a);
        }
    }

    @Override
    public String toString() {
        return "Account " + accNumber + ": Balance = " + balance;
    } 

    public final void print() {
        System.out.println(toString());
    } 
}