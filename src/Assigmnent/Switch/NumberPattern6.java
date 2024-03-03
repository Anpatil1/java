package Assigmnent.Switch;
//Assignment - 13
//Write a program to print number pattern using switch statement.
//5
//45
//345
//2345
//12345
public class NumberPattern6 {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 1; i <=row; i++) {
            for (int j = row - i+1; j <=row ; j++) {
             switch (j){
                 case 1 :
                     System.out.print("1");
                     break;
                 case 2 :
                     System.out.print("2");
                     break;
                 case 3 :
                     System.out.print("3");
                     break;
                 case 4 :
                     System.out.print("4");
                     break;
                 case 5 :
                     System.out.print("5");
                     break;
                 default:
                     break;

             }

            }
            System.out.println();

        }

    }

}
