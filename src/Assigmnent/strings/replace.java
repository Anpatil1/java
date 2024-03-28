package Assigmnent.strings;

public class replace {
    public static void main(String[] args) {
        String str ="Avadhut";
        for (int i = 0; i < str.length(); i++) {
            if (i!=0){
                System.out.print("  *  ");
        }
            //charAt  method
            System.out.print(str.charAt(i)+"");

        }
    }
}
