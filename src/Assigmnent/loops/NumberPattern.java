package Assigmnent.loops;
//Assignment - 04
//Print the pattern
//
//1010101
// 10101
//  101
//   1
public class NumberPattern {
    public static void main(String[] args) {
        int row =4;
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 *(row-i )-1); k++) {
                if ( k % 2 ==0){
                    System.out.print("1");
                }else{System.out.print("0");}


            }
            System.out.println();

        }
    }
}


