package Problem3;

public class SavingsAccount extends Account {
    private double interestRate; 

    public SavingsAccount(int a, double r) {
        super(a);
        this.interestRate=r;
    }

    public void addInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
    }

    @Override
    public String toString() {
        return super.toString() + ", Interest: " + interestRate + "%";
    }
}
