package Assigmnent.ifelse;
//- **Assignment - 03**
//    1. A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
//    2. Ask user for quantity
//    3. Suppose, one unit will cost 100.
//    4. Judge and print total cost for user.
import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        // Ask user for quantity
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter the cost: ");
        // Calculate total cost
        int unitCost = scanner.nextInt();
        int totalCost = quantity * unitCost;

        // Apply discount if total cost is more than 1000
        if (totalCost > 1000) {
            double discount = 0.1 * totalCost; // 10% discount
            System.out.println(" the discount is :"+discount);
            totalCost -= discount;
        }

        // Print total cost for the user
        System.out.println("Total cost: " + totalCost);
    }
}