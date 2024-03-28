package Array;

public class SumOfElements {
    public static void main(String[] args) {
        int array[]={10,20,30,40,50};
        int SumOfElements=0;
        for (int i = 0; i < array.length ; i++) {
            SumOfElements=SumOfElements+array[i];

            System.out.println(SumOfElements);
        }

    }
}
