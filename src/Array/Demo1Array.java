package Array;

import java.util.Scanner;
//search element
public class Demo1Array {
    public static void main(String[] args) {
        int arr1[] ={10,20,30,40};
        int arr2[] ={10,20,30,50};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter key is");
        int key = sc.nextInt();
        boolean isFound=false;
        for (int index = 0; index < arr1.length; index++) {
            if (arr1[index]==key) {
                isFound=true;
                break;
            }
        }
        System.out.println(isFound ? "Found":"Not Found");
    }
}
