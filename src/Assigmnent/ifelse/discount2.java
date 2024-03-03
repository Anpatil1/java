package Assigmnent.ifelse;

import java.util.Scanner;

public class discount2 {
    public static void main(String[] args) {

        // Ask user for quantity
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter the cost: ");
        int cost = scanner.nextInt();
        float discount = 0f;
        // Calculate total cost

        float totalCost = quantity * cost;
        System.out.println("Total cost is "+totalCost);
        if(totalCost>10000){
            discount =totalCost*0.1f;
        } else if (totalCost>10000 && totalCost<=20000) {
            discount =totalCost*0.2f;
        } else if (totalCost>20000 && totalCost<=30000) {
            discount =totalCost*0.3f;
        } else if (totalCost>30000 ) {
            discount =totalCost*0.4f;
        }
        float totalPayable = totalCost-discount;
        System.out.println("total discount availed = "+discount);
        System.out.println("total payable amount after discount = "+totalPayable);
    }
}