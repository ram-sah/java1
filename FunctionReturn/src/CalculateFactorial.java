import java.util.Scanner;

public class CalculateFactorial {
    public static void main(String[] args) {
        System.out.println("Welcome to Factorial calculation");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        long num = input.nextLong();
        long result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }

    public static long factorial(long num) {
        long fact = 1;
        int i = 1;
        while (i <= num) {
            fact *=  i;
            i++;
        }
        return fact;
    }
}
