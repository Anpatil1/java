package method;

public class Bank {
    public void deposit(double amount){
        System.out.println("Depositing $"+amount);
    }
    public void deposit(double amount,String accountNumber){

        System.out.println("Depositing $" + amount + " into account " + accountNumber);

    }
    public void  withdraw(double amount){
        System.out.println("Withdraw $"+amount);
    }
    public void withdraw(double amount,String accountNumber){
        System.out.println("Withdraw $"+amount + "into " + accountNumber);
    }
}
