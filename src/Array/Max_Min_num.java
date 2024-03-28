package Array;

public class Max_Min_num {
    public static void main(String[] args) {


        int arr[] = {10, 20, 30, 40, 50};
        int max=arr[0];
        int min=arr[0];
        for (int index = 0; index < arr.length ; index++) {
            if (arr[index]>max) {
                max=arr[index];
            }
            if (arr[index]<min) {
                min=arr[index];
            }


        }
        System.out.println("maximum number is" +max);
        System.out.println("minimum number is" +min);
    }
}