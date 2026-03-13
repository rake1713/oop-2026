package Problem3;

public class Tester {
    public static void main(String[] args) {
        Bank bank = new Bank();
        SavingsAccount savings = new SavingsAccount(101, 10.0);
        CheckingAccount checking = new CheckingAccount(202);   
        bank.openAccount(savings);
        bank.openAccount(checking);

        savings.deposit(1000.0);
        checking.deposit(500.0);


        checking.withdraw(100.0); 
        checking.deposit(50.0);   
        checking.withdraw(20.0);  
        checking.withdraw(10.0);  
        checking.withdraw(10.0); 
        
        System.out.println("Checking balance before update: " + checking.getBalance());

        savings.transfer(200.0, checking);
        System.out.println("Savings after transfer: " + savings.getBalance());
        System.out.println("Checking after transfer: " + checking.getBalance());

        bank.update();

        savings.print(); 
        checking.print();
        
        bank.closeAccount(savings);
    }
}
