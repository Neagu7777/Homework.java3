import java.util.*;

public class Convector {
    public static void main(String[] args) {
        int choice;
        double amount;
        double dollar, euro;

        Scanner sc = new Scanner(System.in);

        System.out.println("Options:");
        System.out.println("Enter 1: Dollar");
        System.out.println("Enter 2: Euro");
        // добавить опцию 4й валюты

        System.out.println("\nChoose your option: ");
        choice = sc.nextInt();
        System.out.println("Your number is: " + choice);

        System.out.println("Enter the amount you want to convert?");
        amount = sc.nextFloat();
        System.out.println("Your amount is: " + amount);

        switch (choice) {
            case 1: // Dollar Conversion
                euro = amount * 1.06;
                System.out.println(amount + " Dollar = " + euro + " Euro");
                break;


            case 2: // Euro Conversion
                dollar = amount * 0.98;
                System.out.println(amount + " Euro = " + dollar + " Dollar");
                break;

            // добавить обработку ввода "case 4"

            // Default case
            default:
                System.out.println("Invalid input");
        }
    }
}