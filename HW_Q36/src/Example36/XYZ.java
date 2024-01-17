package Example36;

import java.util.Scanner;

public class XYZ {
	
	// Method to find Pid of the product with the highest price
    private static int HPrice(Product[] products) {
    	
        int maxPid = -1;
        double maxPrice = Double.MIN_VALUE;

        for (Product product : products) {
            if (product.price > maxPrice) {
                maxPrice = product.price;
                maxPid = product.pid;
            }
        }

        return maxPid;
    }


    // Method to calculate total amount spent on all products
    private static double TotalAmount(Product[] products) {
        double totalAmount = 0;

        for (Product product : products) {
            totalAmount += product.price * product.quantity;
        }

        return totalAmount;
    }
    
    public static void main(String[] args) {

    	Scanner scanner = new Scanner(System.in);

        Product[] products = new Product[5];

        // Accept five product information from the user
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter PID: ");
            int pid = scanner.nextInt();
            System.out.print("Enter Price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter Quantity: ");
            int quantity = scanner.nextInt();

            // Create and store Product object in the array
            products[i] = new Product(pid, price, quantity);
        }

        // Find PId of the product with the highest price
        int maxPid = HPrice(products);
        System.out.println("PID with highest price: " + maxPid);

        // Calculate and display the total amount spent on all products
        double totalAmountSpent = TotalAmount(products);
        System.out.println("Total amount: " + totalAmountSpent);

        // Close the scanner
        scanner.close();
    }

    
    
   
}