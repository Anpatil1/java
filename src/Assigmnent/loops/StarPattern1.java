package Assigmnent.loops;

//Assignment - 03
//Print the following patterns using loop :
//	*
// ***
//*****
// ***
//  *
        public class StarPattern1 {
            public static void main(String[] args) {
                int rows = 3;

                // Print upper part of the pattern
                for (int i = 0; i < rows; i++) {
                    // Print spaces
                    for (int j = 0; j < rows - i - 1; j++) {
                        System.out.print(" ");
                    }
                    // Print asterisks
                    for (int k = 0; k < 2 * i + 1; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                // Print lower part of the pattern
                for (int i = rows - 2; i >= 0; i--) {
                    // Print spaces
                    for (int j = 0; j < rows - i - 1; j++) {
                        System.out.print(" ");
                    }
                    // Print asterisks
                    for (int k = 0; k < 2 * i + 1; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }

    
