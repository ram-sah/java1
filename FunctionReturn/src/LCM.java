import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to find the LCM on number ");
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second number: ");
        int num2 = input.nextInt();
        int lcm = findLcm(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);
    }

    public static int findLcm(int num1, int num2) {
        int i = 1;
        while (true) {
            int factor = num1 * i;
            if (factor % num2 == 0) {
                return factor;
            }
            i++;
        }
    }
}
