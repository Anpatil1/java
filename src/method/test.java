package method;

public class test {
    public static void main(String[] args) {
        Bank bank = new Bank();
        // Test deposit method
        bank.deposit(100.0);
        bank.deposit(200.0, "123456");

        // Test withdraw method
        bank.withdraw(50.0);
        bank.withdraw(75.0, "654321");

        // Test transfer method
        //bank.transfer(50.0, "123456", "654321");
    }
}
