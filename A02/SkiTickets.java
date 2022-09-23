/*****************************************
 * Author: Elli
 * Date:   2/1/2020
 * Assignment: A02 - Ski Tickets
 *****************************************/

// Import Scanner class
import java.util.Scanner;

public class SkiTickets
{
   public static void main(String[] args)
   {

      // Create a new Scanner object
      Scanner input = new Scanner(System.in);

      // Initialize variables for ticket types
      int numTicketsAdult;
      int numTicketsYouth;

      // Initialize variables for ticket costs
      double adultTicketCost = 93.00;
      double youthTicketCost = 47.00;

      // Initialize variable for name
      String customerName;

      // Request number of adult tickets
      System.out.print("Enter the number of adult tickets: ");
      numTicketsAdult = input.nextInt();
      input.nextLine(); // Consume newline

      // Request number of youth tickets
      System.out.print("Enter the number of youth tickets: ");
      numTicketsYouth = input.nextInt();
      input.nextLine(); // Consume newline

      // Request customer name
      System.out.print("Enter the customer's name: ");
      customerName = input.nextLine();

      // Calculate invoice totals
      double adultTicketTotal = numTicketsAdult * adultTicketCost;
      double youthTicketTotal = numTicketsYouth * youthTicketCost;
      double invoiceTotal = adultTicketTotal + youthTicketTotal;

      // Print output of invoice
      System.out.printf("Number of adult tickets: %d%n", numTicketsAdult);
      System.out.printf("Number of youth tickets: %d%n", numTicketsYouth);
      System.out.printf("Name: %s%n%n%n", customerName);
      System.out.printf("Invoice for %s:%n%n", customerName);
      System.out.printf("Adult tickets %-3d..%2s%7.2f%n", numTicketsAdult, "$", adultTicketTotal);
      System.out.printf("Youth tickets %-3d..%2s%7.2f%n", numTicketsYouth, "$", youthTicketTotal);
      System.out.printf("----------------------------%n");
      System.out.printf("%21s%7.2f%n", "$", invoiceTotal);
      System.out.printf("%28s", "========");

   }
}