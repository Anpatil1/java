package Assigmnent.controlstatement;
import java.util.Scanner;
public class discount {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the quantity:");
            int quantity = scanner.nextInt();

            double costPerUnit = 100;
            double totalCost = quantity * costPerUnit;
            double discount = 0;

            if (quantity > 1000) {
                discount = totalCost * 0.1; // 10% discount for quantity more than 1000
                totalCost -= discount;
                System.out.println("Congratulations! You have received a 10% discount.");
            }

            System.out.println("Total cost: " + totalCost);
            System.out.println("Discount: " + discount);
        }
    }


