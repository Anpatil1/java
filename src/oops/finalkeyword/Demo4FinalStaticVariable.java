package oops.finalkeyword;

public class Demo4FinalStaticVariable {
    //constants
    public static final String BANK_NAME;
    static {
        BANK_NAME= "SBI";
    }

    public static void main(String[] args) {
        //BANK_NAME = "HDFC";//CTE
        System.out.println(BANK_NAME);
    }
}