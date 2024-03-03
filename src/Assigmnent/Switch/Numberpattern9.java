package Assigmnent.Switch;
//Write a program to print number pattern using switch statement.
//12345
//23456
//34567
//45678
//56789
public class Numberpattern9 {
    public static void main(String[] args) {
        int row =5;
        for (int i = 1; i <=row ; i++) {
            for (int j = i; j <=i +4 ; j++) {
                switch(j){
                    case 1:
                        System.out.print("1");
                        break;
                    case 2:
                        System.out.print("2");
                        break;
                    case 3:
                        System.out.print("3");
                        break;

                    case 4:
                        System.out.print("4");
                        break;
                    case 5:
                        System.out.print("5");
                        break;
                    case 6:
                        System.out.print("6");
                        break;
                    case 7:
                        System.out.print("7");
                        break;
                    case 8:
                        System.out.print("8");
                        break;
                    case 9:
                        System.out.print("9");
                        break;
                    default:
                        break;
                }

            }
            System.out.println();
            
        }
    }
}
