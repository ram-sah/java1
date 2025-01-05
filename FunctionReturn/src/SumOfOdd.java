import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum of Odd numbers");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int oddResult = oddNumSum(num);
        int evenResult = evenNum(num);
        System.out.println("The sum of odd num from 1 to " + num + " is: " + oddResult);
        System.out.println("The sum of Even num from 1 to " + num + " is: " + evenResult);

    }
    // sum of odd numbers
    public static int oddNumSum(int num) {
        int i = 1;
        int oddSum = 0;
        while (i <= num) {
            if (i % 2 != 0) {
                oddSum += i;
            }
            i++;
        }
        return oddSum;
    }
    //    sum of even numbers
    public static int evenNum(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i+=2) {
            sum += i;
        }
        return sum;
    }
}