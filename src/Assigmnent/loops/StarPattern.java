package Assigmnent.loops;
//Assignment - 02
//Print the following patterns using loop :
//a.
//*
//**
//***
//****
public class StarPattern {
    public static void main(String[] args) {
        int row =4;
        for (int i = 1; i <=row ; i++) {

            for (int j = 1; j <=i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}
