package Assigmnent.loops;
//Assignment - 03
//Print the following patterns using loop :
//	*
// ***
//*****
// ***
//  *
public class StarPattern2 {
    public static void main(String[] args) {
        int row =3;
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < row -i-1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
