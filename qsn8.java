import java.util.Scanner;

public class qsn8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the number of units consumed: ");
        
        int unitsConsumed = input.nextInt();
        double totalBill;
        

     
        if (unitsConsumed <= 50) {
            totalBill = unitsConsumed * 3.00;
        } else if (unitsConsumed <= 200) {
            totalBill = (50 * 3.00) + ((unitsConsumed - 50) * 4.80);
        } else if (unitsConsumed <= 400) {
            totalBill = (50 * 3.00) + (150 * 4.80) + ((unitsConsumed - 200) * 5.80);
        } else {
            totalBill = (50 * 3.00) + (150 * 4.80) + (200 * 5.80) + ((unitsConsumed - 400) * 6.20);
        }

        System.out.printf("Your total bill amount is: ₹", totalBill);

        
        System.out.print("Do you want to pay online? (yes/no): ");
        String onlinePayment = input.next().toLowerCase();

        if (onlinePayment.equals("yes")) {
            double discount = totalBill * 0.03;
            double finalBill = totalBill - discount;
            System.out.printf("You received a 3%% discount of: ₹", discount);
            System.out.printf("Your final bill amount after discount is: ₹", finalBill);
        } else {
            System.out.printf("No discount applied. Your bill remains: ₹", totalBill);
        }

        input.close();
    }
}
