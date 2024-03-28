package Array;

public class Array_reverseNum {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int left = 0;
        int right = arr.length - 1;


        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index]+"  ");
        }

    }
}
