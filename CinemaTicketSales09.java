import java.util.Scanner;
public class CinemaTicketSales09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalTicketsSold = 0;
        double totalSales = 0;
        double ticketPrice = 50000;
        double discount = 0;
        while (true) {
            System.out.print("Enter the number of tickets sold: ");
            int ticketsSold = scanner.nextInt();
            if (ticketsSold < 0) {
                System.out.println("Invalid input. Please enter a non-negative number.");
                continue;
            }
            if (ticketsSold > 10) {
                discount = 0.15;
            } else if (ticketsSold > 4) {
                discount = 0.1;
            }
            double ticketCost = ticketPrice * (1 - discount);
            double totalCost = ticketsSold * ticketCost;
            totalTicketsSold += ticketsSold;
            totalSales += totalCost;
            System.out.println("Total sales for this transaction: Rp " + totalCost);

            System.out.print("Do you want to continue? (yes/no): ");
            String continueInput = scanner.next();
            if (continueInput.equalsIgnoreCase("yes")) {
                break;
            }
        }
        System.out.println("\nTotal tickets sold: " + totalTicketsSold);
        System.out.println("Total sales for the day: Rp " + totalSales);
    }
}