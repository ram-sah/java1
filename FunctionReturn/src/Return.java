import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        greet();
        sum();
    }

    // Calculate the number
    public static void sum() {
        int num1 = readNumber();
        int num2 = readNumber();
        int sum = num1 + num2;
        System.out.print(" Total is : " + sum);
    }

    //    get number from user
    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        return num;
    }

    public static void greet() {
        System.out.println("Welcome to Sum application:");

    }

}