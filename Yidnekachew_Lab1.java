/*
 * Name: 
 * Purpose: 
 * Programmer: Biruk Yidnekachew
 * Date: 8 September 2025
 */

 // Imports Scanner for input
import java.util.Scanner;

public class Yidnekachew_Lab1 {
    public static void main(String[] args){
        // Declares Scanner object
        Scanner keyboard = new Scanner(System.in);
      
        // Declares variable which will contain user input of letter
        String customer1Name;
        int customer1Age;
        double customer1Charge;
        String customer2Name;
        int customer2Age;
        double customer2Charge;
        String customer3Name;
        int customer3Age;
        double customer3Charge;
        
        // Assigns value to letter variable based on user input
            System.out.print("Enter customer 1's last name: ");
            customer1Name = keyboard.next();
            System.out.print("Enter Mx." + customer1Name + "'s age: ");
            customer1Age = keyboard.nextInt();
            System.out.print("\nEnter customer 2's last name: ");
            customer2Name = keyboard.next();
            System.out.print("Enter Mx." + customer2Name + "'s age: ");
            customer2Age = keyboard.nextInt();
            System.out.print("\nEnter customer 3's last name: ");
            customer3Name = keyboard.next();
            System.out.print("Enter Mx." + customer3Name + "'s age: ");
            customer3Age = keyboard.nextInt();

        // CoMmEnT
        System.out.print("\n\nCustomer 1 Last Name: " + customer1Name + "\nCustomer 1 Age: " + customer1Age);
        if (customer1Age >= 0 && customer1Age <= 5){
            customer1Charge = 0;
            System.out.print("\nCustomer 1 Ticket Price: FREE");
        } else if (customer1Age >= 6 && customer1Age <=12) {
            customer1Charge = 5;
            System.out.print("\nCustomer 1 Ticket Price: $5");
        } else if (customer1Age >= 13 && customer1Age <=17) {
            customer1Charge = 8;
            System.out.print("\nCustomer 1 Ticket Price: $8");
        } else if (customer1Age >= 18 && customer1Age <=59) {
            customer1Charge = 12;
            System.out.print("\nCustomer 1 Ticket Price: $12");
        } else {
            customer1Charge = 6;
            System.out.print("\nCustomer 1 Ticket Price: $6");
        }
        System.out.print("\n\nCustomer 2 Last Name: " + customer2Name + "\nCustomer 2 Age: " + customer2Age);
        if (customer2Age >= 0 && customer2Age <= 5){
            customer2Charge = 0;
            System.out.print("\nCustomer 2 Ticket Price: FREE");
        } else if (customer2Age >= 6 && customer2Age <=12) {
            customer2Charge = 5;
            System.out.print("\nCustomer 2 Ticket Price: $5");
        } else if (customer2Age >= 13 && customer2Age <=17) {
            customer2Charge = 8;
            System.out.print("\nCustomer 2 Ticket Price: $8");
        } else if (customer2Age >= 18 && customer2Age <=59) {
            customer2Charge = 12;
            System.out.print("\nCustomer 2 Ticket Price: $12");
        } else {
            customer2Charge = 6;
            System.out.print("\nCustomer 2 Ticket Price: $6");
        }
        System.out.print("\n\nCustomer 3 Last Name: " + customer3Name + "\nCustomer 3 Age: " + customer3Age);
        if (customer3Age >= 0 && customer3Age <= 5){
            customer3Charge = 0;
            System.out.print("\nCustomer 3 Ticket Price: FREE");
        } else if (customer3Age >= 6 && customer3Age <=12) {
            customer3Charge = 5;
            System.out.print("\nCustomer 3 Ticket Price: $5");
        } else if (customer3Age >= 13 && customer3Age <=17) {
            customer3Charge = 8;
            System.out.print("\nCustomer 3 Ticket Price: $8");
        } else if (customer3Age >= 18 && customer3Age <=59) {
            customer3Charge = 12;
            System.out.print("\nCustomer 3 Ticket Price: $12");
        } else {
            customer3Charge = 6;
            System.out.print("\nCustomer 3 Ticket Price: $6");
        }

        // CoMeNt
        System.out.print("\n\n\n---Calculations---\n");
        System.out.printf("Subtotal: $%.2f\nTotal Charge: $%.2f",(customer1Charge + customer2Charge + customer3Charge), ((customer1Charge + customer2Charge + customer3Charge) * 1.05));
    }
}