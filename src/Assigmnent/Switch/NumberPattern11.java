package Assigmnent.Switch;
//Assignment - 18
//Write a program to print number pattern using switch statement.
//1
//2 2
//3 3 3
//4 4 4 4
//5 5 5 5 5
public class NumberPattern11 {
    public static void main(String[] args) {
        int row =5;
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=i ; j++) {
                switch (i){
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
