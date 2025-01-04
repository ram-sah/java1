import java.util.Scanner;

public class DetermineNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Application to determine number type \n");

        System.out.print("Enter a number: ");
        try {
            double num = input.nextDouble();
            {
                if (num > 0) {
                    System.out.println("This is a positive number: " + num);
                } else if (num < 0) {
                    System.out.println("This is a negative number: " + num);
                } else {
                    System.out.println("This is zero: " + num);
                }
            }
        } catch (Exception e) {
            System.out.println("enter valid number: ");
        }
        input.close(); // Close the scanner to avoid resource leaks
    }
}
