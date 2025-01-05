import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum of digit app");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        int result = sumOfNum(num);
        System.out.println("Sum of number " + num + " is: " + result);
    }

    public static int sumOfNum(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }
}
