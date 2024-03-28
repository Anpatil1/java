package Array;

import lombok.ToString;


public class arrayCopy {
    public static void main(String[] args) {
        int oldArray [] ={1,2,3,4,5,6,7,8,9};
        int newArray [] =new int[oldArray.length];

        for (int i = 0; i < oldArray.length; i++) {
            newArray[i]=oldArray[i];

        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]);

            if (i < newArray.length - 1) {
                System.out.print(" , ");
            }


        }
    }
}
